package part6.ex10;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> taskList ;

    public TodoList(){
        taskList = new ArrayList<>();
    }

    public void add(String task){
        taskList.add(task);
    }

    public void print(){
        int index=1;
        for(String task:taskList){
            System.out.println(index+": "+task);
            index++;
        }
    }

    public void remove(int number){
        taskList.remove(number-1);
    }
}
