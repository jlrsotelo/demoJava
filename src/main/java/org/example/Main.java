package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ejemplo de clase anonima
        Functions.Carro carroCombustion = new Functions.Carro();
        Functions.Carro carroElectrico = new Functions.Carro() {
            @Override
            public void tipoMotor() {
                System.out.println("Motor electrico");
            }
        };
        carroCombustion.tipoMotor();
        carroElectrico.tipoMotor();

        //ejemplo de expresion lambda
        Matematica resta = new Matematica() {
            @Override
            public double ejecutar(double x, double y) {
                return x - y;
            }
        };

        Matematica resta2 = (a, b) -> a - b;

        Matematica div = (a, b) -> {
            System.out.println("dividir");
            return a / b;
        };

        System.out.println(resta.ejecutar(15, 5));
        System.out.println(resta2.ejecutar(25, 5));
        System.out.println(div.ejecutar(30, 5));
        System.out.println(resta.suma(16, 6));

        //ejemplo de expresion lambda generica
        Imprimir<String> imprimir = string -> System.out.println(string);
        imprimir.print("Hola mundo");

        Imprimir<Empleado> imprimir2 = e -> System.out.println(e);
        Empleado empleado = new Empleado();
        empleado.setId("1");
        empleado.setNombre("jorge");
        empleado.setApellido("ramirez");
        imprimir2.print(empleado);

        List<String> paises = List.of("peru", "bolivia", "argentina", "colombia");
        paises.forEach(e -> System.out.println(e.toUpperCase()));

        AtomicInteger num = new AtomicInteger(5);
        IntStream.range(1, 2).forEach(e -> num.set(num.get() + e));
        System.out.println(num.get());

        //leyendo un archivo con lambda
        Path file = Paths.get("src/main/resources/cadena.txt");
        try (Stream<String> lines = Files.lines(file).onClose(() -> System.out.println("Cerrando"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}