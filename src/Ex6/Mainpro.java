package Ex6;

import java.util.List;
import java.util.Scanner;
public class Mainpro {
	public static void main(String[] args) {
		System.out.println("Please input size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int [size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the number: ");
            array[i] = input.nextInt();
        }
        //Bubble sort
        BubbleSort test1 = new BubbleSort();
        test1.Sort(array, size);
        test1.display(array);
        // Insertion Sort
        InsertionSort test2 = new InsertionSort();
        test2.Sort(array, size);
        test2.display(array);
        //Selection sort 
        SelectionSort test3 = new SelectionSort();
        test3.Sort(array, size);
        test3.display(array);
        
	}
}
