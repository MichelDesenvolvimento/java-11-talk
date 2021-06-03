package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11 {

    public static void main(String[] args) throws IOException {

        // Métodos String
//        var teste = "  TESTE  ";
//        System.out.println(teste.isBlank());
//        System.out.println(teste.lines().count());
//        System.out.println(teste.strip());
//        System.out.println(teste.stripLeading());
//        System.out.println(teste.stripTrailing());
//        System.out.println(teste.repeat(3));

        // Métodos de leitura e escrita de arquivos
//        Path filePath = Paths.get("test.txt");
//        try {
//            if (!Files.exists(filePath))
//                Files.createFile(filePath);
//
//            //Write content to file
//            Files.writeString(filePath, "Hello World !!", StandardOpenOption.APPEND);
//
//            //Verify file content
//            String content = Files.readString(filePath);
//
//            System.out.println(content);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Padronização do cliente HTTP

//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("http://www.google.com.br"))
//                .build();
//
//        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
//
//        HttpClient client = HttpClient.newHttpClient();
//        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, bodyHandler);
//        future.thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();

        // Módulos removidos do Java EE
    }
}
