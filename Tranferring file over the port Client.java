import java.net.*;
import java.io.*;
class Client
{
public static void main(String args[])throws Exception
{
Socket s1=new Socket ("localhost",2000);
System.out.println("Connection Established");
DataInputStream cmd=new DataInputStream(System.in);
DataInputStream dis=new DataInputStream(s1.getInputStream());
DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
System.out.println("Enter Filename:");
String str=cmd.readLine();
dos.writeBytes(str+"\n");
System.out.println("Enter new name:");
String st=cmd.readLine();
FileOutputStream fos=new FileOutputStream(st);
int j;
while((j=dis.read())!=-1)
{
 fos.write((char)j);
}
System.out.println("File Received");
fos.close();
s1.close();
}
}

