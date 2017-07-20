package api.repository;

import java.util.List;

import core.Try;
import core.repository.Repository;
import rx.Observable;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class APIRepository implements Repository {
    @Override
    public Observable<Try<List>> get() {
        return null;
    }
}
