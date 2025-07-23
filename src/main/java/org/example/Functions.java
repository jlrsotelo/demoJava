package org.example;

import java.util.function.Function;

public interface Functions {
    Function<Integer, Integer> treble = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x*3;
        }
    };
}
