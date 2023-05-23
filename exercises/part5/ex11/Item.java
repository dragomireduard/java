package part5.ex11;

public class Item {
    String identifier;
    String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object compared){
        if(compared == this){
            return true;
        }

        if(!(compared instanceof Item)){
            return false;
        }

        Item newItem = (Item) compared;

        if(this.identifier.equals(newItem.identifier)){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return this.identifier+" : "+this.name;
    }
}
