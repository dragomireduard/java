package part6.ex8;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    ArrayList<Suitcase> holder;

    public Hold(int weight){
        this.maxWeight=weight;
        holder = new ArrayList<>();
    }

    public int getWeight(){
        int weight = 0;

        for (Suitcase suitcase : holder) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    public void addSuitcase(Suitcase suitcase){
        if(maxWeight>= getWeight()+suitcase.totalWeight()) {
            holder.add(suitcase);
        }else{
            return;
        }
    }

    public String toString(){
        return holder.size() +" suitcases ("+ getWeight()+ " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase :holder){
            for(Item item : suitcase.getItems()){
                System.out.println(item);
            }
        }
    }
}
