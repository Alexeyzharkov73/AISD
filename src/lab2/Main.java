package lab2;

public class Main {

	public static void main(String[] args) {
		CoinTask ct = new CoinTask();
		ct.exchange(1000000);
		
		LCS lcs = new LCS();
		int[] first = {1, 2, 3, 5, 9, 14, 8, -1};
		int[] second = {2, 3, 4, 7, 5, 11, 14, -1};
		String[][] result = lcs.lcs(first, second);
		for(int i  = 0; i< result.length; i++) {
			for(int j = 0; j <result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		int n = 10;
		int[] array = new int[n];
		for(int i = 0; i<n; i++) {
			array[i] = ((int) (Math.random() * 30) - 15);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Bubble bubble = new Bubble();
		array = bubble.sort(array);
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		int[] sortedArray = {1, 2, 3, 4, 7, 9, 11, 13, 17, 29, 31};
		BinarySearch bs = new BinarySearch();
		int index = bs.search(sortedArray, 13);
		System.out.println(index);
		System.out.println();
		
		int[] sortedArray1 = {1, 2, 3, 4, 7, 9, 11, 13, 17, 29, 31};
		LineSearch ls = new LineSearch();
		int index1 = ls.search(sortedArray1, 13);
		System.out.println(index1);
	}

}
