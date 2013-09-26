package edu.cmu.lti.oaqa.openqa.dso.extractor;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.List;

import edu.cmu.lti.oaqa.openqa.dso.data.AnswerCandidate;
import edu.cmu.lti.oaqa.openqa.dso.data.InfoBoxResult;
import edu.cmu.lti.oaqa.openqa.dso.data.RetrievalResult;
import edu.cmu.lti.oaqa.openqa.dso.data.SupportingEvidenceArg;
import edu.cmu.lti.oaqa.openqa.dso.xmiretriever.infobox.MyResponseCache;

public class LeafInfoBoxBased extends CandidateExtractorBase {

	static {
		ResponseCache.setDefault(new MyResponseCache());
	}

	public LeafInfoBoxBased(SupportingEvidenceArg arg) {
		super(arg);
	}

	public List<String> getAnswerCandidates(List<String> keyterms,
			String answerType) {

		List<String> candidates = new ArrayList<String>();
		List<String> incidentLs = getIncidentByKeyterms(keyterms);
		for (String incident : incidentLs) {
			incident = incident.replaceAll(" ", "_");
			String infoText = InfoBoxResult.getInfoBoxRawText(incident);
			InfoBoxResult infoBox = new InfoBoxResult(infoText, incident);
			matchAnswerCandidatesByInfoBox(infoBox, answerType, candidates);
		}

		return candidates;
	}

	private static void matchAnswerCandidatesByInfoBox(InfoBoxResult infoBox,
			String answerType, List<String> candidates) {
		if (answerType.contains("NElocation")) {
			// location, target
			candidates.add(infoBox.getTarget());
			candidates.add(infoBox.getLocation());
		} else if (answerType.contains("NEterrorist")) {
			// perps: no necessary to use infobox for perps
			candidates.add(infoBox.getPerps());
		} else if (answerType.contains("NEdate")) {
			// date
			candidates.add(infoBox.getDate());
		} else if (answerType.contains("NEquantity")) {
			// fatalities, injuries
			candidates.add(infoBox.getFatalities());
			candidates.add(infoBox.getInjuries());
		} else if (answerType.contains("NETerroristOrganization")) {
			// perps: no necessary to use infobox for perps
			// candidates.add(infoBox.getPerps());
		} else if (answerType.contains("NEattacktype")) {
			// perps: no necessary to use infobox for perps
			candidates.add(infoBox.getType());
		}
	}

	private static List<String> getIncidentByKeyterms(List<String> keyterms) {
		List<String> incidentResult = new ArrayList<String>();
		List<String> lowercaseKeyterms = new ArrayList<String>();
		for (String keyterm : keyterms) {
			lowercaseKeyterms.add(keyterm.toLowerCase());
		}

		for (String incident : IncidentOntologyList) {
			String[] terms = incident.split(" ");
			List<String> termLs = new ArrayList<String>();
			for (String term : terms) {
				if (!term.equals("")) {
					termLs.add(term.toLowerCase());
				}
			}

			boolean isIncident = lowercaseKeyterms.containsAll(termLs);
			if (isIncident && (!incidentResult.contains(incident))) {
				incidentResult.add(incident);
			}
		}

		return incidentResult;
	}

	@Override
	public String getTypeName() {
		return "infobox";
	}

	@Override
	public List<AnswerCandidate> getAnswerCandidates(SupportingEvidenceArg arg) {
		List<AnswerCandidate> candidates = new ArrayList<AnswerCandidate>();
		List<String> neLs = getAnswerCandidates(arg.getKeywords(),
				arg.getAnswerType());
		for (String ne : neLs) {
			if (ne == null || ne.isEmpty() || ne.equals("")) {
				continue;
			}
			AnswerCandidate candidate = new AnswerCandidate(ne.trim(),
					new ArrayList<RetrievalResult>());
			candidate.setScore(10);
			candidates.add(candidate);
		}
		return candidates;
	}
}
