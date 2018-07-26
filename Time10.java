import java.util.Scanner;
import java.util.*;
public class Time10 {

	public static void main(String[] args) {
int hour1,hour2;
int min1,min2;
Scanner c=new Scanner(System.in);
hour1=c.nextInt();
min1=c.nextInt();
hour2=c.nextInt();
min2=c.nextInt();
System.out.println(Math.abs(hour1-hour2)+" "+Math.abs(min1-min2));
	}

}
