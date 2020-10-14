import java.util.Scanner;
public class Day4Assignment3
{
	public static void main(String Args[])
	{
		int sum=0;
		int []arr=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			int f=i+1;
			System.out.print("Enter "+f+" No:");
			arr[i]=s.nextInt();
		}
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("The sum of all elements of array= "+sum);
	}
	
}