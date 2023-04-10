// counters
class counter1
{
int count=0;
void get()
{
count++;
System.out.println(count);
}
public static void main(String[] args)
{
counter1 obj1=new counter1();
obj1.get(); 

counter1 obj2=new counter1();
obj2.get();
counter1 obj3=new counter1();
obj3.get();

}
}