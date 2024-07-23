package com.stock.controller;

import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.Prediction;
import com.stock.entity.User;
import com.stock.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	 @PostMapping("/user")
	    public String createUser(@RequestBody User user) throws ExecutionException, InterruptedException {
	        return userService.saveUser(user);
	    }

	    @GetMapping("/user/{email}")
	    public User getUser(@PathVariable String email) throws ExecutionException, InterruptedException {
	        return userService.getUser(email);
	    }

	    @PostMapping("/user/{email}/prediction")
	    public String addPrediction(@PathVariable String email, @RequestBody Prediction prediction) throws ExecutionException, InterruptedException {
	        return userService.addPrediction(email, prediction);
	    }
}
