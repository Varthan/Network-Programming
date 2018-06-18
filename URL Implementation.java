import java.io.*;
import java.net.*;
import java.util.*;
class Url
{
    public static void main(String args[])throws Exception
    {
        URL o = new URL("file:\\E:\\Java\\gv.txt");
        URLConnection u = o.openConnection();
      
        System.out.println(new Date(u.getDate()));
        System.out.println(new Date(u.getLastModified()));
      
        System.out.println(o.getProtocol());
        System.out.println(o.getPath());
        System.out.println(o.getFile());
      
        System.out.println(u.getContentType());
        System.out.println(u.getContentLength());
      
        BufferedReader br = new BufferedReader(new InputStreamReader(u.getInputStream()));
        
        while((String s = br.readLine()) != null)
            System.out.println(s);
      
        br.close();
    }
}
