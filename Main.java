import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
 int a,b,c;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the value of A:");
a = obj.nextInt();
System.out.println("Enter the value of B:");
b = obj.nextInt();
c = a+b;
System.out.println("Sum is :"+c);
}
}