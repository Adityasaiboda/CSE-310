// sum of n natrual number using the function and return the value to the main
import java.util.Scanner;
class fn2{
 static int add(int n)
{
	
	int sum=0;
if(n==0){
	return 0;
}
else
	return n+sum(n-1);
}
public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
 int n = obj.nextInt();
int c =add(n);
System.out.println(c);
}



}
