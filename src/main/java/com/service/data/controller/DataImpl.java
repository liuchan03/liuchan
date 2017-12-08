package com.service.data.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-08T14:02:32.659Z")

@RestSchema(schemaId = "data")
@RequestMapping(path = "/data", produces = MediaType.APPLICATION_JSON)
public class DataImpl {

    @Autowired
    private DataDelegate userDataDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDataDelegate.helloworld(name);
    }

}
