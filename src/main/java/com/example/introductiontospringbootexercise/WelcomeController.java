package com.example.introductiontospringbootexercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {


    @GetMapping("/name")
    public String getName() {
        return "My name is Reema";
    }

    @GetMapping("/age")
    public String getAge(){
        return "My age is 24";
    }

    @GetMapping("/status")
    public String getCheckStatus (){
       return "Everything is OK";
    }

    @GetMapping("/health")
    public String gethealth (){
        return "Server health is up and running";
    }

    @GetMapping("/arrayOfNames")
    public ArrayList <String> getNames (){
        ArrayList<String> names = new ArrayList<>();
        names.add("Manal");
        names.add("Nawaf");
        names.add("Rawan");
        names.add("Reema");
        names.add("Saud");
        return names;
    }



}
