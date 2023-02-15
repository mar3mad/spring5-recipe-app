package spring.framework.guru.spring5recipeapp.services;

import org.springframework.stereotype.Service;
import spring.framework.guru.spring5recipeapp.commands.*;
import spring.framework.guru.spring5recipeapp.domain.Recipe;

import java.util.Set;
public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}
