import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		int a,min=0;
		Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 int n[]=new int[a];
		for(int i=0;i<a;i++)
		{
			n[i]=s.nextInt();
		}
		min=n[0];
		for(int j=0;j<a;j++)
		{
		if(min>n[j])
			min=n[j];
		}
			 System.out.println(min);
	}

}
