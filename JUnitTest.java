package com.example.michael.assignment2;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class JUnitTest {
    private validator v = new validator();

    @Test
    public void test1(){
        assertFalse(v.PWformat("password"));
    }

    @Test
    public void test2(){
        assertFalse(v.PWformat("pass"));
    }

    @Test
    public void test3(){
        assertFalse(v.PWformat("Password!"));
    }

    @Test
    public void test4(){
        assertTrue(v.PWformat("PPassword"));
    }

    @Test
    public void test5(){
        assertFalse(v.PWformat("ppassword"));
    }
}