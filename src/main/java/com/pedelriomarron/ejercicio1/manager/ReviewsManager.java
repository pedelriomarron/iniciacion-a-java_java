package com.pedelriomarron.ejercicio1.manager;

import com.pedelriomarron.ejercicio1.dao.impl.UserDaoImpl;
import com.pedelriomarron.ejercicio1.review.Review;
import com.pedelriomarron.ejercicio1.review.ReviewBuilder;
import com.pedelriomarron.ejercicio1.users.User;
import com.pedelriomarron.ejercicio1.users.UserBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewsManager {


    private static ReviewsManager reviewsManager = null;

    public static ReviewsManager getReviewsManager(){

        if(reviewsManager==null) reviewsManager = new ReviewsManager();
        return reviewsManager;

    }

    private ReviewsManager(){

    }


    public User register(String email,String name,String lastName,String username){
        User user = new UserBuilder()
                .withEmail(email)
                .withName(name,lastName)
                .withUsername(username)
                .build();

        UserDaoImpl.getDao().create(user);

        return user;
    }

    public User unsubscribe(User user){

        UserDaoImpl.getDao().delete(user.getEmail());

        return user;
    }

    public User checkUserData(String email){
        User user = new UserBuilder()
                    .build();

        //TODO: buscar en fichero usuario
        return  user;
    }

    public User updateUser(String email){
        User user = new UserBuilder()
                .build();

        //TODO:Actualizar fichero
        return user;
    }

    public Review createReview(String title,String body,Integer score){
        Review review = new ReviewBuilder()
                .withTitle(title)
                .withBody(body)
                .withScore(score)
                .withRatings(new HashMap<User,Integer>())
                .build();

        //TODO: Añadir al fichero
        return review;
    }

    public List<Review> checkAllReviews(){
        List<Review> reviews = new ArrayList<Review>();


        //TODO: Recoger todos del fichero


        return reviews;
    }

    public boolean deleteReview(Review review,User user){

        if(review.getUser().getEmail().equals(user.getEmail())){
            //TODO: metodo que borre el fichero
            return true;
        }else{
            System.out.println("Usuario no es el creador de la reseña"); // FIXME: cambiar idioma
            return false;
        }

    }

    public boolean ratingReview(Review review,User user,Integer score){

        if(!review.getUser().getEmail().equals(user.getEmail())){
            review.getRatings().put(user,score);
            //TODO: metodo que añada opinion a critica en  el fichero
            return true;
        }else{
            System.out.println("Usuario es el creador de la reseña"); // FIXME: cambiar idioma
            return false;
        }
    }

    public Map<Review,Integer> searchReviewsOfUser(User user){
        Map<Review,Integer> reviews = new HashMap<Review,Integer>();
        // TODO: Metodo para buscar reviews de un usuario
        return reviews;
    }

}
