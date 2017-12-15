package com.service.sunpeng001.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSunpeng001 {

        Sunpeng001Delegate sunpeng001Delegate = new Sunpeng001Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sunpeng001Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}