import java.net.*;
import java.io.*;
class  Server
{
public static void main(String args[])throws Exception
{
ServerSocket s=new ServerSocket (2000);
Socket s0=s.accept();
System.out.println("Connection Established");
String ip[]={"10.1.6.1","213.51.16.98","26.54.32.10"};
String mac[]={"A2:D3:56:3F:BC:9D","51:A6:6D:32:98:FA","24:DA:D8:9D:FF:01"};
DataInputStream dis=new DataInputStream(s0.getInputStream());
DataOutputStream dos=new DataOutputStream(s0.getOutputStream());
int a=0;
String str=dis.readLine();
for(int i=0;i<ip.length;i++)
{
 if(str.equals(ip[i]))
 {
  a=1;
  dos.writeBytes(mac[i]);
 }
}
if(a==0)
System.out.println("IP DOES NOT EXIST");
System.out.println("	Operation Success");
s0.close();
}
}