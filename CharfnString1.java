// getchar()=>{int start_index,int end_int end_index,char[],offset}

class CharfnString
{
public static void main(String[] args)
{
String S="INDIA";
char b[]= new char[10];
b[0]='H';
b[1]='o';
b[2]='o';
b[3]='d';
b[4]='o';
S.getChars(0,5,b,4);
System.out.println(b);
}
}

