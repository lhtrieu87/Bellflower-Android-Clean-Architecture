package realm.repository;

import java.util.Iterator;

import core.Try;
import core.repository.Parser;
import core.repository.Repository;
import rx.Observable;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class RealmRepository<T> implements Repository<T> {
    @Override
    public Observable<Try<Iterator<T>>> get(Parser parser) {
        return null;
    }
}


//    RealmResults<F> results = Realm.getDefaultInstance().where()
//    ListIterator<F> iterator = results.listIterator();
//    List<T> listPojo = new LinkedList<>();
//        while (iterator.hasNext()) {
//                listPojo.add(parser.parse(iterator.next()));
//                }
//
//                Try<Iterator<T>> pojoListTry = new Try(listPojo.listIterator());
//        return Observable.just(pojoListTry);
