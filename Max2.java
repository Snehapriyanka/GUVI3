import java.util.Scanner;

public class Max2 {

	public static void main(String[] args) {
		int a,max=0;
		Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 int n[]=new int[a];
		for(int i=0;i<a;i++)
		{
			n[i]=s.nextInt();
		}
		max=n[0];
		for(int j=0;j<a;j++)
		{
		if(max<n[j])
			max=n[j];
		}
			 System.out.println(max);
				 
	}

}
