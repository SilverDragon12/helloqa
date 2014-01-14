package edu.cmu.lti.oaqa.openqa.dso.extractor;

import java.util.ArrayList;
import java.util.List;

import edu.cmu.lti.oaqa.openqa.dso.data.AnswerCandidate;
import edu.cmu.lti.oaqa.openqa.dso.data.RetrievalResult;
import edu.cmu.lti.oaqa.openqa.dso.data.SupportingEvidenceArg;
import edu.cmu.lti.oaqa.openqa.dso.scorer.AnswerCandidateScorer;

public class LeafEphyraMainType extends CandidateExtractorByAnswerType {

	public LeafEphyraMainType(SupportingEvidenceArg arg) {
		super(arg);
	}

	@Override
	public List<AnswerCandidate> getAnswerCandidates(SupportingEvidenceArg arg) {
		List<AnswerCandidate> candidates = new ArrayList<AnswerCandidate>();

		// get IDs of taggers for most specific NE type that can be tagged
		List<int[]> nePatterns = getNEType(arg.getAnswerType());

		int rank = 1;
		for (RetrievalResult document : arg.getPassages()) {
			// split search result into sentences and tokenize sentences
			String documentText = document.getText().replace(" ... ", " ! ");

			// get refined sentence
			String[] sentences = detectSentences(documentText);

			arg.setPsg(document.getDocID(), sentences);

			tokens = getTokens(sentences);
			if (nePatterns.size() > 0) {
				nes = extractCandidatesUsingPatterns(
						nePatterns.get(nePatterns.size() - 1), sentences);
			}

			if (arg.getAnswerType().toLowerCase()
					.contains("NETerroristOrganization".toLowerCase())) {
				nes = getMatchOntology(sentences, nes, TerroristOrgOntologyList);
			} else if (arg.getAnswerType().toLowerCase()
					.contains("NEnumber".toLowerCase())) {
				nes = getMatchOntology(sentences, nes, NumberOntologyList);
			} else if (arg.getAnswerType().toLowerCase()
					.contains("NEterrorist".toLowerCase())) {
				nes = getMatchOntology(sentences, nes, TerroristOntologyList);
			}

			List<AnswerCandidate> currentCandidates = AnswerCandidateScorer
					.getAnswerCandidates(arg, getTypeName(), nes, rank);
			for (AnswerCandidate candidate : currentCandidates) {
				candidate.addRetrievalResult(document);
			}

			candidates.addAll(currentCandidates);
			rank++;
		}

		return candidates;
	}

	@Override
	public String getTypeName() {
		return "ephyra_main_type";
	}

}
