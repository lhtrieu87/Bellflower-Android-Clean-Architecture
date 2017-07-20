package core.repository;

import java.util.Iterator;

import core.Try;
import rx.Observable;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public interface Repository<T> {
    Observable<Try<Iterator<T>>> get(Parser parser);
}
