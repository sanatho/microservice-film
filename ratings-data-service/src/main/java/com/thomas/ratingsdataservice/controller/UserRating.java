package com.thomas.ratingsdataservice.controller;

import java.util.*;

public class UserRating {
    private List<Rating> userRatings;

    public UserRating(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }

    public UserRating() {
    }

    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }

    @Override
    public String toString() {
        return "UserRating{" +
                "userRatings=" + userRatings +
                '}';
    }
}
