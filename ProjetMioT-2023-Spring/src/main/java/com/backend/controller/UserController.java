package com.backend.controller;

import com.backend.Functions_bdd.db;
import com.backend.entites.User;
import jakarta.websocket.server.PathParam;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);
    @PostMapping("/api/user/add")
    public void addUser(
            @PathParam("email") String email,
            @PathParam("username") String username,
            @PathParam("nom") String nom,
            @PathParam("prenom") String prenom,
            @PathParam("pwd") String pwd,
            @PathParam("role") String role,
            @PathParam("num") String num,
            @PathParam("address") String address) {
        try{
            db.connect();
            db.addUser(email,username,nom,prenom,pwd,role,num,address);
            int id = getId(username,pwd);
            db.deconnect();
            logger.info("nouvel utilisateur ajouté :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }

    }

    @DeleteMapping("/api/user/delete")
    public void deleteUser(@PathParam("id") int id) {
        try {
            db.connect();
            String username = db.getUserInfo(id).getUsername();
            db.deleteUser(id);
            db.deconnect();
            logger.info("utilisateur "+username+"supprimé");
        }
        catch (Exception e){
            logger.error(e);
        }

    }

    @PutMapping("/api/user/modify/email")
    public void modifyEmail(@PathParam("id") int id,
                           @PathParam("email") String email) {

        try {
            db.connect();
            db.modifyEmailUser(id,email);
            db.deconnect();
            logger.info("modification d'email de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @PutMapping("/api/user/modify/username")
    public void modifyUsername(@PathParam("id") int id,
                           @PathParam("username") String username) {
        try{
            db.connect();
            db.modifyUsernameUser(id,username);
            db.deconnect();
            logger.info("modification de l'username de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @PutMapping("/api/user/modify/nom")
    public void modifyNom(@PathParam("id") int id,
                           @PathParam("nom") String nom) {
        try{
            db.connect();
            db.modifyNomUser(id,nom);
            db.deconnect();
            logger.info("modification de nom de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @PutMapping("/api/user/modify/prenom")
    public void modifyPrenom(@PathParam("id") int id,
                          @PathParam("prenom") String prenom) {
        try{
            db.connect();
            db.modifyPrenomUser(id,prenom);
            db.deconnect();
            logger.info("modification de prenom de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @PutMapping("/api/user/modify/role")
    public void modifyRole(@PathParam("id") int id,
                           @PathParam("role") String role) {

        try{
            db.connect();
            db.modifyRoleUser(id,role);
            db.deconnect();
            logger.info("modification du role de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }

    }

    @PutMapping("/api/user/modify/num")
    public void modifyNum(@PathParam("id") int id,
                          @PathParam("num") String num) {
        try{
            db.connect();
            db.modifyNumUser(id,num);
            db.deconnect();
            logger.info("modification du numero de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @PutMapping("/api/user/modify/pwd")
    public void modifyPwd(@PathParam("id") int id,
                          @PathParam("pwd") String pwd) {
        try{
            db.connect();
            db.modifyPwdUser(id,pwd);
            db.deconnect();
            logger.info("modification du password de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }

    }

    @PutMapping("/api/user/modify/address")
    public void modifyAddress(@PathParam("id") int id,
                          @PathParam("address") String address) {
        try{
            db.connect();
            db.modifyAddressUser(id,address);
            db.deconnect();
            logger.info("modification de l'adresse de l'utilisateur :"+id);
        }
        catch (Exception e){
            logger.error(e);
        }
    }

    @GetMapping("/api/user/get")
    public int getId(@PathParam("username") String username,
                     @PathParam("pwd") String pwd) {
        int res=-1;
        try{
            db.connect();
            res=db.getIdUser(username,pwd);
            db.deconnect();
            logger.info("recherche Id");
        }
        catch (Exception e){
            logger.error(e);
        }
        return res;
    }

    @GetMapping("/api/user/get/all")
    public ArrayList<User> getAll() {
        ArrayList<User> res = new ArrayList<>();
        try{
            db.connect();
            res =db.getAllUser();
            db.deconnect();
            logger.info("recuperation des utilisateurs");
        }
        catch (Exception e){
            logger.error(e);
        }
        return res ;
    }

    @GetMapping("/api/user/get/data")
    public User getInfo(@PathParam("id") int id) {
        User res = new User();
        try{
            db.connect();
            res = db.getUserInfo(id);
            db.deconnect();
            logger.info("recuperation des informations de l'utilisateur : "+id);
        }
        catch (Exception e){
            logger.error(e);
        }
        return res;
    }
}
