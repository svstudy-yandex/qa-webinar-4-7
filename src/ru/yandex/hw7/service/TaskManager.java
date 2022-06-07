package ru.yandex.hw7.service;

import ru.yandex.hw7.model.Subtask;
import ru.yandex.hw7.model.Task;

import java.util.List;

public interface TaskManager {
    List<Task> getHistory();

    void addSubtask(Subtask subtask);

    // add, get, update, delete

    // List<Task> getPrioritizedTasks();
}
