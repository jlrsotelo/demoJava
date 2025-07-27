package org.example;

@FunctionalInterface
public interface Matematica {
    double ejecutar(double x, double y);
    default double suma(double x, double y){ return x+y; }
}
