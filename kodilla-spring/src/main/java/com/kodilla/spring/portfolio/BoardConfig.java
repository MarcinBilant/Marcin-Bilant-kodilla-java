package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public TaskList createTaskList() {
        TaskList taskList = new TaskList();
        return taskList;

    }

    @Bean
    public Board createBoard() {
        Board board = new Board(createTaskList(),createTaskList(),createTaskList());
        return board;
    }

}

