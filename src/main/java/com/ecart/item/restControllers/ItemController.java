package com.ecart.item.restControllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/api/itemcontroller/test")
public class ItemController
{
    @RequestMapping(value = "/helloworld",
                    method = RequestMethod.GET,
                    produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testingRestContoller()
    {
        return "Hello World";
    }
}
