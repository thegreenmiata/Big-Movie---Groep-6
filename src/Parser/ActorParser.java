package Parser;

/**
 * Created by jorn on 12/21/16.
 */
public class ActorParser extends BaseActorParser {
    private static ActorParser instance;

    static ActorParser getInstance() {
        if (instance == null) instance = new ActorParser();
        return instance;
    }

    private ActorParser() {
        filename = "actors";
        pw = createPrintWriter();
        pw.println("idNumber,firstName,lastName,title,firstYear,seriesTitle,seriesSeason,seriesEpisode");
    }
}
