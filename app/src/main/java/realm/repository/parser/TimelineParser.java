package realm.repository.parser;

import core.repository.Parser;
import realm.repository.entity.RealmTimeline;
import realm.repository.pojo.Timeline;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class TimelineParser implements Parser<RealmTimeline, Timeline> {
    @Override
    public Timeline parse(RealmTimeline from) {
        return new Timeline(from.getSubtype());
    }
}
