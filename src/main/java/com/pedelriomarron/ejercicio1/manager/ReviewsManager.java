package com.pedelriomarron.ejercicio1.manager;

public class ReviewsManager {


    private static ReviewsManager reviewsManager = null;

    public static ReviewsManager getReviewsManager(){

        if(reviewsManager==null) reviewsManager = new ReviewsManager();
        return reviewsManager;

    }

    private ReviewsManager(){

    }



}
