package com.pedelriomarron.ejercicio1.idao;


import com.pedelriomarron.ejercicio1.review.Review;

import java.util.List;

public interface IReviewDao {

    public List<Review> getReviews();
    // TODO: public Review getReview();
    public void updateUser(Review review);
    public void deleteUser(Review review);
}
