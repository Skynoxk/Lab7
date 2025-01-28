package Ex6;

public class SelectionSort implements Sortable {
		@Override
		public void Sort(int[] array, int size) {
			// TODO Auto-generated method stub
			for (int i = 0 ; i <= size - 1 ; i ++){
	            int minIndex = i;
	            for (int j = i + 1 ; j <= size - 1; j++ ){
	                if (array[j] > array[minIndex]){
	                    minIndex = j;
	                }
	            }
	            int temp = array[i];
	            array[i] = array[minIndex];
	            array[minIndex] = temp;
	        }
			
		}
		@Override
		public void display(int[] array) {
			// TODO Auto-generated method stub
			System.out.println("========== Selection sort ==========");
			for (int x : array){
	            System.out.print( x + " ");
	        }
			
		}
}
