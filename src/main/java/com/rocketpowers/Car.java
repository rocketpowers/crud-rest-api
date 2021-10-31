package com.rocketpowers;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String marca;
	String modelo;
	Integer ano;






}
