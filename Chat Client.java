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
while(true)
{
System.out.println("Enter message:");
String msg=cmd.readLine();
if(msg.equals("exit"))
{
dos.writeBytes("Terminated");
break;
}
else
{
dos.writeBytes(msg+"\n");
String str=dis.readLine();
System.out.println("\t>>>"+str);
}
}
s1.close();
}
}