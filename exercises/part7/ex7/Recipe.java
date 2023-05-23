package part7.ex7;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name , int time , ArrayList<String> ingredients){
        this.name=name;
        this.time=time;
        this.ingredients=ingredients;
    }
    public boolean containIngr (String ingredient){
        if(ingredients.contains(ingredient)){
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }


    public String toString(){

        return this.name +", cooking time: " + this.time;
    }

}
