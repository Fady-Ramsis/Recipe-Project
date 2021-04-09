package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeServiceImpl;

    @Mock
    RecipeRepository recipeRepository;

    public void setUp(){
        MockitoAnnotations.initMocks(this);
        recipeServiceImpl=new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {

        Recipe recipe =new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);
        when(recipeServiceImpl.getRecipes()).thenReturn(recipeData);

        Set<Recipe>recipes =recipeServiceImpl.getRecipes();
        assertEquals(recipes.size(),1);
    }
}