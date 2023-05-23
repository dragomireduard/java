package part8.ex10;

import java.util.HashMap;

public class IOU {
    HashMap<String, Double> hashmap;
    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String person , double amount){
        hashmap.put(person, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if(hashmap.containsKey(toWhom)){
            return hashmap.get(toWhom);
        }
        return 0;
    }

    public void printValues(){
        for(String key : hashmap.keySet()){
            System.out.println(key + " " + hashmap.get(key));
        }
    }
}
