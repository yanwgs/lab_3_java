package com.example.Joke.Controller;

import com.example.Joke.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/registration")
public class RegController {
    private final UserService userService;
    public ResponseEntity<Void> registration(@RequestParam("username") String username,
                                             @RequestParam("password") String password
    ){
        userService.registration(username, password);
        return ResponseEntity.ok().build();
    }
}