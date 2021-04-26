package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	private String addCommasToNumericString(String digits) {
		int len = digits.length();
		String results = "";
		int num = 0;
		for(int i = len-1; i>=0; i--) {	
			results = digits.charAt(i) + results;
			num++;
			if((num% 3 == 0) && (i>0)) {
				results = "," + results;
			}
		}
		return results;
		}
	
	public void run() {
		while (true) {
			String digits = readLine ("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));		
		
		}
	}
}
