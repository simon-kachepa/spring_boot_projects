package com.kachepasimon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //Getting message from the server
    @GetMapping("/get")
    public String getMessage() {
        return "Hello World from my first controller";
    }

    //Sending message to the server
    @PostMapping("/post")
    public String sendMessage(@RequestBody String name) {
        return "Hello World from: " + name;
    }

}
