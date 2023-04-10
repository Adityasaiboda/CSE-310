import java.util.Scanner;
class A
{
int rollno;
String name;
int sub1,sub2;
void get()
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter rollno,name and 2 subjects marks=");
rollno=obj.nextInt();
name= obj.nextLine();


}
}
class B extends A
{
void print(){
System.out.println("rollno is="+rollno);
System.out.println("name is="+name);

}}
class A1
{
int sub1,sub2;
void get1()
{
Scanner obj= new Scanner(System.in);
System.out.println("2 subjects marks=");
sub1= obj.nextInt();
sub2= obj.nextInt();
}
}
javac inher.java
class C extends A1
{
int sum;float per;
void show()
{
sum=sub1+sub2;
per=(sum/200)*100;
System.out.println("sum is"+sum);
System.out.println("percentage is"+per);
}
}
class inher
{
public static void main(String[] args)
{
B obj1=new obj B; C obj2= new obj C;
obj1.get();
obj1.print();
obj2.get1();
obj2.show();
}
}
