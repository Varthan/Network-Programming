import java.net.*;
import java.io.*;
class Server
{
public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket (2000);
Socket s0=s.accept();
System.out.println("Connection Established");
DataInputStream dis=new DataInputStream(s0.getInputStream());
DataOutputStream dos=new DataOutputStream(s0.getOutputStream());
String str=dis.readLine();
FileInputStream fis=new FileInputStream(str);
int j;
while((j=fis.read())!=-1)
{
 dos.writeBytes(" "+(char)j);
}
System.out.println("Finished");
s0.close();
}
}

