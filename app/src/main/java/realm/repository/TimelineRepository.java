package realm.repository;

import java.util.Iterator;

import core.Try;
import core.repository.Repository;
import realm.repository.parser.UserParser;
import realm.repository.pojo.Timeline;
import rx.Observable;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class TimelineRepository {
    Observable<Try<Iterator<Timeline>>> getWeights() {
        Repository<Timeline> repository = new RealmRepository();
        Observable<Try<Iterator<Timeline>>> timelines = repository.get(new UserParser());
        return timelines;
    }
}
