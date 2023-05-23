package part6.ex5;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts ;
    private int totalWeight;

    public Package(){
        this.gifts = new ArrayList<>();
        this.totalWeight = 0;

    }

    public void addGift(Gift gift){
        this.gifts.add(gift);
        this.totalWeight += gift.getWeight();
    }

    public int totalWeight(){
        return this.totalWeight;
    }
}
