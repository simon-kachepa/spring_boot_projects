package com.kachepasimon;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post-order")
    public String sendOrder(@RequestBody Order order) {
        return "Hello World from Customer: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String sendOrderRecord(@RequestBody OrderRecord order) {
        return "Hello World from Customer: " + order.toString();
    }

    @GetMapping("/get-path-var/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName) {
        return "Hello World from " + userName;
    }

    @GetMapping("/get-request-param")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-last-name") String userLastName
    ) {
        return "Hello World from " + userName + " " + userLastName;
    }

}
