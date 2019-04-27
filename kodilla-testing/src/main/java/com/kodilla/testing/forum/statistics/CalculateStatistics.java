package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int usersCount;
    private int postsCount;
    private int commentCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommnentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();


    }
}
