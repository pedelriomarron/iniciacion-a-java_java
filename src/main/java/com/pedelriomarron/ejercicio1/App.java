package com.pedelriomarron.ejercicio1;

import com.pedelriomarron.ejercicio1.dao.impl.UserDaoImpl;
import com.pedelriomarron.ejercicio1.dao.sqlite.SQLiteConnectionDao;
import com.pedelriomarron.ejercicio1.manager.ReviewsManager;
import com.pedelriomarron.ejercicio1.users.User;
import com.pedelriomarron.ejercicio1.users.UserBuilder;
import org.sqlite.SQLiteConnection;

public class App {

    public static void main(String[] args) {
        System.out.println("Test");
        new SQLiteConnectionDao();
        User user = new UserBuilder()
                .withEmail("pedro@doee")
                .withUsername("marron")
                .withName("pe","r")
                .build();

       // ReviewsManager.getReviewsManager().register("pedro@doee","Pedro","deroo","perico");
        ReviewsManager.getReviewsManager().unsubscribe(user);

    }
}
