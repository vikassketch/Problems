package PROBLEMS;
import java.util.Scanner;

public class StartingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total no of bus stops[No of bus stops should be less than 10 power 4].");
		
		int x=sc.nextInt();
		while(x>Math.pow(10,4)) 
		  {
			  System.out.println("Enter valid total no of bus stops according to above said condition.");
			  x=sc.nextInt();
		  }
		 
		//System.out.println(x);
		
		int[] buses=new int[x];
		
		for(int i=0;i<x;i++) 
		{
			System.out.print("enter no of buses that can be boarder from ");
			System.out.println(i+1 +" th stop");
			int y=sc.nextInt();
			while(y>100)
			{
				 System.out.println("Valid total no of buses that can be boarded from a bus stop is <= 100.");
				 y=sc.nextInt();
			}
			buses[i]=y;
		}
		
		int[] result=new int[x];
		
		for(int j=0;j<x;j++) 
		{
			
				result[j]=buses[j];
			
			int p=1;
			int s=j+1;
			while(p<s)
			{
				if(s%p==0) 
				{
					result[j]-=result[p-1];
				}
				p++;
			}
				
			
		}
		for(int j=0;j<x;j++) 
		{
			System.out.print("The no of buses originating from ");
			System.out.println(j+1 +" th stop are:");
			System.out.print(result[j] + " ");
			System.out.println("");
		}
			

	}

}
