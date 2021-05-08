import java.util.Scanner;
public class typecasting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
long d=a;    //widening typecasting
long f=b;    //widening
short e=(short)c;		//narrowing typecasting
byte g=(byte)e;
float h=a;
System.out.println("long value"+d);
System.out.println("long value"+f);
System.out.println("short value"+e);
System.out.println("byte value"+g);
System.out.println("float value"+h);
}
}