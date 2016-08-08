package org.finra.metal.gear;

import org.finra.metal.gear.Sentiment.SentimentAnalysis;
import org.finra.metal.gear.Sentiment.SentimentFirm;

/**
 * Created by k26142 on 8/8/16.
 */
public class MetalGearSentiment {
    public static void main(String[] args) {
        SentimentAnalysis analyzer = new SentimentAnalysis("nlp.properties");

        SentimentFirm firm = new SentimentFirm(analyzer, 1);

        firm.addSentiment("This is a good text string.");
        firm.addSentiment("This is a bad text string.");
        firm.addSentiment("This is the best string in the whole world; it is fantastic!");

        System.out.println(firm.getAverageSentiment());
    }
}