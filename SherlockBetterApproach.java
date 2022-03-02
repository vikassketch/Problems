package PROBLEMS;

import java.util.*;

public class SherlockBetterApproach {
	public static int searchRootIndex(int[] inOrder,int root,int length ) 
	{
		
		for(int i=0;i<length;i++) 
		{
			if(inOrder[i]==root) 
			{
				return i;
			}
		}
		
	   return 0;
	}
	
	public static void printPostOrder(int[] inOrder,int[] preOrder,int n) 
	{
		int rootIndex=searchRootIndex(inOrder,preOrder[0],n);
		if(rootIndex !=0)
		printPostOrder(Arrays.copyOfRange(inOrder,0,rootIndex),Arrays.copyOfRange(preOrder,1,n),rootIndex);
		if(rootIndex!=n-1)
			printPostOrder(Arrays.copyOfRange(inOrder, rootIndex+1,n),Arrays.copyOfRange(preOrder,rootIndex+1,n),n-rootIndex-1);
		
		System.out.print(preOrder[0] + " ");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total No of Nodes in Sherlock Tree");
		int x=sc.nextInt();
		int[] inOrder=new int[x];
		int[] preOrder=new int[x];
		System.out.println("Enter " + x + " Values Representing INORDER of  Sherlock Tree");
		
		for(int i=0;i<x;i++)
		{
			inOrder[i]=sc.nextInt();
		}
		System.out.println("Now Enter " + x + " Values Representing PREORDER of  Sherlock Tree");
		
		for(int i=0;i<x;i++)
		{
			preOrder[i]=sc.nextInt();
		}
		System.out.println("POSTORDER of Sherlock tree is:");
		printPostOrder(inOrder,preOrder,x);
		sc.close();

	}

}
