package Review2;
import java.util.*;
class Training
{
Scanner sc =new Scanner(System.in);
String period,date,time,venue,Hr;
void updateTrainingStudent()
{
System.out.println("........GIVE TRAINING DETAILS TO STUDENTS........");
System.out.println("Enter Training_period:");
period=sc.nextLine();
System.out.println("Enter Training_date(dd/mm/yyyy):");
date=sc.nextLine();
System.out.println("Enter Training_starttime(Hr:min(AM/PM)):");
time=sc.nextLine();
System.out.println("Enter Training_endtime(Hr:min(AM/PM)):");
time=sc.nextLine();
System.out.println("Enter Training_venue:");
venue=sc.nextLine();
System.out.println("Enter HR name:");
Hr=sc.nextLine();
System.out.println("TRAINING DETAILS SAVED SUCCESSFULLY");
}
public static void main(String args[])
{
Training obj=new Training();
obj.updateTrainingStudent();
}
}
