// Finally block to handle exception in java
class finally1
{
public ststic void main(String[] args)
{
int a=10,b=0,c;
try
{
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("divid by zero not possible");
}
finally1{
System.out.println{"No exception in catch block");
}
System.out.println("end of program");
}
}