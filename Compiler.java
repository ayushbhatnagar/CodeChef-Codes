/* CodeChef #stack
	Java Solution for: COMPILER
	@author: Ayush Bhatnagar*/

import java.util.*;
public class Compiler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			String str = sc.nextLine();
			Stack <Character> stk = new Stack <>();
			int c = 0, cf = 0;
			for(int i = 0; i < str.length(); i++) {
				char x = str.charAt(i);
				if(x == '<')
					stk.push(x);
				else if(stk.empty()) {
					break;
				}
				else {
					stk.pop();
					c++;
					if(stk.empty()) {
					    cf += c;
					    c = 0;
					}
				}
			}
			System.out.println(cf * 2);
		}
	}
}
