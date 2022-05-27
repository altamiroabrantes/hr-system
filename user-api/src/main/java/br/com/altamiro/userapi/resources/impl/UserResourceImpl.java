package br.com.altamiro.userapi.resources.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.altamiro.userapi.domain.User;
import br.com.altamiro.userapi.resources.UserResource;
import br.com.altamiro.userapi.services.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource{

	@Autowired
	private UserService service;
	
	@Override
	public ResponseEntity<User> findById(Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> finddAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	
}
