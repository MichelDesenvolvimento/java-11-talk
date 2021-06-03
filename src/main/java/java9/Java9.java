package java9;

import java.util.Set;

public class Java9 {

    public static void main(String[] args) {

        // Jshell

        // Melhoria nas APIs
        Set<String> cars = Set.of("Ferrari","Fusca", "Bugatti");

        // Suporte para HTTP2 e WebSockets

        // Padronização dos Streams reativos (Flow API)

        // Módulos (Jigsaw)

        // API de Logging
        System.Logger log = System.getLogger("log");
        log.log(System.Logger.Level.DEBUG, "teste");

        // Stack-Walking API (Melhoria no stack-tracing)

        // Garbage Collector G1 (programado para trabalhar com menor tempo de pausa e de forma mais previsível, a fim
        // de entregar maior performance em seus eventos de cleanning)
    }
}
