package part6.ex8;

import java.util.ArrayList;

public class Suitcase {
    ArrayList<Item> items;
    int maxWeight;

    public Suitcase(int max){
        this.maxWeight = max;
        items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int totalWeight() {
        int weight = 0;

        for (Item e : items) {
            weight += e.getWeight();
        }
        return weight;
    }


    public void addItem(Item item){
        if(maxWeight>= totalWeight()+item.getWeight()) {
            items.add(item);
        }else{
            return;
        }
    }

    public String toString(){
        if(items.size()==0){
            return "no items"+" ("+totalWeight()+" kg)";
        }else if(items.size()==1){
            return "1 item"+" ("+totalWeight()+" kg)";
        }else {
            return items.size() +" items"+ " (" + totalWeight() + " kg)";
        }
    }
    public void printItems(){
        if(items.isEmpty()){
            return ;
        }else{
            for(Item item:items){
                System.out.println(item);
            }
        }
    }

    public Item heaviestItem (){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item item : items){
            if(item.getWeight()>heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
