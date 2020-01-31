package com.cmancode.lombok.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1587587658759857L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private Long id;
	@Column(length = 30)
	@Getter @Setter
	private String nombre;
	@Column(length = 30)
	@Getter @Setter
	private String apellido;
	

}
