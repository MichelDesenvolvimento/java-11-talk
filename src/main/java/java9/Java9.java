package java9;

import java.util.Set;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java9 {

    public static void main(String[] args) {

        // Jshell

        // Melhoria nas APIs
        Set<String> cars = Set.of("Ferrari", "Fusca", "Bugatti");

        // Suporte para HTTP2 e WebSockets

        // Padronização dos Streams reativos (Flow API)

        // Módulos (Jigsaw)

        // API de Logging
        Logger myLogger = Logger.getLogger("myLogger");

        Handler handlerObj = new ConsoleHandler();
        handlerObj.setLevel(Level.ALL);
        myLogger.addHandler(handlerObj);
        myLogger.setLevel(Level.ALL);
        myLogger.setUseParentHandlers(false);

        myLogger.log(Level.WARNING, "Teste de log");

        // Stack-Walking API (Melhoria no stack-tracing)

        // Garbage Collector G1 (programado para trabalhar com menor tempo de pausa e de forma mais previsível, a fim
        // de entregar maior performance em seus eventos de cleanning)
    }
}
