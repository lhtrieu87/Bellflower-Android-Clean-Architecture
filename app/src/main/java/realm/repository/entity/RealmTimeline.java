package realm.repository.entity;

import io.realm.RealmModel;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public class RealmTimeline implements RealmModel {
    private String subtype;

    public String getSubtype() {
        return subtype;
    }

    public RealmTimeline(String subtype) {
        this.subtype = subtype;
    }
}
