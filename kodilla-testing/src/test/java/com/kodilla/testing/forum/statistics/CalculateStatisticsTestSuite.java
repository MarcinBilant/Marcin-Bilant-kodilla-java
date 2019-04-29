package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateStatisticWhithMock1 (){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 0;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(10, calculateStatistics.avgCommentsPerPost, 0.001);

    }

    @Test
    public void testCalculateStatisticWhithMock2 (){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(10, calculateStatistics.avgPostsPerUser,0.001);

    }

    @Test
    public void testCalculateStatisticWhithMock3 (){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(700);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(7, calculateStatistics.avgCommentsPerUser,0.001);

    }

}
