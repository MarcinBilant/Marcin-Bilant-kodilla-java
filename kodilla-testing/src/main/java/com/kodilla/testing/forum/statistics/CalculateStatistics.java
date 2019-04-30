package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    protected double avgPostsPerUser;
    protected double avgCommentsPerUser;
    protected double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (usersCount != 0) {
            avgPostsPerUser = postsCount /  (double)usersCount;
        } else {
            avgPostsPerUser = 0;
        }

        if (usersCount != 0) {
            avgCommentsPerUser = commentsCount / (double)usersCount;
        } else {
            avgCommentsPerUser = 0;
        }

        if (postsCount != 0) {
            avgCommentsPerPost = commentsCount / (double)postsCount;
        }
        else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics(){
            System.out.println("Average number of posts per user: " + avgPostsPerUser);
            System.out.println("Average number of comments per user: " + avgCommentsPerUser);
            System.out.println("Average number of comments per post: " + avgCommentsPerPost);
    }

}
