package com.example.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
   @GetMapping("/welcome")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the world of CI/CD!";
    }
//    echo "# github-action-example" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/henok256/github-action-example.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
