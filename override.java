// second user of super-> to call the member function
// super.member function number

class B3
{
int i,j;
B3(int a,int b)
{
	i=a;j=b;
}
void show()
{
	System.out.println("i and j is=" + i + " " + j);
}

}
class B extends B3
{
int k;
B(int a,int b,int c)
{
super(a,b);;
k=c;
}
void show(String msg)
{
	super.show();
System.out.println(msg+ k);
//System.out.println("i in derived class" + i);
}
}
class override
{
public static void main(String[] args)
{
B obj=new B(1,2,3);
obj.show();
obj.show("k is=");
}
}