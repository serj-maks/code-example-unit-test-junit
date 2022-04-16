package edu.junit.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ExtendedList<E> extends ArrayList<E> {

    @SafeVarargs
    public ExtendedList(E... elems) {
        Collections.addAll(this, elems);
    }

    public <R> List<R> map(Function<E, R> mapper) {
        ExtendedList<R> result = new ExtendedList<>();
        for (E elem : this) {
            R mapped = mapper.apply(elem);
            result.add(mapped);
        }
        return result;
    }
}
