package PROBLEMS;
import java.util.Scanner;
public class ComputerNetwork {
	
	public static int tellingTopology(int[] start,int[] end,int x) 
	{
		
		int[] visited=new int[x];
		for(int i=0;i<visited.length;i++) 
		{
			visited[i]=0;
		}
		boolean a=false;
		for(int i=0;i<end.length-1;i++) 
		{
			if(end[i]!=end[i+1]) 
			{
				a=true;
				break;
			}
		}
		if(a==false) 
		{
			return 2;
		}
		
		for(int i=0;i<end.length;i++) 
		{
			if(i==0) 
			{
				int z=start[0];
				visited[z-1]++;
			}
			int z=end[i];
			visited[z-1]++;
		}
		for(int i=0;i<visited.length-1;i++) 
		{
			if(visited[i]!=visited[i+1]) 
			{
				a=false;
				break;
			}
		}
		if(a==false) 
		{
			return 3 ;
		}
		else 
		{
			return 1;
		}
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of nodes in your topology");
		int x=sc.nextInt();
		System.out.println("Enter no of links in your topology");
		int y=sc.nextInt();
		int[] start=new int[y];
		int[] end=new int[y];
		System.out.println("Enter starting nodes of links in your topology");
		for(int i=0;i<y;i++) 
		{
			start[i]=sc.nextInt();
		}
		System.out.println("Enter ending nodes of links in your topology");
		for(int i=0;i<y;i++) 
		{
			end[i]=sc.nextInt();
		}
		
		int z=tellingTopology(start,end,x);
        System.out.println(z);
        sc.close();


	}

}
