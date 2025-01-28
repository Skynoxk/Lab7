package Ex6;

public class InsertionSort implements Sortable{
	@Override
	public void Sort ( int array[], int size ) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= size - 1; i++) {
		      int key = array[i];
		      int j = i - 1;
		      while (j >= 0 && array[j] < key) {
		        array[j + 1] = array[j];
		        j = j - 1;
		      }
		      array[j + 1] = key;
		    }
		
	}
	@Override
	  public void display(int array[]) {
		System.out.println("========== Insertion sort ==========");
	    for (int x : array) {
	      System.out.print(x + " ");
	   
	    }
	    System.out.println(" ");
	  }


}
