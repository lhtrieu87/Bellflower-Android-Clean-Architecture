package realm.repository.entity;

import io.realm.RealmModel;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class RealmUser implements RealmModel {
    private String name;

    public RealmUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
