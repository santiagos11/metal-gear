package org.finra.metal.gear;

import org.finra.metal.gear.Sentiment.SentimentAnalysis;
import org.finra.metal.gear.Sentiment.SentimentData;
import org.finra.metal.gear.Sentiment.SentimentFirm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by k26142 on 8/8/16.
 */
public class MetalGearSentiment {

//    public static void main(String[] args) throws IOException, SQLException {
//
//        SentimentAnalysis analyzer = new SentimentAnalysis("nlp.properties");
//        SentimentData database = new SentimentData("metal-gear1.c9dfyqjobtqf.us-east-1.rds.amazonaws.com", 5432, "metal_gear", "metal_gear", "metal_gear");
////        SentimentData database = new SentimentData("localhost", 5439, "metalgear", null, null);
//
////        database.initDatabase();
//        database.setSchema("metalgear");
//
//        List<Long> firms = database.getFirms();
//
//        for (Long firmId : firms) {
//            SentimentFirm firm = new SentimentFirm(analyzer, database, firmId);
//
//            int rand = (int)(Math.random() * 10);
//
//            if (rand > 7)
//                firm.addSentimentBatch("Some_user1", "This is the best string in the whole world; it is fantastic!");
//            if (rand >= 5)
//                firm.addSentimentBatch("Some_user1", "This is a good text string.");
//            if (rand < 5)
//                firm.addSentimentBatch("Some_user3", "This is a bad text string.");
//            if (rand < 3) {
//                firm.addSentimentBatch("Some_user4", "This is the worst string in the whole world; it is terrible!");
//                firm.addSentimentBatch("Some_user2", "This is actually the worst string in the whole world; it is terrible!");
//            }
//
//            firm.executeBatch();
//            firm.updateAverageSentiment();
//        }
//    }
}
