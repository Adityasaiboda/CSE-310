// exception handling in java
class excep
{
	public staic void main(String[] args)
	{
		
int a=10,b=0,c;
try
{
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("divide by zero not possible");
}

)}