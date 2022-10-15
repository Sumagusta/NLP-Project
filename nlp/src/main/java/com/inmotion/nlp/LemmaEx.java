package com.inmotion.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class LemmaEx {

	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();

		String text = "Hey! I am Ryo Rangga.  Try to learn new technologies.";

		CoreDocument coreDocument = new CoreDocument(text);

		stanfordCoreNLP.annotate(coreDocument);

		List<CoreLabel> coreLabelList = coreDocument.tokens();

		for (CoreLabel coreLabel : coreLabelList) {
			String lemma = coreLabel.lemma();
			System.out.println(coreLabel.originalText() + " = "+ lemma);
		}
	}

}
