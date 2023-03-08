package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Recipe;
import com.example.demo.Repositories.RecipeRepository;
import com.example.demo.Services.RecipeService;

@RestController
@CrossOrigin
public class RecipeController {
		@Autowired
		RecipeRepository recRep;

		@Autowired
		RecipeService service;
		
		@GetMapping("/display")
		public List<Recipe> display(){
			return recRep.findAll();
		}
		
		@PostMapping("/create")
		public String create(@RequestBody Recipe reci) {
			return service.createRecipe(reci);
		}
		
		@PutMapping("/update")
		public String update(@RequestBody Recipe rec) {
			return service.updateDetails(rec);
		}
		
		@DeleteMapping("/delete")
		public String delete(@RequestParam int recipeId) {
			return service.deleteDetails(recipeId);
		}
		
		@GetMapping("/update/{offset}/{pageSize}")
		public List<Recipe> recipeWithPagination(@PathVariable int offset,@PathVariable int pageSize){      
			return service.setPages(offset,pageSize);
		}
		
		@GetMapping("/recipeDetails/{recipeName}")
		public List<Recipe> gettrecipeName(@PathVariable String recipeName){
			return service.findByrecipeNameStartingWith(recipeName);
		}
}
