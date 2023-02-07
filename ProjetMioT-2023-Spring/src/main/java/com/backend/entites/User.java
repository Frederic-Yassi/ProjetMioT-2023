package com.backend.entites;

public class User {
    int id;
    String email;
    String username;

    String nom;
    String prenom ;
    String role;
    String num;


    String address;
    public User(int id, String email, String username,String nom , String prenom, String role, String num, String address){
        this.id=id;
        this.email=email;
        this.username = username;
        this.nom=nom ;
        this.prenom=prenom ;
        this.role=role;
        this.num=num;
        this.address=address;
    }
    public User(){
        this.id=-1;
        this.email=null;
        this.username =null;
        this.nom=null ;
        this.prenom=null ;
        this.role=null;
        this.num=null;
        this.address=null;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNum() {
        return num;
    }

    public String getRole() {
        return role;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setNum(String num) {
        this.num = num;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAddress(String address) {this.address = address;}

    public void setEmail(String email) { this.email = email;}

    public void setNom(String nom) {this.nom=nom;}

    public void setPrenom(String prenom) {this.prenom=prenom;}

}
