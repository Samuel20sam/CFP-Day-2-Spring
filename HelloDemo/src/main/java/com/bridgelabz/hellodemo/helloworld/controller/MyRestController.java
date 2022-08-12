package com.bridgelabz.hellodemo.helloworld.controller;

import com.bridgelabz.hellodemo.helloworld.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyRestController {

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Samuel Elijah!!!";
    }

    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone!!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + ", Welcome";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + "Mr/Mrs." + name  + " Welcome";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + " Welcome";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " welcome to spring framework";
    }
}