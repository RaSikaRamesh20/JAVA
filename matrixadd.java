package cO1;
import java.util.Scanner;
public class matrixadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,i,j;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the row and column size: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		int [][]m1=new int[r][c];
		int [][]m2=new int[r][c];
		int [][]sum=new int[r][c];
		
		System.out.println("Enter the first matrix: ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix: ");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		
		System.out.println("Sum of Matrices");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}