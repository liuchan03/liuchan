package com.service.sunpeng001.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T06:53:59.669Z")

@RestSchema(schemaId = "sunpeng001")
@RequestMapping(path = "/sunpeng001", produces = MediaType.APPLICATION_JSON)
public class Sunpeng001Impl {

    @Autowired
    private Sunpeng001Delegate userSunpeng001Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSunpeng001Delegate.helloworld(name);
    }

}
