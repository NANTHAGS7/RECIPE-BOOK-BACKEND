package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {



	List<Recipe> findByrecipeNameStartingWith(String recipeName);


	

}
