// String Searching
// int indexOf(int ch)
// int indexOf(String str)
// int indexof(int ch,int Startindex)


class CharfnString5
{
public static void main(String[] args)
{
String S="HELLO STUDENT, ITS CLASS";
System.out.println(S);
System.out.println("index of(T)" + S.indexOf('T'));
System.out.println("index of(ENT)" + S.indexOf("ENT"));
System.out.println("last index of(T)" + S.lastIndexOf('T'));
System.out.println("index of(T)" + S.indexOf('T',5));
}
}
