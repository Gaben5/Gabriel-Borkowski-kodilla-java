package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentHomeworkTestSuite {
    @Test
    void testUpdate(){
        //Given
        Mentor mentorPaul = new MentorPaul();
        Mentor mentorJack = new MentorJack();
        StudentHomework johnHomework = new StudentHomework("John");
        StudentHomework annieHomework = new StudentHomework("Annie");
        StudentHomework martinHomework = new StudentHomework("Martin");
        StudentHomework taylorHomework = new StudentHomework("Taylor");
        johnHomework.registerObserver(mentorPaul);
        annieHomework.registerObserver(mentorPaul);
        martinHomework.registerObserver(mentorJack);
        taylorHomework.registerObserver(mentorJack);
        //When
        johnHomework.sendTask("TaskJohn1");
        johnHomework.sendTask("TaskJohn2");
        annieHomework.sendTask("TaskAnnie1");
        martinHomework.sendTask("TaskMartin1");
        taylorHomework.sendTask("TaskTaylor1");
        //Then
        assertEquals(3, mentorPaul.getUpdateCount());
        assertEquals(2, mentorJack.getUpdateCount());
    }
}
