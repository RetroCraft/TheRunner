package com.retrocraft;

import com.go90.therunner.*;
import com.twitter.api.*;

public class RetroCraft extends Person, Programmer {
  public static void main(String args[]) {
    RunnerEpisode episode;
    Tweet[] myTweeets;
    
    myTweets = Twitter.API.getTweets("@retrocraft314");
    
    while (!Runner.show.isOver()) {
      episode = Runner.API.getLatestEpisode(2);
      Tweet[] shown = episode.shownTweets;
      for (Tweet t : shown) {
        if (Arrays.asList(myTweets).contains(t)) {
          this.happiness = Integer.MAX_VALUE;
        }
      }
    }
  }
}