package cO2;
import java.util.*;
public class arraySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:- ");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.print("Enter the element to be searched: ");
		int k = in.nextInt();
		int i,flag=0;
		for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println(k+" found at position "+(i + 1));
        }
        else
        {
            System.out.println(k+" not found");
        }
    }
}