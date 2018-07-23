import java.util.Scanner;

public class Hour9 {

	public static void main(String[] args) {
int totmin=0;
int hour=0;
int min=0;
Scanner s=new Scanner(System.in);
totmin=s.nextInt();
hour=(int)(totmin/60);
min=(int)(totmin%60);
System.out.print( hour);
System.out.print(" "+min);
	}

}
