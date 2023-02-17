package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case: begin");
    }

    @Mock
    private Statistics statisticsMock;

    private List<String> userGenerator(int users){
        List<String> generatedUsers = new ArrayList<>();
        for(var i = 0 ; i < users ; i++){
            generatedUsers.add("User"+i);
        }

        return generatedUsers;
    }

    @Test
    void testStatistics0Posts(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();

        List<String> resultUsers = userGenerator(100);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0,stats.getQuantityPosts());
        //Assertions.assertEquals(100,stats.getQuantityUsers());
        //Assertions.assertEquals(50,stats.getQuantityComments());
        Assertions.assertEquals(0,stats.getAvgPostsOnUser());
        Assertions.assertEquals(0,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(50,stats.getAvgCommentsOnPost());

    }
    @Test
    void testStatistics1000Posts(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();
        List<String> resultUsers = userGenerator(1000);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000,stats.getQuantityPosts());
        Assertions.assertEquals(1000,stats.getQuantityUsers());
        Assertions.assertEquals(100,stats.getQuantityComments());
        Assertions.assertEquals(1,stats.getAvgPostsOnUser());
        Assertions.assertEquals(100/1000,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(100/1000,stats.getAvgCommentsOnPost());
        //nie rozumiem dlaczego 100/1000 = 0.0 a nie 0.1 xD

    }

    @Test
    void testStatistics0Comments(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();
        List<String> resultUsers = userGenerator(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
           Assertions.assertEquals(0,stats.getQuantityComments());

        Assertions.assertEquals(50/100,stats.getAvgPostsOnUser());
        Assertions.assertEquals(0,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(0,stats.getAvgCommentsOnPost());
    }
    @Test
    void testStatisticsCommentsMoreThanPosts(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();

        List<String> resultUsers = userGenerator(100);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(stats.getQuantityComments()>stats.getQuantityPosts());

        Assertions.assertEquals(1,stats.getAvgPostsOnUser());
        Assertions.assertEquals(2,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(2,stats.getAvgCommentsOnPost());
    }
    @Test
    void testStatisticsCommentsLessThanPosts(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();

        List<String> resultUsers = userGenerator(100);

        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(stats.getQuantityComments()<stats.getQuantityPosts());
        Assertions.assertEquals(2,stats.getAvgPostsOnUser());
        Assertions.assertEquals(1,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(100/200,stats.getAvgCommentsOnPost());
    }
    @Test
    void testStatistics0Users(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();

        List<String> resultUsers = userGenerator(0);

        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0,stats.getQuantityUsers());
        Assertions.assertEquals(50,stats.getAvgPostsOnUser());
        Assertions.assertEquals(10,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(10/50,stats.getAvgCommentsOnPost());
    }

    @Test
    void testStatistics100Users(){
        //Given
        CalculateStatistics stats = new CalculateStatistics();

        List<String> resultUsers = userGenerator(100);

        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(400);
        when(statisticsMock.usersNames()).thenReturn(resultUsers);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100,stats.getQuantityUsers());
        Assertions.assertEquals(2,stats.getAvgPostsOnUser());
        Assertions.assertEquals(4,stats.getAvgCommentsOnUser());
        Assertions.assertEquals(2,stats.getAvgCommentsOnPost());
    }
}
