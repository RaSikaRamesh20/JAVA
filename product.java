package cO1;
import java.util.Scanner;
class product
{
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		product obj1=new product();
		product obj2=new product();
		product obj3=new product();
		
		System.out.println("Product1 details:-");
		System.out.println("Enter product code:");
		obj1.pcode=sc.nextInt();
		System.out.println("Enter product name:");
		obj1.pname=sc.next();
		System.out.println("Enter product price:");
		obj1.price=sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("Product2 details:-");
		System.out.println("Enter product code:");
		obj2.pcode=sc.nextInt();
		System.out.println("Enter product name:");
		obj2.pname=sc.next();
		System.out.println("Enter product price:");
		obj2.price=sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("Product3 details:-");
		System.out.println("Enter product code:");
		obj3.pcode=sc.nextInt();
		System.out.println("Enter product name:");
		obj3.pname=sc.next();
		System.out.println("Enter product price:");
		obj3.price=sc.nextInt();
		
		product lowest=obj1;
		if(obj2.price<lowest.price)
		{
			lowest=obj2;
		}
		else if (obj3.price<lowest.price)
		{
			lowest=obj3;
		}
		else
		{
			lowest=obj1;
		}
		System.out.println("Details of product with lowest price:-");
		System.out.println("Product code:"+lowest.pcode);
		System.out.println("Product name:"+lowest.pname);
		System.out.println("Product price:"+lowest.price);
	}
}