package Review2;
import java.util.*;
class Company
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int NumberOfJobs;
double cgpa,Cpackage;
String typesOfJob,companyName;
System.out.println("Enter Company Name:");
companyName=sc.nextLine();
System.out.println("Enter Number of Jobs:");
NumberOfJobs=sc.nextInt();
Scanner scc = new Scanner(System.in);
int i;
for(i =1; i <= NumberOfJobs; i++)
{
System.out.println("Enter Type of Job:");
typesOfJob=scc.nextLine();
System.out.println("Enter package:");
Cpackage=sc.nextDouble();
System.out.println("Enter CGPA Required:");
cgpa=sc.nextDouble();
}
System.out.println("DETAILS NOTED");
}
}