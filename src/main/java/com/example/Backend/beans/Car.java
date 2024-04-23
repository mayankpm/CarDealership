package com.example.Backend.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Car implements java.io.Serializable
{
	@Serial
	private static final long serialVersionUID = 1L;
	private int id;
	private String make;
	private String model;
	private String colour;
	private double price;
	private String vin;
	private String dealership;
	
	//To use for moving car from one dealership to another
	private String newDealership;
	
	//Dealership names
	private String[] dealerships = {"Deals_on_Wheels","Steals_and_Deals","Rhyme_and_Crime"};
}