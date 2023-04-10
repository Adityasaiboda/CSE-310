interface A
{
public void fn(int a,int b);
}

class lamdaE
{
public static void main(String[] args)
{
A obj=(int a, int b)-> (a+b);


System.out.println(obj.fn(5,6));

}
}
