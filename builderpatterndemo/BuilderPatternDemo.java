/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author BUKET
 */
public class BuilderPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" +vegMeal.getCost());
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n \n Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " +nonVegMeal.getCost());
        
        
        
        
    }
    
}
