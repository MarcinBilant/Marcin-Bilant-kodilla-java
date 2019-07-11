package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        board.getDoneList().getTasks().add("One task");
        board.getInProgressList().getTasks().add("In progress module Sping");
        board.getToDoList().getTasks().add("Next moule no. 16");

        //then
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals("One task", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("In progress module Sping", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Next moule no. 16", board.getToDoList().getTasks().get(0));


    }
}
