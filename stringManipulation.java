package cO2;
import java.util.*;
public class stringManipulation {
	static Scanner in= new Scanner(System.in);
	public static void lowerCase() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		System.out.println("In lowercase= "+str.toLowerCase());
		System.out.println("----------------------------------------");
	}
	public static void upperCase() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		System.out.println("In uppercase= "+str.toUpperCase());
		System.out.println("----------------------------------------");
	}
	public static void replaceCharacter() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		System.out.print("Enter the character to be replaced: ");
		String a=in.nextLine();
		System.out.print("Enter the character to be replaced with: ");
		String b=in.nextLine();
		System.out.println("After replacing= "+str.replace(a, b));
		System.out.println("----------------------------------------");
	}
	public static void reverseString() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		char ch;
		String nstr="";
		for (int i=0; i<str.length(); i++){
	        ch= str.charAt(i);
	        nstr= ch+nstr;
	    }
	    System.out.println("Reversed word= "+ nstr);
	    System.out.println("----------------------------------------");
	}
	public static void concateStrings() {
		System.out.println("Enter two strings: ");
		String a=in.nextLine();
		String b=in.nextLine();
		System.out.println("Concatinated string= "+a+""+b);
		System.out.println("----------------------------------------");
	}
	public static void compareLength() {
		System.out.println("Enter two strings: ");
		String a=in.nextLine();
		String b=in.nextLine();
		if(a.length()==b.length()) {
			System.out.println("Equal length");
		}
		else if(a.length()>b.length()) {
			System.out.println(a+" is the longest word");
		}
		else {
			System.out.println(b+" is the longest word");
		}
		System.out.println("----------------------------------------");
	}
	public static void subString() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		System.out.print("Enter from where you want to extract substring: ");
		int index=in.nextInt();
		System.out.println("Substring= "+str.substring(index));
		System.out.println("----------------------------------------");
	}
	public static void trimString() {
		System.out.print("Enter the string: ");
		String str=in.nextLine();
		String s=str.trim();
		System.out.println("String after trailing space removed="+s);
		System.out.println("----------------------------------------");
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int ch;
		do {
			System.out.println("1. Convert to Lower case\t2. Convert to Upper case\n3. Replace character\t\t4. Reverse the word\n5. Concate two strings\t\t6. Comapare length of two strings\n7. Extract Substring\t\t8. Remove trailing space");
			System.out.print("Enter your choice: ");
			ch=in.nextInt();
			switch(ch) {
				case 1: lowerCase();
						break;
				case 2: upperCase();
						break;
				case 3: replaceCharacter();
						break;
				case 4: reverseString();
						break;
				case 5: concateStrings();
						break;
				case 6: compareLength();
						break;
				case 7: subString();
						break;
				case 8: trimString();
						break;
				default:
						System.out.println("INVALID CHOICE...!");
			}
		}while(ch!=0);
	}
}