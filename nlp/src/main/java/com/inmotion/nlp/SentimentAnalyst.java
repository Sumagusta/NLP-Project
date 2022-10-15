package com.inmotion.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAnalyst {

	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();

		String text = "Hey! I am Ryo Rangga.  Try to learn new technologies.";
		String negativeText = "Hey! what are you doing! are you stupid!";

		CoreDocument coreDocument = new CoreDocument(negativeText);

		stanfordCoreNLP.annotate(coreDocument);

		List<CoreSentence> coreSentenceList = coreDocument.sentences();

		for (CoreSentence coreSentence : coreSentenceList) {
			String sentiment = coreSentence.sentiment();
			System.out.println(sentiment +"\t"+ coreSentence);
		}
	}

}
