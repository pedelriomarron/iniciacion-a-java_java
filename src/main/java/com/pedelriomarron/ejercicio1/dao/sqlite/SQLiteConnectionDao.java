package com.pedelriomarron.ejercicio1.dao.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnectionDao {


    // Propiedades
    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;


    // Constructor
    public SQLiteConnectionDao(){

        String url = "jdbc:sqlite:database.db";
        String driver = "org.sqlite.JDBC";
        String user = "";
        String password = "";

        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion establecida"); //fixme:traducir
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    } // Fin constructor

    // Métodos
    public static Connection getConnection(){

        if (conn == null){
            new SQLiteConnectionDao();
        }

        return conn;
    } // Fin getConnection

    public static void closePs(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConn(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

}


