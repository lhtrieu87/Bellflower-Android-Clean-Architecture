package realm.repository.parser;

import core.repository.Parser;
import realm.repository.entity.RealmUser;
import realm.repository.pojo.User;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class UserParser implements Parser<RealmUser, User> {

    @Override
    public User parse(RealmUser from) {
        return new User(from.getName());
    }
}
