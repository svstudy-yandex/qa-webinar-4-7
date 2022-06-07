package ru.yandex.hw7.service.http;

import ru.yandex.hw7.service.FileBackedTaskManager;

public class HttpTaskManager extends FileBackedTaskManager {
    private final KVTaskClient kvClient;
    //...

    public HttpTaskManager(String kvServerUrl) {
        super(null);

        kvClient = null; // TODO
        // ...
    }

    private void load() {
        // загружаем данные из KVServer
    }

    @Override
    protected void save() {
        // сохраняем данные в KVServer
    }
}
