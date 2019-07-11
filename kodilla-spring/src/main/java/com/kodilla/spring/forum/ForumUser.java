package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName = "John Smith";

    public String getUserName() {
        System.out.println(userName);
        return userName;
    }
}
