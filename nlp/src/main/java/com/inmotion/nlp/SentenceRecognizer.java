package com.inmotion.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentenceRecognizer {

	public static void main(String[] args) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeLine();
		
		String text = "Halo!! Perkenalkan nama Saya Ryo Rangga. Saya seorang Software Engineer.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> coreSentences = coreDocument.sentences();
		
		for (CoreSentence coreSentence : coreSentences) {
			System.out.println(coreSentence.toString());
		}
		
	}
}
