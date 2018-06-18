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
    while(true)
    {
      String msg=dis.readLine();
      if(msg.equals("exit"))
      {
        System.out.println("Client Terminated");
        break;
      }
      else
      {
        System.out.println("Msg; "+msg);
        dos.writeBytes(msg+"\n");
      }
    }
  }
}
