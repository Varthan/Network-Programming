import java.net.*;
import java.io.*;
class Client
{
    public static void main(String args[])throws Exception
    {
        Socket s1=new Socket (InetAddress.getByName("localhost"),2000);
        System.out.println("Connection Established");
      
        DataInputStream cmd=new DataInputStream(System.in);
        DataInputStream dis=new DataInputStream(s1.getInputStream());
        DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
      
        System.out.println("Enter Command:");
        String str=cmd.readLine();
        dos.writeBytes(str+"\n");
      
        InetAddress ip=InetAddress.getByName("localhost");
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        s1.close();
    }
}
