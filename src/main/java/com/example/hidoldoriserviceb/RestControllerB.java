package com.example.hidoldoriserviceb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("hidoldori/lab/hidoldori-service-b")
public class RestControllerB {

    private TestServiceB testServiceB;

    public RestControllerB(TestServiceB testServiceB){
        this.testServiceB = testServiceB;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test( ){
        log.debug("#RestControllerB.test is started#");

        testServiceB.test();

        log.debug("#RestControllerB.test is Ended#");
        return "#WEB B Call Success";
    }



}
