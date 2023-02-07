package com.backend.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testConst(){
        User u = new User(3,
                "TuoGregoire@gmail.com",
                "Gregoire",
                "nom",
                "prenom",
                "eboueur",
                "31654284",
                "2 rue de Lavoisier");
        assertEquals(3,u.getId());
        assertEquals("Gregoire",u.getUsername());
        assertEquals("eboueur",u.getRole());
        assertEquals("31654284",u.getNum());
        assertEquals("2 rue de Lavoisier",u.getAddress());
    }

    @Test
    void testConstVide(){
        User u = new User();
        assertEquals(-1,u.getId());
        assertNull(u.getUsername());
        assertNull(u.getRole());
        assertNull(u.getNum());
        assertNull(u.getAddress());
    }
}