// prime number
import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
	Scanner obj = new Scanner(System.in);
System.out.println("enter the number");
int n = obj.nextInt();
int i,flag=0;
for(i=2;i<=n-1;i++)
{
if(n%i==0)
{
flag=1;
break;
}
if(flag==1)
{
System.out.println("Prime Number");

}
else{
	System.out.println("Not a Prime");
}
}
}
}