package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.lang.String;

public final class Forum {

    private final  List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1, "Janusz", 'M',
                1977, 01, 02, 15));
        forumUserList.add(new ForumUser(2, "Waldek", 'M',
                1987, 01, 02, 10));
        forumUserList.add(new ForumUser(3, "Marian", 'M',
                1997, 01, 02, 0));
        forumUserList.add(new ForumUser(4, "Jerzy", 'M',
                1990, 01, 02, 5));
        forumUserList.add(new ForumUser(5, "Ania", 'F',
                1988, 01, 02, 20));
        forumUserList.add(new ForumUser(6, "Maria", 'F',
                1990, 01, 02, 10));
        forumUserList.add(new ForumUser(7, "Marcin", 'M',
                2000, 01, 02, 5));
        forumUserList.add(new ForumUser(8, "Krzysiek", 'M',
                1988, 01, 02, 0));
        forumUserList.add(new ForumUser(9, "Iza", 'F',
                1996, 01, 02, 25));
        forumUserList.add(new ForumUser(10, "Asia", 'F',
                1998, 01, 02, 30));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }




}
