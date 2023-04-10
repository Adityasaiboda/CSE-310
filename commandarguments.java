// command line arguments
class commandarguments {
public static void main (String[] args)
{
	if (args.length>0)
	{
System.out.println("arguments are");
for(String i:args)
{
	System.out.println(i);
}
}
else 
	System.out.println("no arguments are passes");
}
}