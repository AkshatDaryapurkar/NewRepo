import java.util.Scanner;
public class Interest_Amount
{
public static void main (String[] args)
{
Scanner s = new Scanner (System.in);
System.out.println("Enter name : ");
String name = s.next();
System.out.println("Enter age : ");
int age = s.nextInt();
System.out.println("Enter gender : ");
String gender = s.next();
if(gender=='Female')
{
int rf = 2; 
System.out.println("Enter principal amount : ");
float P = s.nextFloat();
System.out.println("Enter time period : ");
float T = s.nextFloat();
float interest_amt = (P*rf*T)/100;
System.out.printf("Interest amount is : %f Rs.",interest_amt);
}
else
{
int rm = 8;
System.out.println("Enter principal amount : ");
float P = s.nextFloat();
System.out.println("Enter time period : ");
float T = s.nextFloat();
float interest_amt = (P*rm*T)/100;
System.out.printf("Interest amount is : %f Rs.",interest_amt);
}
s.close();
}
}
