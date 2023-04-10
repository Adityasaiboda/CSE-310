// find the even numbers in the range of 1 to 100 and print them 
import java.util.Scanner;
class even
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int i;
for(i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println(i+" ");
}
}
}
}