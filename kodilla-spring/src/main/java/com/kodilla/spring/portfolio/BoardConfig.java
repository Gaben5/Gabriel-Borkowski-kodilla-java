package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BoardConfig {
    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }
    @Bean
    public TaskList listInProgress(){
        return new TaskList();
    }
    @Bean
    public TaskList listDone(){
        return new TaskList();
    }
    @Bean
    public Board getBoard(){
        return new Board(toDoList(),listInProgress(),listDone());
    }
}
