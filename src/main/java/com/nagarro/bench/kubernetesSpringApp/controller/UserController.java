package com.nagarro.bench.kubernetesSpringApp.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.bench.kubernetesSpringApp.model.User;

@RestController
public class UserController {
	
	  private List<User> userList = new ArrayList<>();

	  public UserController() {
	        userList.add(new User(1, "Tushar", "tushar@gmail.com", "+919036547821"));
	        userList.add(new User(2, "Shradha", "shradha@gmail.com", "+919653217821"));
	        userList.add(new User(3, "Vandana", "vandana@gmail.com", "+919090876821"));
	        userList.add(new User(4, "Khushi", "khushi@gmail.com", "+919036992131"));
	        userList.add(new User(5, "Lavina", "lavina@gmail.com", "+919235547821"));
	   }
	  
	  @GetMapping("/")
	  public String home() {
		  return "Running Kubernetes App Successfully !";
	  }
	  
	  @GetMapping("/users")
	    public List<User> getAllUsers() {
	        return userList;
	    }
	  
 }
