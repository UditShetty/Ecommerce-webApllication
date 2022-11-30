package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	
	@NotNull(message = "streetNo can't be null")
	@NotBlank(message = "streetNo can't be blank")
	@NotEmpty(message = "streetNo can't be empty")
	private String streetNo;
	
	@NotNull(message = "buildingName can't be null")
	@NotBlank(message = "buildingName can't be blank")
	@NotEmpty(message = "buildingName can't be empty")
	private String buildingName;
	
	
	@NotNull(message = "city can't be null")
	@NotBlank(message = "city can't be blank")
	@NotEmpty(message = "city can't be empty")
	private String city;
	
	
	
	@NotNull(message = "state can't be null")
	@NotBlank(message = "state can't be blank")
	@NotEmpty(message = "state can't be empty")
	private String state;
	
	@NotNull(message = "country can't be null")
	@NotBlank(message = "country can't be blank")
	@NotEmpty(message = "country can't be empty")
	private String country;
	
	
	
	@NotNull(message="pincode can't be null")
	@Pattern(regexp="[0-9]{6}", message = "Only Valid for 6 digit indian pincode")
	private String pincode;
	
}
