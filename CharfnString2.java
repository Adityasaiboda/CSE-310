// String comaparison
// Compar To // Program for String sorting
class CharfnString
{
public static void main(String[] args)
{
String arr[]={"Now","is","KLO","NOW","for","good","Country","to"};

for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[j].comparTo(arr[i]))}
{
String t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
System.out.println(arr[i]);
}
}
}