import java.net.*;
import java.io.*;
class Cli
{
public static void main(String args[])throws Exception
{
Socket s1=new Socket ("localhost",2000);
System.out.println("Connection Established");
DataInputStream cmd=new DataInputStream(System.in);
DataInputStream dis=new DataInputStream(s1.getInputStream());
DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
System.out.println("Enter Command:");
String str=cmd.readLine();
dos.writeBytes(str+"\n");
String ab=dis.readLine();
System.out.println(ab);
}
}