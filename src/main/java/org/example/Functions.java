package org.example;

import java.util.function.Function;

public interface Functions {
    Function<Integer, Integer> treble = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x*3;
        }
    };

    class Carro {
        public void tipoMotor(){
            System.out.println("Motor de combustion interna");
        }
    }
}
