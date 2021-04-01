package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOdMeasureRepository;
import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
   /* private CategoryRepository categoryRepository;
    private UnitOdMeasureRepository unitOdMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOdMeasureRepository unitOdMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOdMeasureRepository = unitOdMeasureRepository;
    }*/


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
     /*   Optional<Category>categoryOptional=categoryRepository.findbyDescription("EGYPTIAN");
        Optional<UnitOfMeasure>unitOfMeasureOptional=unitOdMeasureRepository.findbyDescription("CUP");
        System.out.println("Cat Id"+categoryOptional.get().getId());
        System.out.println("Unit Id"+unitOfMeasureOptional.get().getId());*/
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
