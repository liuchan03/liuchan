package com.service.test1245.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest1245 {

        Test1245Delegate test1245Delegate = new Test1245Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test1245Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}