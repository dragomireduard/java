package part6.ex7;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> listOfPerson;

    public Room(){
        listOfPerson = new ArrayList<>();
    }

    public void add(Person person){
        listOfPerson.add(person);
    }

    public boolean isEmpty(){
        if(listOfPerson.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return listOfPerson;
    }

    public Person shortest(){
        if(listOfPerson.isEmpty()) {
            return null;
        }

        Person aux =this.listOfPerson.get(0);
        for (Person person : listOfPerson){
            if(person.getHeight()< aux.getHeight()){
                aux= person;
            }
        }
        return aux;
    }

    public Person take(){
        Person aux = shortest();
        if(listOfPerson.isEmpty()){
            return null;
        }
        if(listOfPerson.contains(aux)){
            listOfPerson.remove(aux);
        }
        return aux;
    }
}
