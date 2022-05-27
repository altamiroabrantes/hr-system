package br.com.altamiro.payrollapi.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.altamiro.payrollapi.domain.User;

@FeignClient(value = "user-api")
public interface UserFeign {
	
	@GetMapping(value = "/api/users/{id}")
	ResponseEntity<User> findById(@PathVariable Long id);
	
	@GetMapping
	ResponseEntity<List<User>> finddAll();
}
