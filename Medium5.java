import java.util.Scanner;

public class Medium5 {

	public static void main(String[] args) {
int n,temp;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(a[a.length/2]);

	}

}
