package PROBLEMS;
import java.util.Scanner;

public class ExtractYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string with DD-MM-YYYY formats in it");
		String str=sc.nextLine();
		str=str.replaceAll("[^\\d+]", " ");
		str=str.replaceAll(" +", " ");
		str=str.trim();
//		System.out.println("These are the dates mentioned in your string:"+str);
		
		String[] str2=str.split(" ");
		
//		for(int a=0;a<str2.length;a++)
//		{
//			System.out.println(str2[a]);
//		}
		
		String[] str3= new String[str2.length];
		int i=0;
		int count=0;
		while(i*3+2<str2.length)
		{
			str3[i]=str2[i*3+2];
			++i;
			++count;
		}
		System.out.println("The years present are: ");
		int j=0;
		while(j<count) 
		{
		  System.out.print(str3[j]);
		  System.out.print(",");
		  j++;
		}
		
		String cmp=str3[0];
		int z=1,x=1;
		while(z<count) 
		{
			String cmp1=str3[z];
			if(!cmp.equals(cmp1)) 
			{
			++x;	
			}
			z++;
		}
		System.out.println("\n" + "The no of distinct years in your string are: " + x);
	
		
		
	}

}
