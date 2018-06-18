import java.net.*;
import java.io.*;
class  Serv
{
    public static void main(String args[])throws Exception
    {
        ServerSocket s=new ServerSocket (2000);
        Socket s0=s.accept();
        System.out.println("Connection Established");
        DataInputStream dis=new DataInputStream(s0.getInputStream());
        DataOutputStream dos=new DataOutputStream(s0.getOutputStream());
        String str=dis.readLine();
        Runtime r=Runtime.getRuntime();
        Process p=null;
        p=r.exec(str);
        System.out.println("Cmd: "+str);
        dos.writeBytes("Successfully Executed\n");
    }
}
