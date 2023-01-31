package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {
    private User user1;
    private User user2;
    private User user3;


    @BeforeEach
    public void newObject (String[] args) {
        user1 = new User("login", "email@mail.ru");
        user2 = new User();
        user3 = new User("login", "emailmailru");
    }

    @Test
    public void createAnObjectAllArgs(){
        String login = "login";
        String email = "email@mail.ru";

        assertEquals(user1.getLogin(), login);
        assertEquals(user1.getEmail(), email);
    }
    @Test
    public void createAnObjectNoArgs(){
        assertNull(user2.getLogin());
        assertNull(user2.getEmail());
    }
    @Test
    public void presenceOfSymbols(){
        boolean check;
        if (user1.getEmail().contains("@") && user1.getEmail().contains(".")){
            check = true;
        } else check = false;

        assertTrue(check);
    }

    @Test
    public void loginEqualsEmail(){
        assertNotEquals(user1.getLogin(), user1.getEmail());
    }

}
