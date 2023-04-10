import java.util.Scanner;
class fn3{

public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
 
 int c =a+b;
 int a =0,b=1;
 
  System.out.println("How many numbers do you want to print");
 int n = obj.nextInt();
 System.out.println(a);
  System.out.println(b);
 
 
 for(int i=3;i<=n;i++)
 {
	System.out.println(c); 
 a=b;
 b=c;
 c=a+b;
 }
}



}