package java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java10 {

    public static void main(String[] args) {

        // Releases baseados em tempo

        // Inferência de tipos para variáveis locais
        final var x = 10;
        final var y = "Java ";
        System.out.println(y + x);

        // Immutable Collections
        final List<String> strings = new ArrayList<>();
        strings.add("Ana Lucia");
        strings.add("Joana");
        strings.add("Pricila");
        strings.add("Bianca");

        final var s = Set.copyOf(strings);
        s.forEach(System.out::println);

        final var n = Set.of("Bia", "Ana", "Lú", "Jô");
        n.forEach(System.out::println);

        final var m = Map.of("K1", 1, "K2", 2, "K3", 3);
        m.forEach((k,v) -> System.out.println("Key="+k + " " + "Value="+v));

        // Garbage-Collector Interface

        // Parallel Full GC para G1

        // Alocação da Heap em dispositivos de memória alternativos

        // Remoção da ferramenta de geração de cabeçalho nativo

        // Compilador JIT experimental baseado em Java
    }
}
