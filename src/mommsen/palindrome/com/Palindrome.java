package mommsen.palindrome.com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String reverse = "";
        System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		
		for(int i= original.length()-1;i>=0;i--){
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println("Given string is palindrome");
			System.out.println(reverse);
		}
		else{
			System.out.println("Given string is not a palindrome");
			System.out.println(reverse);
		}
	}

}
