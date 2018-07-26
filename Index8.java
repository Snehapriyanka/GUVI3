import java.util.Scanner;

public class Index8 {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]+" "+i);
}
	}

}
