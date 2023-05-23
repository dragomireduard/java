package part7.ex3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        sort(numbers);

    }
    public static int smallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        int smallest = array[0];
        for(int number : array){
            if(number <smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        int smallest = array[0];
        int index=0;
        int smallestIndex=0;
        for(int number : array){
            if(number <smallest){
                smallest = number;
                smallestIndex=index;
            }
            index++;
        }
        return smallestIndex;
    }

    public static  int indexOfSmallestFrom(int[] table , int startIndex){
        int smallest=table[startIndex];
        int index = startIndex;
        for(int i = startIndex ; i<table.length ; i++){
            if(table[i]<=smallest){
                smallest = table[i];
                index=i;
            }
        }
        return index;
    }

    public static void swap(int[] array , int index1 , int index2){
        int aux = array[index1];
        array[index1]=array[index2];
        array[index2]=aux;
    }


    public static void sort(int[] array){
        for(int i=0 ; i< array.length ; i++){
            for(int j=0;j< array.length;j++){
                if(array[i]<array[j]){
                    swap(array , i , j);
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
    public static void sort2(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
