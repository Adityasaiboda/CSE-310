// greater number
import java.util.Scanner;
class greaternumber
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter frist number");
char a=obj.nextChar();
System.out.println("enter Second number");
int b=obj.nextInt();
System.out.println("enter Third number");
int c=obj.nextInt();
if(a>b && a>c)
{
System.out.println("First is greater");
}
else if(b>a && b>c)
{	
System.out.println("Second is greater");
}
else 
	System.out.println("Third is greater");
}
}

