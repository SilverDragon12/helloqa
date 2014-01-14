package edu.cmu.lti.oaqa.openqa.dso.phase.ie;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.uima.UimaContext;
import org.apache.uima.resource.ResourceInitializationException;

import edu.cmu.lti.oaqa.openqa.dso.data.AnswerCandidate;
import edu.cmu.lti.oaqa.openqa.dso.data.RetrievalResult;
import edu.cmu.lti.oaqa.openqa.dso.data.SupportingEvidenceArg;
import edu.cmu.lti.oaqa.openqa.dso.extractor.ICandidateExtractor;
import edu.cmu.lti.oaqa.openqa.dso.framework.base.AbstractInformationExtractor;
import edu.cmu.lti.oaqa.openqa.dso.util.ClassUtil;
import edu.cmu.lti.oaqa.openqa.dso.util.LogUtil;

public class InformationExtractor extends AbstractInformationExtractor {

	private static final Logger LOGGER = Logger.getLogger(LogUtil
			.getInvokingClassName());

	private String extractClassName;
	private String leafClassNames;

	@Override
	public void initialize(UimaContext aContext)
			throws ResourceInitializationException {
		super.initialize(aContext);
		initialize();
		this.extractClassName = (String) aContext
				.getConfigParameterValue("extractor");
		if (aContext.getConfigParameterValue("leaves") != null)
			this.leafClassNames = (String) aContext
					.getConfigParameterValue("leaves");
	}

	@Override
	public void initialize() {

	}

	@Override
	public List<AnswerCandidate> extractAnswerCandidates(String qid, String icEvent, String questionText,
			String answerType, List<String> keyterms, List<String> keyphrases,
			List<RetrievalResult> documents) {

		// build arg
		SupportingEvidenceArg arg = new SupportingEvidenceArg(icEvent, questionText,
				answerType, keyterms, keyphrases, documents,
				this.leafClassNames);

		ICandidateExtractor candidateExtractor = ClassUtil.extractorFactory(
				extractClassName, arg);
		List<AnswerCandidate> candidates = candidateExtractor
				.getAnswerCandidates(arg);

		LOGGER.info("  Extracted " + candidates.size() + " candidates.");
		return candidates;
	}

}
