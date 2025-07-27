package org.example;

@FunctionalInterface
public interface Imprimir<T> {
    void print(T toPrint);
}
