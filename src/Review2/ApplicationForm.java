package Review2;
import java.util.*;
class ApplicationForm
{
void getStudentInfo()
{
String surname,Gmail,a;
int numlen=10,c,count,tem,count1,count2=0;
long t;
Scanner sc=new Scanner(System.in);
String Student_Name,DOB,Branch;
System.out.println("........PLEASE FILL OUT THE APPLICATION FORM........");
System.out.println("Enter Student_Name:");
Student_Name=sc.nextLine();
System.out.println("Enter Email with");
System.out.println("num(0-9)");
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
break;
}
else
{
System.out.println("Invalid Format");
continue;
}
}
System.out.println("Enter Date Of Birth(dd/mm/yyyy):");
DOB=sc.nextLine();
System.out.println("Branch:");
Branch=sc.nextLine();
System.out.println("enter the phone number(10 numbers)");
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
System.out.println("DETAILS SAVED.");
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
public static void main(String args[])
{
ApplicationForm obj=new ApplicationForm();
obj.getStudentInfo();
}
}