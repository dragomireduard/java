package part5.ex9;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Person compared){
        if(compared == this){
            return true;
        }

        if(!(compared instanceof Person)){
            return false;
        }

        Person anotherPerson = (Person) compared;
        if(this.height==anotherPerson.height && this.weight==anotherPerson.weight && this.name.equals(anotherPerson.name)&& this.birthday.equals(anotherPerson.birthday)){
            return true;
        }

        return false;
    }

}
