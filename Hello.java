// method overloading in java 
// by changing number of arguments and by change

class Hello
{
static int add(int a, int b)
{
return(a+b);
}
static double add(double a,double b)
{
return (a+b);
}
public static void main(String[] args)
{
System.out.println(Hello.add(5,6));
System.out.println(Hello.add(5.5,6.6));
}
}
