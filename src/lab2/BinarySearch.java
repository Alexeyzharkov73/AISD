package lab2;

public class BinarySearch {
	 public int search(int[] array,int x) {
        int i = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high)/2;
                if (x == array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}
