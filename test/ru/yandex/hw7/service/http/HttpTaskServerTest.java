package ru.yandex.hw7.service.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.junit.jupiter.api.Test;

class HttpTaskServerTest {

    @Test
    void getTasksHistory() throws IOException, InterruptedException {
        // это не настоящий тест - мы просто тестировали Handler на вебинаре
        HttpTaskServer taskServer = new HttpTaskServer();

        HttpClient client = HttpClient.newHttpClient();
        // добавили id просто для примера
        URI url = URI.create("http://localhost:8080/tasks/history?id=1");
        HttpRequest request = HttpRequest.newBuilder().uri(url).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        taskServer.stop();

    }

    @Test
    void getAllTasks() throws IOException, InterruptedException {
        // это не настоящий тест - мы просто тестировали Handler на вебинаре
        HttpTaskServer taskServer = new HttpTaskServer();

        HttpClient client = HttpClient.newHttpClient();
        URI url = URI.create("http://localhost:8080/tasks");
        HttpRequest request = HttpRequest.newBuilder().uri(url).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        taskServer.stop();

    }
}