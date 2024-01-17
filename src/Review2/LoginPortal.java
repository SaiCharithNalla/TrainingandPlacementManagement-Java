package Review2;
import java.util.*;
class LoginPortal
{
Scanner sc=new Scanner(System.in);
String username,password;
void getCredentials()
{
System.out.println("........WELCOME TO LOGIN PORTAL........");
System.out.println("........PLEASE ENTER VALID LOGIN CREDENTIALS........");
System.out.println("Enter UserName:");
username=sc.nextLine();
}
void validateCredentials()
{
System.out.println("Enter password:");
password=sc.nextLine();
System.out.println("LOGGED IN SUCCESSFULLY");
}
public static void main(String args[])
{
LoginPortal obj = new LoginPortal();
obj.getCredentials();
obj.validateCredentials();
}
}
