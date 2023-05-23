package part5.ex13;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money adition){
        int newEuros;
        int newCent;
        newEuros = this.euros + adition.euros;
        newCent = this.cents+adition.cents;
        while(cents>99){
            newEuros+=1;
            newCent-=100;
        }
        return new Money(newEuros,newCent);
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros== compared.euros){
            if(this.cents<compared.cents){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public Money minus(Money decreaser){
        if(this.euros<decreaser.euros){
            return new Money(0,0);
        }else if(this.euros == decreaser.euros){
            if(this.cents < decreaser.cents){

                return new Money(0,0);
            }else {
                return new Money(this.euros-decreaser.euros , this.cents - decreaser.cents );
            }
        }else {
            if (this.cents >= decreaser.cents){
                return new Money(this.euros-decreaser.euros , this.cents - decreaser.cents );
            }else{
                return new Money(this.euros- 1 -decreaser.euros , this.cents + 100  - decreaser.cents );
            }
        }
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
