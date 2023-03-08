package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.example.demo.Models.Recipe;
import com.example.demo.Repositories.RecipeRepository;

@Service
public class RecipeService {
	@Autowired
	RecipeRepository recRepo;

	public String createRecipe(Recipe reci) {
		recRepo.save(reci);
		return "POSTED SUCCESSFULLY";
	}

	public String deleteDetails(int recipeId) {
		recRepo.deleteById(recipeId);
		return "DELETED SUCCESSFULLY";
	}

	public String updateDetails(Recipe rec) {
		recRepo.save(rec);
		return "UPDATED SUCCESSFULLY";
	}

	public List<Recipe> setPages(int offset, int pageSize) {
		Page<Recipe> page = recRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}

	public List<Recipe> findByrecipeNameStartingWith(String recipeName) {
		return recRepo.findByrecipeNameStartingWith(recipeName);
	}

	
	

}
