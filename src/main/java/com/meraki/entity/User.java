package com.meraki.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(nullable = false, unique = true)
	private String correo;
    
    @Column(nullable = false)
	private String name;    
    
	@Column(nullable = false, unique = true)
	private String dni;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String role;
}
