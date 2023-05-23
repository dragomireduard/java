package part5.ex3;

public class Cube {
    public int edgeLength;

    public Cube(int l){
        this.edgeLength=l;
    }

    public int volume(){
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }

    public String toString(){
        return "The length of the edge is "+this.edgeLength+ " and the volume "+volume();
    }
}
