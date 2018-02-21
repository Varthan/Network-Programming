import java.io.*;
import java.net.*;
class Server
{
 public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket(2000);
Socket s0=s.accept();
System.out.println("Connection Established");
DataInputStream dis=new DataInputStream(s0.getInputStream());
DataOutputStream dos=new DataOutputStream(s0.getOutputStream());
int i=0;
String cn=dis.readLine();
int cnt=Integer.parseInt(cn);
while(i<cnt)
{
String msg=dis.readLine();
System.out.println(msg);
dos.writeBytes(msg+"\n");
i+=1;
}
s0.close();
}
}

