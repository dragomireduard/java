package part5.ex7;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment auxiliar){
        if(this.squares>= auxiliar.squares){
            return true;
        }else {
            return false;
        }
    }

    public int price(){
        return squares*pricePerSquare;
    }

    public int priceDifference(Apartment auxiliar){
        if(price()>=auxiliar.price()){
            return price()- auxiliar.price();
        }else{
            return auxiliar.price()-price();
        }
    }

    public boolean moreExpensiveThan(Apartment compared){
        if(price()> compared.price()){
            return true;
        }else {
            return false;
        }
    }
}
