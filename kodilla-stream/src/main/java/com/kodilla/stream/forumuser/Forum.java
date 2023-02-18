package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"Janek",'M', LocalDate.parse("1991-10-10"),0));
        forumUserList.add(new ForumUser(2,"Marysia",'F', LocalDate.parse("1994-12-05"),200));
        forumUserList.add(new ForumUser(3,"Olek",'M', LocalDate.parse("2012-12-06"),100));
        forumUserList.add(new ForumUser(4,"Ada",'F', LocalDate.parse("2015-05-18"),111));
        forumUserList.add(new ForumUser(5,"Bolek",'M', LocalDate.parse("1987-10-25"),33));
        forumUserList.add(new ForumUser(6,"Laura",'F', LocalDate.parse("1996-01-13"),29));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
