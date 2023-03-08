package com.example.demo.Models;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recipeId;
	private String recipeName;
	private String mainIngrediant;
	private String origin;
	private String procedure;
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(int recipeId, String recipeName, String mainIngrediant, String origin, String procedure) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.mainIngrediant = mainIngrediant;
		this.origin = origin;
		this.procedure = procedure;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getMainIngrediant() {
		return mainIngrediant;
	}
	public void setMainIngrediant(String mainIngrediant) {
		this.mainIngrediant = mainIngrediant;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	
	
	
	
	
	
	
	

}
