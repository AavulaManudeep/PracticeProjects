/**
 * 
 */
package com.demo.main;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author manu
 *
 */
public class Twitter {
	
    private Map<Integer,List<Integer>> feeds;
    private Map<Integer, Integer> followtrack;
    public Twitter() {
    	feeds=new HashMap<Integer, List<Integer>>();
    	followtrack = new HashMap<Integer, Integer>();
        
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {

    	if(feeds.get(userId)==null)
    	{
    		feeds.put(userId, new ArrayList<Integer>(Arrays.asList(tweetId)));
    		followtrack.put(userId, 0);
    	}
    	else {
    		feeds.get(userId).add(tweetId);  		
		}
    	
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	
        
        return feeds.get(userId);
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
    	
    	if(followtrack.get(followerId).equals(0))
    	{
    		feeds.get(followerId).addAll(feeds.get(followeeId));
    		followtrack.put(followerId,1);
    	}
    	else {
			System.out.println("There is No Follow option");
		}
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	if(followtrack.get(followerId).equals(1))
	    {
	    	feeds.get(followerId).removeAll(feeds.get(followeeId));
	    	followtrack.put(followerId,0);
	    }
    	else {
			System.out.println("There is No Unfollow option");
		}
    }
}
