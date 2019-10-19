package lab1;

public class Main {
	
	public static void main(String[] arg) {
		Stack<String> test = new Stack<String>();
		for(int i = 0; i<3; i++) {
			test.push(i + "");
		}
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println();
		
		
		
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = (int)((Math.random() * 30) - 15);
		}
		SelectionSort ss = new SelectionSort();
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		array = ss.sort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = (int)((Math.random() * 30) - 15);
		}
		MergeSort ms = new MergeSort();
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		ms.sort(array);
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
