import java.util.Scanner;

public class sum1 {

	public static void main(String[] args) {
		int a,n,d,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
a=s.nextInt();
d=s.nextInt();
for(int i=0;i<n;i++) {
	sum=sum+a;
	a=a+d;
}
System.out.println(sum);
	}

}
