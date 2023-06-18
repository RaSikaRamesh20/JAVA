package cO2;
import java.util.Scanner;
public class stringSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		stringSort s=new stringSort();
		System.out.print("Enter number of strings: ");
		int n=in.nextInt();
		String[] str=new String[n];
		System.out.print("Enter strings: ");
		for(int i=0;i<n;i++) {
			str[i]=in.next();
		}
		System.out.print("Before string sorting: ");
		for(int i=0;i<n-1;i++) {
			System.out.print(str[i]);
				System.out.print(", ");
		}
		System.out.print(str[n-1]);
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(str[i].compareTo(str[j])<0){
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.print("After string sort: ");
		for(int i=0;i<n-1;i++) {
			System.out.print(str[i]+", ");
		}
		System.out.print(str[n-1]);
	}
}