/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemSet3 {
	
	Scanner in = new Scanner(System.in);

	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		
		ps3.dateFashion(5, 10);
		ps3.dateFashion(5, 5);
		ps3.dateFashion(2, 8);
		ps3.fizzString("fig");
		ps3.fizzString("dib");
		ps3.fizzString("fib");
		ps3.fizzString("abc");
		ps3.squirrelPlay(70, false);
		ps3.squirrelPlay(95, false);
		ps3.squirrelPlay(95, true);
		ps3.fizzStringAgain(2);
		ps3.fizzStringAgain(9);
		ps3.fizzStringAgain(10);
		ps3.fizzStringAgain(15);
		ps3.makeBricks(3, 1, 8);
		ps3.makeBricks(3, 1, 9);
		ps3.makeBricks(3, 2, 10);
		ps3.loneSum(1, 2, 3);
		ps3.loneSum(3, 2, 3);
		ps3.loneSum(3, 3, 3);
		ps3.luckySum(1, 2, 3);
		ps3.luckySum(1, 2, 13);
		ps3.luckySum(1, 13, 3);
		ps3.factorialWithFor(3);
		ps3.factorialWithFor(4);
		ps3.factorialWithFor(5);
		ps3.factorialWithWhile(3);
		ps3.factorialWithWhile(4);
		ps3.factorialWithWhile(5);
		ps3.isPrime(1);
		ps3.isPrime(2);
		ps3.isPrime(17);
		ps3.isPrime(144);
	}
		
	public void dateFashion(int you, int date) {
		if ((you >= 8 && date > 2) || (date >= 8  && you > 2)) {
			System.out.println("YES");
		}
		else if ((you > 2 && you < 8) && (date > 2 && date < 8)) {
			System.out.println("MAYBE");
		}
		else if (you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else {
			System.out.println("You are off the charts. Please try again");
		}
		System.out.print("\n");
	}
	
	public void fizzString(String str) {
		char fLet = str.charAt(0);
		char lLet = str.charAt(str.length() - 1);
		if (fLet == 'f') {
			System.out.print("FIZZ");
		}
		if(lLet == 'b') {
				System.out.print("BUZZ");
		}
		else if(fLet != 'f' && lLet != 'b') {
			System.out.println(str);
		}
		System.out.print("\n");
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true) {
			if (temp >= 60 && temp <= 100) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
		}
		else {
			if (temp >= 60 && temp <= 90) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
		}
		System.out.println("\n");
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 == 0) {
			System.out.print("FIZZ");
		}
		if (n % 5 == 0) {
			System.out.print("BUZZ");
		}
		else if (n % 3 != 0 && n % 5 != 0){
			System.out.print(n);
		}
		System.out.println("!");
	}
	
	public void makeBricks(int small, int big, int goal) {
		
		if (big == 0) {
			if(goal > small) {
				System.out.print("NO");
			}
			else {
				System.out.print("YES");
			}
		}
		else if (goal % (5 * big) <= small) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
		System.out.print("\n");
	}
	
	public void loneSum(int a, int b, int c) {
		int sum = 0;
		if (a != b && a != c) {
			sum += a;
		}
		if (b != a && b != c) {
			sum += b;
		}
		if (c != a && c != b) {
			sum += c;
		}
		System.out.print(sum + "\n");
	}
	
	public void luckySum(int a, int b, int c) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		
		int sum = 0;
		for(int i = 0; i <= nums.size() - 1; i++) {
			switch (nums.get(i)){
				case 13:
					i = nums.size();
					break;
				default:
					sum += nums.get(i);
					break;
			}
		}
		System.out.println(sum);
	}
	
	public void factorialWithFor(int n) {
		int sum = 1;
		for (int start = n; start > 0; start--) {
			sum *= start;
		}
		System.out.println(n + "! = " + sum);
	}
	
	public void factorialWithWhile(int n) {
		int sum = 1;
		int start = n;
		while (start > 0) {
			sum *= start;
			start --;
		}
		System.out.println(n + "! = " + sum);
	}
	
	public void isPrime(int n) {
		int factor;
		if(n == 1 || n == 0) {
			System.out.println("NOT PRIME");
		}
		for(factor = 2; factor < n; factor++) {
			if (n % factor == 0) {
				System.out.println("NOT PRIME");
				factor = n + 5;
			}
		}
		if(factor == n) {
			System.out.println("PRIME");
		}
	}
}