package org.exercise;
import java.util.*;

public class LeftRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size and number of rotation ?");
        String firstLine = sc.nextLine();
        System.out.println("Array's content ?");
        String secondLine = sc.nextLine();
        sc.close();

        String[] array = firstLine.split(" ");
        int size = Integer.parseInt(array[0]);
        int shifts = Integer.parseInt(array[1]);
        String[] numbers = secondLine.split(" ");
        int[] arrayReturn = new int[size];

        for (int i=0; i<size; i++){
            if ((i-shifts) >= 0){
                arrayReturn[i-shifts] = Integer.parseInt(numbers[i]);
            }
            else {
                arrayReturn[i-shifts+size] = Integer.parseInt(numbers[i]);
            }
        }
        System.out.print(Arrays.toString(arrayReturn));
    }
}
