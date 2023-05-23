package part8.ex7;

import java.util.HashMap;

public class Abbreviations {
    HashMap<String , String> library;

    public Abbreviations(){
        library = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation , String explanation){
        library.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(library.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(library.containsKey(abbreviation)){
            return library.get(abbreviation);
        }
        return null;
    }

}
