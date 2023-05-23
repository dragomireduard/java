package part7.ex7;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList= new ArrayList<>();

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName);

        System.out.println("");
        while(true) {
            System.out.println("Commands: \nlist - lists the recipes \nstop - stops the program"
                    + "\nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time"
                    + " \nfind ingredient - searches recipes by ingredient");
            System.out.println("");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    if(recipeList.isEmpty()){
                        System.out.println("List is empty");
                    }
                    for (Recipe r : recipeList)
                        System.out.println(r);
                    break;
                case "stop":
                    return;
                case "find name":
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
                    for(Recipe recipe : recipeList){
                        if(recipe.getName().contains(word)){
                            System.out.println(recipe);
                        }
                    }
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time:");
                    int maxTime = Integer.valueOf(scanner.nextLine());
                    for(Recipe recipe : recipeList){
                        if(recipe.getTime()<=maxTime){
                            System.out.println(recipe);
                        }
                    }
                    break;

                case "find ingredient":
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();
                    for(Recipe recipe : recipeList){
                        if(recipe.containIngr(ingredient)){
                            System.out.println(recipe);
                        }
                    }
                    break;
            }
        }
    }
    public void readFile(String fileName) {

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.equals("")) {
                    continue;
                }

                String name = line;

                int time = Integer.valueOf(fileReader.nextLine());

                ArrayList<String> ings = new ArrayList();

                while (fileReader.hasNextLine()) {

                    String ingredient = fileReader.nextLine();
                      if (ingredient.isEmpty()) {
                        break;
                    }

                    ings.add(ingredient);
                }

                this.recipeList.add(new Recipe(name, time, ings));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("eroare la citire");
        }

    }
}
