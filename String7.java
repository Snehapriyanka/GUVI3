import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
Scanner c=new Scanner(System.in);
String n=c.nextLine();
boolean num=true;
try
{
	Double b=Double.parseDouble(n);
	}
catch(NumberFormatException e)
{
	num=false;
}
if(num)
	System.out.println(n+" yes");
else
	System.out.println(n+" no");

	}

}
