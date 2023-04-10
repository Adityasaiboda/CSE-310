//scope of varible
class lifetime
{
public static void main(String[] args)
{
int x; //this variable is avalible to entire program
x=10;
if(x==10)
{
int y=20;  // y is declared inside this scope only.
x=y*2;
}
//y=100 // give me error
System.out.println(x);
}
}