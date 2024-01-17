package Review2;
import java.util.*;
class Interview
{
Scanner sc =new Scanner(System.in);
String companyName,date,time,venue;
void updateSelectionStudent()
{
System.out.println("Enter Company Name:");
companyName=sc.nextLine();
System.out.println("Enter Interview_date(dd/mm/yyyy)");
date=sc.nextLine();
System.out.println("Enter Interview_time(Hr:min(AM/PM))");
time=sc.nextLine();
System.out.println("Enter Interview_venue");
venue=sc.nextLine();
System.out.println("INTERVIEW DETAILS UPDATED.");
}
public static void main(String args[])
{
Interview obj=new Interview();
obj.updateSelectionStudent();

}
}
