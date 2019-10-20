package lab2;

public class Bubble {

	public int[] sort(int[] array) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted=true;
			for(int i = 0; i<array.length-1;i++) {
				if(array[i] > array[i+1]) {
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					isSorted=false;
				}
			}
		}
		return array;
	}
}
