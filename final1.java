//final keyword -> method
import java.util.Scanner;
class A
{
final void show()
{
System.out.println("Base class");
}}
class B extends A
{
void show()
{
System.out.println("derived class");
}
}
class final1
{
public static void main(String[] args)
{
B obj=new B();
obj.show();
}
}