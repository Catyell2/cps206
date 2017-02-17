package edu.jalc.inclass.cocacola.recipe.store;

import edu.jalc.inclass.cocacola.employee;
import edu.jalc.inclass.cocacola.recipe;

/*

		This is a store of secret recipes.

		There can only be one instance of the store!
		The store houses a collection of recipes that require a pin number to access.
		This pin number belongs to an employee, so only that employee, using their pin, can access the recipe!
		Make sure your `getRecipe` method checks for the employee's pin against the recipes pin! If the pins do not
		match, throw an exception.
 */
public class SecretRecipeStore {

    private static SecretRecipeStore secretRecipeStore = null;

    private HashMap<Recipe,PinNumber> secretRecipes;


    public static SecretRecipeStore getInstance(){
      if (secretRecipes == null) secretRecipes= new SecretRecipeStore();
      secretRecipeStore = new HashMap<>();
      return secretRecipeStore;
    }

    public void addRecipe(Recipe recipe, Employee employee){
      secretRecipeStore.put(recipe, employee.getPinNumber());
      return this;
    }

    public void getRecipe(String name, Employee employee){
      for (Recipe recipe:secretRecipes.keySet()){
        if Recipe name = this.name();
      }


    }

}
