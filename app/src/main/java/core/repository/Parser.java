package core.repository;

/**
 * Created by lehongtrieu on 7/20/17.
 */

public interface Parser<F, T> {
    T parse(F from);
}
