package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTask implements QueueObservable {
    private final Student student;
    private final Deque<String> tasks;
    private final List<MentorObserver> mentorObservers;

    public StudentTask(Student student) {
        this.student = student;
        tasks = new ArrayDeque<>();
        mentorObservers = new ArrayList<>();
    }
    public void addTaskToQueue(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(MentorObserver observer) {
        mentorObservers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (MentorObserver observer : mentorObservers) {
            observer.notifyNewTask(this);
        }
    }
    @Override
    public void removeObserver(MentorObserver observer) {
        mentorObservers.remove(observer);
    }


    public Student getStudent() {
        return student;
    }

    public Deque<String> getTask() {
        return tasks;
    }



}
