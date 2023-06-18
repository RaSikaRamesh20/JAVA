package cO1;
//import scanner class
import java.util.Scanner;
//create class complexNum and its instance for complex numbers
class complexNum{
double rl1,rl2,img1,img2;
}
//main class
public class complex {
//main function
	public static void main(String[] args) {
	//4 objects of class complexNum for real & imaginary part of two complex numbers
		complexNum r1=new complexNum();
		complexNum i1=new complexNum();
		complexNum r2=new complexNum();
		complexNum i2=new complexNum();
		
	//scanner object sc to prompt user to enter two complex numbers
		Scanner sc=new Scanner(System.in);
		
	//prompt user to enter first complex numbers
		System.out.println("-----------ENTER------------");
		System.out.print("Real part of first complex number:");
		r1.rl1=sc.nextDouble();
		System.out.print("Imaginary part of first complex number:");
		i1.img1=sc.nextDouble();
		
	//prompt user to enter second complex numbers
		System.out.print("Real part of second complex number:");
		r2.rl2=sc.nextDouble();
		System.out.print("Imaginary part of second complex number:");
		i2.img2=sc.nextDouble();
		System.out.println();
	//print first and second complex numbers
		System.out.println("First complex number = " +r1.rl1+"+"+i1.img1+"i");
		System.out.println("Second complex number = " +r2.rl2+"+"+i2.img2+"i");
		
	//calculate sum of complex numbers 
		double r=r1.rl1+r2.rl2;
		double i=i1.img1+i2.img2;
	//print sum
		System.out.println();
		System.out.println("---------SUM-----------");
		System.out.println("Sum of the two complex numbers = " +r+"+"+i+"i");
		}
}