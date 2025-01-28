package Ex6;
import java.util.Scanner;
public class BubbleSort implements Sortable{
	@Override
	public void Sort(int array[], int size){
        //login for bubble sort
        for (int i = 0; i <= size -1 ; i++){
            for (int j = 0; j <= size - i - 2; j++){
                if (array[j] < array[j+1]){
                    // int temp = array[j];
                    // array[j] = array[j+1];
                    // array[j+1] = temp;
                    swap (array, j, j+1);
                }
            }
        }
    }
    public static void swap(int array[], int i, int j){
        //login for swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void display(int array[]){
        //login for display array
    	System.out.println("========== BubbleSort ==========");
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
}
