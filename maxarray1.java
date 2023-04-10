// maximum number in a array
import java.util.Scanner;
class maxarray1
{
public static void main(String[] args)
{
	int a[]=new int[5],i,max=a[0];
	Scanner obj = new Scanner(System.in);
System.out.println("enter the  elements of the array");
for(i=0;i<5;i++)
{
a[i] = obj.nextInt();
}
for(i=1;i<5;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("the maximum array is"+ max);
}
}