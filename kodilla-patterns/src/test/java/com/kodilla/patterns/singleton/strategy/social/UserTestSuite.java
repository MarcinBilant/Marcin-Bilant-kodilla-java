package com.kodilla.patterns.singleton.strategy.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User michael = new ZGeneration("Michael");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven: " + stevenShare);
        String johnShare = john.sharePost();
        System.out.println("John: " + johnShare);
        String michaelSare = michael.sharePost();
        System.out.println("Michael: " + michaelSare);

        //Then
        Assert.assertEquals("The publisher shares via Facebook", stevenShare);
        Assert.assertEquals("The publisher shares via Twitter", johnShare);
        Assert.assertEquals("The publisher shares via Snapchat", michaelSare);
    }

    @Test
    public void testIndividualSharingStrategy() {
       //Given
        User steven = new Millenials("Steven");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven: " + stevenShare);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenShare = steven.sharePost();
        System.out.println("Steven: " + stevenShare);

        //Then
        Assert.assertEquals("The publisher shares via Twitter", stevenShare);
    }
}