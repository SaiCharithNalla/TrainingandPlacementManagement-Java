package Review2;
import java.util.*;
class Address
{
Scanner sc =new Scanner(System.in);
String House_no,city,street,state;
int pincode,count,n;
void getAddress()
{
System.out.println("........PLEASE PROVIDE YOUR RESIDENTIAL ADDRESS........");
System.out.println("Enter House_no:");
House_no=sc.nextLine();
System.out.println("Enter street:");
street=sc.nextLine();
System.out.println("Enter city:");
city=sc.nextLine();
System.out.println("Enter state:");
state=sc.nextLine();
while(true)
{
count=0;
System.out.println("Enter pincode:");
pincode=sc.nextInt();

n=pincode;
while(n>0)
{
count++;
n=n/10;
}
if(count==6)
{
	System.out.println("ADDRESS SAVED");
break;
}
else
{
System.out.println("Invalid Format");
continue;
}
}
}
public static void main(String args[])
{
Address obj =new Address();
obj.getAddress();
}
}