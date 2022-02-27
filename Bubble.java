package PROBLEMS;
import java.util.Scanner;
public class Bubble {
	public int bubbleSort(int[] arr,int k)
	{
		int b=arr.length;
		int c;
		for(int j=0;j<k;j++)
		{		
			for(int i=0;i<b-1;i++) 
		
		{
			if(arr[i]>arr[i+1])
			{
				c=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=c;
			}
		}
		}
		/*System.out.println("New values are" + " ");
		for(int i=0;i<b;i++) {
			System.out.print(arr[i] + " ");
		}*/
		int result=0;
		for(int x=0;x<k;x++)
		{
		result+=arr[b-1];
		b--;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble obj=new Bubble();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total no of participants");
		int i=sc.nextInt();
		int[] a=new int[i];
		System.out.println("Enter marks scored by each participant");
		for(int x=0;x<i;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Marks scored by participants are:");
		for(int x=0;x<i;x++)
		{
			System.out.print(a[x] + " ");
		}
		System.out.println(" ");
		System.out.println("How many top scorers you want?");
		int k=sc.nextInt();
		int result=obj.bubbleSort(a,k);
		//System.out.println("");
		System.out.println("Total Marks Scored By Top " + k + " scorers are: " + result);
		
		sc.close();

	}

}
