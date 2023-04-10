import java.util.Scanner;
class day1
{
public static void main(String[] args)
 {
        Scanner obj = new Scanner(System.in);

        float a = obj.nextFloat();
        float b = obj.nextFloat();
        float c = obj.nextFloat();
        
        if(a>1 && a<1000 && b>1 && b<1000 && c>1 && c<1000)
        {
            System.out.println(String.format("%.1f",(a+b+c)/3));
        }
        
    }
}