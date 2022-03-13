package PROBLEMS;
import java.util.Scanner;

public class Interns {
	
	public static int binarySearch(int z,int[] passTeller,int x,int y) 
	{
		if(x==y) 
		{
			if(passTeller[x]==z) 
			{
				return x;
			}
			else 
			{
				return -1;
			}
		}
		else {
		
		int mid=(x+y)/2;
		if(passTeller[mid]==z) 
		{
			return mid;
		}
		else if(passTeller[mid]>z)
		{
			return binarySearch(z,passTeller,0,mid-1);
		}
		else 
		{
			return binarySearch(z,passTeller,mid+1,y);
		}
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password which is used by an intern on a particular day");
		int y=sc.nextInt();
		if(y<5000) 
		{
			System.out.println("You Have Entered a Wrong Password.Try Again");
		}
		else
		{
		int z=y%5000;
		int[] passTeller=new int[50];
		for(int i=0;i<passTeller.length;i++) 
		{
			if(i==0) 
			{
				passTeller[i]=0;
			}
			else {
			passTeller[i]=passTeller[i-1]+(i-1)+1;
			}
		}
//		for(int i=0;i<passTeller.length;i++) 
//		{
//			System.out.print(passTeller[i] + " ");
//		}
		
		int n=binarySearch(z,passTeller,0,passTeller.length-1);
		if(n==-1)
		{
			System.out.println("You Have Entered a Wrong Password.Try Again");
		}
		else {
		int q=(y/5000)-n;
		
		System.out.println("This Password is used by " + q +"th Intern on " + n + "th day.{Index of Days start from 0,so technically it's " + (n+1) + "th day out of 50 days.}");
		}
		}
		sc.close();
	}

}
