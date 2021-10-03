package com.pedelriomarron.ejercicio1.dao.impl;

import com.pedelriomarron.ejercicio1.dao.idao.IUserDao;
import com.pedelriomarron.ejercicio1.dao.sqlite.SQLiteConnectionDao;
import com.pedelriomarron.ejercicio1.users.User;

import java.sql.*;
import java.util.List;

public class UserDaoImpl implements IUserDao {

    private static UserDaoImpl dao = null;

    private static final String DELETE = "DELETE FROM user WHERE email=?";
    private static final String FIND_ALL = "SELECT * FROM user ORDER BY email";
    private static final String FIND_BY_ID = "SELECT * FROM user WHERE email=?";
    private static final String INSERT = "INSERT INTO user(email, name, lastname,username) VALUES(?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE user SET email=?, name=?, lastname=?, username=? WHERE email=?";



    public static UserDaoImpl getDao(){
        if (dao == null){
            dao = new UserDaoImpl();
        }
        return dao;
    }

    @Override
    public User get(String s) {
        return null;
    }

    @Override
    public int create(User user) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = SQLiteConnectionDao.getConnection();
            stmt = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getLastName());
            stmt.setString(4, user.getUsername());

            int result = stmt.executeUpdate();
            /*ResultSet rs = stmt.getGeneratedKeys();*/
            /*
            if (rs.next()) {
                user.setId(rs.getInt(1));
            }
            */
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            SQLiteConnectionDao.closePs(stmt);
            SQLiteConnectionDao.closeConn(conn);
        }
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public int delete(String s) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = SQLiteConnectionDao.getConnection();
            stmt = conn.prepareStatement(DELETE);
            stmt.setString(1, s);

            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            SQLiteConnectionDao.closePs(stmt);
            SQLiteConnectionDao.closeConn(conn);
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
