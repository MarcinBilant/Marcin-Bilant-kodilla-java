package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorObserverTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        StudentTask johnSmith = new StudentTask(new Student("John Smith"));
        StudentTask ivoneEscobar = new StudentTask(new Student("Ivone Escobar"));
        StudentTask jessiePinkman = new StudentTask(new Student("Jessie Pinkman"));
        Mentor davidJones = new Mentor("David Jones");
        Mentor allanBrad = new Mentor("Allan Brad");

        johnSmith.registerObserver(davidJones);
        ivoneEscobar.registerObserver(allanBrad);
        jessiePinkman.registerObserver(davidJones);

        //when
        johnSmith.addTaskToQueue("Task no.1");
        ivoneEscobar.addTaskToQueue("Task no.2");
        jessiePinkman.addTaskToQueue("Task no.3");
        johnSmith.addTaskToQueue("Task no.4");
        johnSmith.addTaskToQueue("Task no.5");


        //then
        assertEquals(4, davidJones.getUpdateCount());
        assertEquals(1, allanBrad.getUpdateCount());

    }

}
