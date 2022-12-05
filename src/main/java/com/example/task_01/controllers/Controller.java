package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/greeting")
@RestController
public class Controller {




//    @GetMapping
//    public String greeting(@RequestParam(value = "name") String name,
//                           @RequestParam(value = "timeOfDay") String timeOfDay) {
//        return "Good " + timeOfDay + ", " + name;
//    }
    @GetMapping
    public ResponseEntity<Greeting> getRequestGreeting(@RequestParam (value = "name") String name,
                                                @RequestParam (value = "timeOfDay") String timeOfDay){

         Greeting greeting = new Greeting(name, timeOfDay);
         return new ResponseEntity<>(greeting, HttpStatus.OK);

    }

    @GetMapping("/christmas")
    public ResponseEntity<Celebration>  getRequestCelebration(@RequestParam(value = "celebrationMessage") String celebrationMessage){
        Celebration celebration = new Celebration(celebrationMessage);
        return new ResponseEntity<>(celebration, HttpStatus.OK);
    }

}

