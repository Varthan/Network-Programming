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
        System.out.println("Enter MAC Address:");
        String msg=cmd.readLine();
        dos.writeBytes(msg+"\n");
        String echo=dis.readLine();
        System.out.println("IP Address is : "+echo);
        s1.close();
    }
}
