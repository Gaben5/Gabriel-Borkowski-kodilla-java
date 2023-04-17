package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User adam = new Millenials("Adam");
        User ada = new YGeneration("Ada");
        User kasia = new ZGeneration("Kasia");

        //When
        String userFacebook = adam.sharePost();
        System.out.println("Adam is using: " + userFacebook);
        String userTwitter = ada.sharePost();
        System.out.println("Ada is using: " + userTwitter);
        String userSnapchat = kasia.sharePost();
        System.out.println("Kasia is using: " + userSnapchat);

        //Then
        assertEquals("Facebook",userFacebook);
        assertEquals("Twitter",userTwitter);
        assertEquals("Snapchat",userSnapchat);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User adam = new Millenials("Adam");
        //When
        String userFacebook = adam.sharePost();
        System.out.println("Adam is using: " + userFacebook);
        adam.setSocialPublisher(new TwitterPublisher());
        userFacebook = adam.sharePost();
        System.out.println("Adam is using now: " + userFacebook);
        //Then
        assertEquals("Twitter",userFacebook);
    }
}
