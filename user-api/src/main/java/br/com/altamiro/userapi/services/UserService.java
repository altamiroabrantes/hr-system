package br.com.altamiro.userapi.services;

import java.util.List;

import br.com.altamiro.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	
	List<User> findAll();
}
