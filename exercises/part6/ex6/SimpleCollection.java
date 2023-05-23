package part6.ex6;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        int l=0;
        String name="";
        if(elements.isEmpty()){
            return null;
        }
        for(String element : elements)
            if(element.length()>l){
                l=element.length();
                name=element;
            }
        return name;
    }

    public String toString(){
        if(elements.size()==0){
            return "The collection "+ this.name + " is empty.";
        }else if(elements.size()==1){
            return "The collection has 1 element:\n"+ elements.get(0);
        }else{
            String list="";
            for(String element:elements ){
                list+=element+"\n";
            }
            return "The collection "+this.name+" has "+this.elements.size()+" elements:\n"+list;
        }
    }
}
