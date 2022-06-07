package ru.yandex.hw7.service;

import ru.yandex.hw7.model.Subtask;
import ru.yandex.hw7.model.Task;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InMemoryTaskManager implements TaskManager {
    protected final Map<Integer, Task> tasks = new HashMap<>();
    // ... epic, subtasks
    protected final HistoryManager historyManager;
    private final Map<LocalDateTime, Task> prioritizedTasks = new TreeMap<>();

    public InMemoryTaskManager() {
        this.historyManager = Managers.getDefaultHistory();
    }

    @Override
    public void addSubtask(Subtask subtask) {
        //...
    }

    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}
