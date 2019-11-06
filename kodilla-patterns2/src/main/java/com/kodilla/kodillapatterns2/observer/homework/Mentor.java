package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyNewTask(StudentTask studentTask) {
        System.out.println("Hello " + name + " . I " + studentTask.getStudent().getName() +
                " finished and sent the task to check " + studentTask.getTask().peekLast());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}


