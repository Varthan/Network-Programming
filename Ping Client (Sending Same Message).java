import java.io.*;
import java.net.*;
class Client
{
  public static void main(String args[])throws Exception
  {
    Socket s1=new Socket("localhost",2000);
    System.out.println("Connection Established");
    DataInputStream cmd=new DataInputStream(System.in);
    DataInputStream dis=new DataInputStream(s1.getInputStream());
    DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
    System.out.println("Enter Count:");
    String cn=cmd.readLine();
    int cnt=Integer.parseInt(cn);
    dos.writeBytes(cnt+"\n");
    System.out.println("Enter Msg:");
    String str=cmd.readLine();
    long a,b;
    int i=0;
    while(i<cnt)
    {
      a=System.currentTimeMillis();
      dos.writeBytes(str+"\n");
      String st=dis.readLine();
      System.out.println("\n"+st);
      b=System.currentTimeMillis();
      System.out.println("RTT : "+(b-a)+"ms");
      i+=1;
    }
    s1.close();
  }
}

