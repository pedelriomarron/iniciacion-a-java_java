package com.pedelriomarron.ejercicio1.review;

import com.pedelriomarron.ejercicio1.users.User;

import java.util.List;
import java.util.Map;

public class ReviewBuilder {

    private long id;
    private String title;
    private int score;
    private String body;
    private Map<User,Integer> ratings;
    private User user;


    public ReviewBuilder(){};


    public ReviewBuilder withTitle(String title){
        this.title = title;
        return this;
    }

    public ReviewBuilder withScore(Integer score){
        this.score = score;
        return this;
    }

    public ReviewBuilder withBody(String body){
        this.body = body;
        return this;
    }

    public ReviewBuilder withRatings(Map<User,Integer> ratings){
        this.ratings = ratings;
        return this;
    }

    public ReviewBuilder withUser(User user){
        this.user = user;
        return this;
    }

    public ReviewBuilder withId(long id){
        this.id = id;
        return this;
    }



    public Review build(){
        Review review = new Review();
        review.setId(this.id);
        review.setTitle(this.title);
        review.setBody(this.body);
        review.setScore(this.score);
        review.setRatings(this.ratings);
        review.setUser(this.user);


        return review;
    }


}
