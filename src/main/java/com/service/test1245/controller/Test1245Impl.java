package com.service.test1245.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-16T03:28:02.160Z")

@RestSchema(schemaId = "test1245")
@RequestMapping(path = "/test1245", produces = MediaType.APPLICATION_JSON)
public class Test1245Impl {

    @Autowired
    private Test1245Delegate userTest1245Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest1245Delegate.helloworld(name);
    }

}
