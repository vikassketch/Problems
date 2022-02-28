package PROBLEMS;

import java.util.Scanner;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int x)
	{
		data=x;
		left=right=null;
	}
	
}

class ConstructTree
{
	Node root;
	static int preIndex=0;
	
	public Node buildTree(int[] inOrder,int[] preOrder, int firstIndex,int lastIndex) 
	{
		
		Node node=new Node(preOrder[preIndex++]);
		if(firstIndex==lastIndex) 
		{
			return node;
		}
		int inIndex=search(inOrder,node.data,firstIndex,lastIndex);
		node.left=buildTree(inOrder,preOrder,firstIndex,inIndex-1);
		node.right=buildTree(inOrder,preOrder,inIndex+1,lastIndex);
		return node;
	}
	
	
	public int search(int[] inOrder,int data,int firstIndex,int lastIndex ) 
	{
		int a;
		for(a=firstIndex;a<=lastIndex;a++)
		{
		  if(inOrder[a]==data)
		  {	
		    return a;
		  }
		  
		}
		return a;
	}
	
}

public class SherlockNaiveApproach {

	public static void printPostOrder(Node node) 
	{
		if(node==null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.data + " ");
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
		
		ConstructTree cnt=new ConstructTree();
		
	    cnt.root=cnt.buildTree(inOrder,preOrder,0,x-1);
		System.out.println("The Postorder Traversal of The Given Sherlock Tree is:");
		printPostOrder(cnt.root);
		sc.close();

	}

}
