package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping  // @GetMapping - Indicacao para indicar que responde um get do http
	ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "3455667", "1234"); //1L para indicar que é long
		return ResponseEntity.ok().body(u);
	}
}
