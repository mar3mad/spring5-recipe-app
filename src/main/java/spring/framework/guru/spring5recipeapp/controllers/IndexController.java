package spring.framework.guru.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.framework.guru.spring5recipeapp.domain.Category;
import spring.framework.guru.spring5recipeapp.domain.UnitOfMeasure;
import spring.framework.guru.spring5recipeapp.repositories.CategoryRepository;
import spring.framework.guru.spring5recipeapp.repositories.RecipeRepository;
import spring.framework.guru.spring5recipeapp.repositories.UnitOfMeasureRepository;
import spring.framework.guru.spring5recipeapp.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
