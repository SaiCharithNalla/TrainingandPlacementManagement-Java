package Review2;
import java.util.*;
class Recruiter
{
Scanner sc=new Scanner(System.in);
String surname,Gmail,a;
int numlen=10,c,count,tem,count1,count2=0;
long t;
void Surname()
{
System.out.println("Enter Recruiter_name");
System.out.println("With lower case(a-z)");
while(true)
{
	surname=sc.nextLine();
	c=0;
	for(int i=0;i<surname.length();i++)
	{

		if(surname.charAt(i)>=97 && surname.charAt(i)<=122)		
		{
		c=c+1;
		}
	}
	if(c==surname.length())
	{
	break;
	}
	else
	{
	System.out.println("Invalid Format");
	continue;
	}
}
}
void mobileNo()
{
System.out.println("Enter phone number(10 digits)");
while(true)
{
count=0;
count2=0;
a=sc.nextLine();
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)>=48 && a.charAt(i)<=57)
{
count2++;
}

}
if(count2==10)
{
}
else
{
System.out.println("Invalid Format");
continue;
}
t=Long.parseLong(a);
while(t>0)
{
count++;
t=t/10;
}
if(count==10)
{
break;
}
else
{
System.out.println("Invalid Format");
continue;
}
}
}
void mail()
{
System.out.println("Enter Email with");
System.out.println("only num(0-9)");
System.out.println("only lowercase(a-z)");
System.out.println("only applicable for gmail(ENDS WITH @gmail.com)");
while(true)
{
count1=0;
Gmail=sc.nextLine();
if(Gmail.endsWith("@gmail.com"))
{

}
else
{
System.out.println("Invalid Format only gmails are allowed");
continue;
}
tem=Gmail.length()-10;
for(int i=0;i<tem;i++)
{
if((Gmail.charAt(i)>=97 && Gmail.charAt(i)<=122) || (Gmail.charAt(i)>=48 && Gmail.charAt(i)<=57) || Gmail.charAt(i)==46)
{
count1++;
}
}
if(count1==tem)
{
System.out.println("DETAILS NOTED");
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
Recruiter obj=new Recruiter();
obj.Surname();
obj.mobileNo();
obj.mail();
}
}
