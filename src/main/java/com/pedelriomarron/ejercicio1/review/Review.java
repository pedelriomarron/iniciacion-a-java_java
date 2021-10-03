package com.pedelriomarron.ejercicio1.review;

import com.pedelriomarron.ejercicio1.users.User;

import java.util.List;
import java.util.Map;

public class Review {

    private long id;
    private String title;
    private int score;
    private String body;
    private Map<User,Integer> ratings; //FIXME: solo el map
    private User user;


    protected Review(){};

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}
    public String getBody() {return body;}
    public void setBody(String body) {this.body = body;}
    public Map<User, Integer> getRatings() {return ratings;}
    public void setRatings(Map<User, Integer> ratings) {this.ratings = ratings;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
}
