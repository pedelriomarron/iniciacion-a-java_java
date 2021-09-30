package com.pedelriomarron.ejercicio1.review;

import com.pedelriomarron.ejercicio1.users.User;

import java.util.List;
import java.util.Map;

public class Review {

    private String title;
    private int score;
    private long body;
    private List<? extends Map<User,Integer>> ratings;


    protected Review(){};

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}
    public long getBody() {return body;}
    public void setBody(long body) {this.body = body;}
    public List<? extends Map<User, Integer>> getRatings() {return ratings;}
    public void setRatings(List<? extends Map<User, Integer>> ratings) {this.ratings = ratings;}
}
