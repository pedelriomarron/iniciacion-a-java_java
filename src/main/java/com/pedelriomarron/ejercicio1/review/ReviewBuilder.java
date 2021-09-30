package com.pedelriomarron.ejercicio1.review;

import com.pedelriomarron.ejercicio1.users.User;

import java.util.List;
import java.util.Map;

public class ReviewBuilder {


    private String title;
    private int score;
    private long body;
    private List<? extends Map<User,Integer>> ratings;


    public ReviewBuilder(){};


    public ReviewBuilder withTitle(String title){
        this.title = title;
        return this;
    }

    public ReviewBuilder withScore(Integer score){
        this.score = score;
        return this;
    }

    public ReviewBuilder withBody(long body){
        this.body = body;
        return this;
    }

    public ReviewBuilder withRatings(List<? extends Map<User,Integer>> ratings){
        this.ratings = ratings;
        return this;
    }


    public Review build(){
        Review review = new Review();

        review.setTitle(this.title);
        review.setBody(this.body);
        review.setScore(this.score);
        review.setRatings(this.ratings);


        return review;
    }


}
