package org.example;

import java.util.function.Function;

public class Triple implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer x) {
        return x*3;
    }
}
