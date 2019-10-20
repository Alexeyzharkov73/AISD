package lab2;

import java.util.ArrayList;

public class LCS {
	
	public String[][] lcs(int[] firstSequence, int[] secondSequence){
		String[][] result = new String[firstSequence.length + 1][secondSequence.length + 1];
		for(int i = 0; i<firstSequence.length + 1; i++) {
			for(int j = 0; j<secondSequence.length + 1; j++) {
				result[i][j] = "";
			}
		}
		for(int i = 1; i<=firstSequence.length; i++) {
			for(int j = 1; j<=secondSequence.length; j++) {
				if(firstSequence[i - 1] == secondSequence[j - 1]) {
					result[i][j] = result[i -1][j -1] + firstSequence[i-1] + " ";
				} else {
					if(result[i][j - 1].length() > result[i - 1][j].length()) {
						result[i][j] = result[i][j - 1];
					} else {
						result[i][j] = result[i - 1][j];
					}
				}
			}
		}
		return result;
	}
}

