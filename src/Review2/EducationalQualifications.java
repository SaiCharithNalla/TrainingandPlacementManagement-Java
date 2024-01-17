package Review2;
import java.util.*;
class EducationalQualifications
{
Scanner sc = new Scanner(System.in);
Double CGPA;
String tern,CourseName;
String companyName,role;

void getInternship()
{
while(true)
{
Scanner scc = new Scanner(System.in);
System.out.println("Have you done any Internship?");
System.out.println("1.yes");
System.out.println("2.no");
tern=scc.nextLine();
 if(tern.equals("yes"))
 {
	 
 System.out.println("Enter CompanyName:");
 companyName=scc.nextLine();
 System.out.println("Enter Role:");
 role=scc.nextLine();
 break;
 }
 else if(tern.equals("no"))
 {
 break;
 }
 else
 {
 System.out.println("invalid Input");
 continue;
 }
 }
}
void courseDone()
{
while(true)
{
Scanner sc = new Scanner(System.in);
String coursedone;
System.out.println("If you done any Courses");
System.out.println("1.yes");
System.out.println("2.no");
coursedone=sc.nextLine();
if(coursedone.equals("yes"))
{
System.out.println("Enter Course Name");
CourseName=sc.nextLine();
System.out.println("Application Form submitted successfully");
break;
}
else if(coursedone.equals("no"))
{
System.out.println("APLICATION FORM SUBMITTED SUCCESSFULLY.");
break;
}
else
{
System.out.println("Invalid input");
continue;
}
}
}
void getCgpa()
{
System.out.println("........Give your Educational Qualifications here........");	
System.out.println("Enter CGPA:");
System.out.println("with one decimal point");
CGPA=sc.nextDouble();

}
public static void main(String args[])
{
EducationalQualifications obj =new EducationalQualifications();
obj.getCgpa();
obj.getInternship();
obj.courseDone();

}
}
