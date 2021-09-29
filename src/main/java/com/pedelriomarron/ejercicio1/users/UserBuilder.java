package com.pedelriomarron.ejercicio1.users;

public class UserBuilder {

    private String email;
    private String name;
    private String lastName;
    private String username;

    public UserBuilder(){}

    public UserBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder withName(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withUsername(String username){
        this.username = username;
        return this;
    }


    public User build(){
        User user = new User();

        if(this.email == null){
            throw new IllegalArgumentException("Email is required");
        }
        //TODO: Email sea unico

        user.setEmail(this.email);
        user.setLastName(this.lastName);
        user.setName(this.name);
        user.setUsername(this.username);

        return user;
    }


}
