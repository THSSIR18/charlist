import java.util.*;
public class Charlist
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a word: ");
	String enter=sc.nextLine();
	String result="";
	String [] array= new String[enter.length()];
	for(int i=0;i<=array.length-1;i++)
	{
	array[i]=enter.substring(i,i+1);
	}
		for(int i=0;i<enter.length();i++)
		{
			for(int r=i+1;r<enter.length();r++)
			{
				if(array[r].equals(array[i]))
				{
					array[r]="\b";
				}
			}
		}
		for(int i=0;i<=enter.length()-1;i++)
		{
		System.out.print(array[i]+" ");
		}
	}
}