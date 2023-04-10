import java.util.Scanner;
class pass
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter frist Subject marks");
int a=obj.nextInt();
System.out.println("enter Second subject marks");
int b=obj.nextInt();
System.out.println("enter Third subject marks");
int c=obj.nextInt();
float arg =(a+b+c)/3f;
if((a>33) && (b>33) &&(c>33) && arg>40)
{
System.out.println("Pass");
}
else
	System.out.println("Fail");
}
}
