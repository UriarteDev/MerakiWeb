package com.meraki.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	private Long id;
	private String correo;
	private String name;
	private String dni;
	private String password;
	private String role;
}
