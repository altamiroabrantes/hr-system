package br.com.altamiro.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	private String email;
	private String password;
	private Double hourlyPrice;
}
