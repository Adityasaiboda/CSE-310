// CharfnString
class CharfnString
{
public static void main(String[] args)
{
String A="INDIA";
char c[]=A.toCharArray();
for(int i=0;i<=c.length;i++)
{
if(c[i]>=65&&c[i]<90)
{
c[i]+=32;
System.out.println(c[i]);
}
}
}
}