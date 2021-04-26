package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		
		String x= "Healthy Lebron and AD means Lakers in 6 ";
		int size = x.length();
		char key = 'a';
		
		int i = 0;
		String res = "";
		while (i != size) {
			if (x.charAt(0) != key) {
				res =res + x.charAt(i);
			}
			++i;
		}
		System.out.println(res);

	}
	
}
