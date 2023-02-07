package com.backend.controller;


import com.backend.Functions_bdd.db;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);
    @GetMapping("/api/testApi")
    public String testApi() {
        logger.debug("Test connexion à l'API ");
        return "API est effectivement accessible !";
    }

    @GetMapping("/api/testBdd")
    public String testBdd() {
        logger.debug("Test connexion à la BDD ");
        try {
            db.testConnect();
        }
        catch (Exception e){
            logger.error(e);
            return "Impossible de se connecter la BDD !";
        }
        return "Connection à la BDD ok !";
    }


    @GetMapping("/api/auth")
    public boolean Authentification(@PathParam("username") String username ,
                                   @PathParam("pwd") String pwd) {
        Boolean result;
        try {
            db.connect();
            int r=db.getIdUser(username, pwd);
            db.deconnect();
            if(r==-1){
                result = false;
            }
            else {
                result = true;
            }
            logger.info("authentification d'un utilisateur ");
            return result;
        }
        catch(Exception e) {
            logger.error(e);
            return false;
        }
    }
}
