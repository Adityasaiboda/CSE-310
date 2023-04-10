import java.util.Scanner;
class A
{
String author[],title[],publisher[];
int price[],stock position[];
void get()
{
Scanner obj= new Scanner(System.in);
for(int i=1;i<7;i++){
author[i]=obj.nextLine();
title[i]= obj.nextLine();
publisher[i]=obj.nextLine();
price[i]=obj.nextInt();
Stock position[i]=obj.nextInt();

}
}
void print()
{
System.out.println("enter the title and author=");
int t=obj.nextInt();
String a=obj.next.Line();
if(t==title || a=author)
{
System.out.println("no of copies="+Stock publisher);
System.out.println("price="+price);
}
}
