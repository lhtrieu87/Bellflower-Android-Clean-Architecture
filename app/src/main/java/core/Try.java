package core;

import rx.functions.Func1;

interface Functor<Val> {
    <Val1> Functor<Val1> map(Func1<Val, Val1> f);
}

interface Monad<Val> {
    <Val1> Monad<Val1> flatMap(Func1<Val, Monad<Val1>> f);
}

public class Try<Val> implements Functor<Val>, Monad<Val> {
    private Exception error;
    private Val value;

    public Try(Exception error) {
        this.error = error;
    }

    public Try(Val value) {
        this.value = value;
    }

    public Exception getError() {
        return this.error;
    }

    public Val getValue() {
        return this.value;
    }

    public boolean isError() {
        return this.error != null;
    }

    @Override
    public <Val1> Functor<Val1> map(Func1<Val, Val1> f) {
        if (isError()) {
            return new Try<>(this.getError());
        } else {
            return new Try<>(f.call(this.getValue()));
        }
    }

    @Override
    public <Val1> Monad<Val1> flatMap(Func1<Val, Monad<Val1>> f) {
        if(isError()){
            return new Try<>(this.getError());
        }else {
            return f.call(this.getValue());
        }
    }
}

