// Even or odd
import java.util.Scanner;
class ifelse
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter frist number");
int a=obj.nextInt();
if(a%2==0)
{
System.out.println("Even Number");
}
else
System.out.println("Odd Number");
if(a%2==0&& a>0)
{
	System.out.println(" positive Even Number");
}
if(a%2==0 && a<0)
{
	System.out.println("negative even number Number");
}
	

		
}
}