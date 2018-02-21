import java.net.*;
import java.io.*;
class  Server
{
public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket (2000);
Socket s0=s.accept();
System.out.println("Connection Established");
DataInputStream dis=new DataInputStream(s0.getInputStream());
DataOutputStream dos=new DataOutputStream(s0.getOutputStream());
String str=dis.readLine();
System.out.println("CMD :"+str);
s.close();
}
}