package lab2;

public class CoinTask {
	private int tenCount = 0;
	private int fiveCount = 0;
	private int twoCount = 0;
	private int oneCount = 0;

	public void exchange (int value) {
		while(value - 10 >= 0) {
			tenCount++;
			value -= 10;
		}
		while(value - 5 >= 0) {
			fiveCount++;
			value -= 5;
		}
		while(value - 2 >= 0) {
			twoCount++;
			value -= 2;
		}
		while(value - 1 >= 0) {
			oneCount++;
			value -= 1;
		}
		System.out.println(tenCount + " " + fiveCount + " " + twoCount + " " + oneCount);
	}
}
