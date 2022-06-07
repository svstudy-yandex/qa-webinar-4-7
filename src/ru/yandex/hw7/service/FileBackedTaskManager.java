package ru.yandex.hw7.service;

import ru.yandex.hw7.model.Subtask;

public class FileBackedTaskManager extends InMemoryTaskManager {

    public FileBackedTaskManager(String filePath) {

    }

    @Override
    public void addSubtask(Subtask subtask) {
        super.addSubtask(subtask);
        save();
    }

    protected void save() {
        // ...
    }

}
