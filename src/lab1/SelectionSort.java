package lab1;

public class SelectionSort {
	
	public int[] sort(int[] array) {
		int minIndex;
		for(int i = 0; i < array.length;  i++) {
			minIndex = i;
			for(int j = i; j < array.length; j++) {
				if(array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			int tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
		return array;
	}
}
