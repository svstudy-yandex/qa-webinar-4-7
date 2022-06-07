package ru.yandex.hw7.service;

public class Managers {
    public static TaskManager getDefault() {
        return new FileBackedTaskManager("resources/tasks.csv");
        // TODO поменять на HttpTaskManager
    }

    public static HistoryManager getDefaultHistory() {
        return new InMemoryHistoryManager();
    }
}
