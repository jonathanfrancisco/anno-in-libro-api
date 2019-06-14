package com.yearbook.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@Size(min=4)
	private String username;
	
	@NotEmpty
	@Size(min=4)
	private String password;
	
}
