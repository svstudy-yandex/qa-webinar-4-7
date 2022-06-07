package ru.yandex.hw7.service.http;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import ru.yandex.hw7.service.Managers;
import ru.yandex.hw7.service.TaskManager;

public class HttpTaskServer {
    public static final int PORT = 8080;
    private final HttpServer server;
    private final Gson gson;
    private final TaskManager taskManager;

    public HttpTaskServer() {
        taskManager = Managers.getDefault();
        gson = null; // TODO: создать gson, настроить адаптер для LocalDateTime
        server = null; // TODO: создать HttpServer

        // пример с лямбдой
        server.createContext("/tasks", this::handler);
        // можно прописать отдельные хендлеры для каждого пути
        server.createContext("/tasks/history", new TaskHistoryHandler());
        // ...

        server.start();
    }

    private void handler(HttpExchange h) throws IOException {
        // ...
        /* тестируем на вебинаре
        try {
            System.out.println(h.getRequestURI().getPath());
            System.out.println(h.getRequestURI().getQuery());
            h.sendResponseHeaders(200, 0);
        } finally {
            h.close();
        }
         */
    }

    static class TaskHistoryHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange h) throws IOException {
            // ...
            /* тестируем на вебинаре
            try {
                System.out.println(h.getRequestURI().getPath());
                System.out.println(h.getRequestURI().getQuery());
                // ...
                h.sendResponseHeaders(200, 0);

            } finally {
                h.close();
            }
             */
        }
    }

    public void stop() {
        server.stop(0);
    }

}
