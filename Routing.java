import java.io.*;
class Route
{
int cost[][]=new int[10][10];
boolean known[]=new boolean[10];
int d[]=new int[10];
int p[]=new int[10];
String route=new String();
int n,s,i;
DataInputStream inp=new DataInputStream(System.in);
void initialize()throws IOException
{
int i,j;
System.out.println("Enter Source");
s=Integer.parseInt(inp.readLine());
System.out.println("Enter no of host");
n=Integer.parseInt(inp.readLine());
System.out.println("Enter cost matrix");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
cost[i][j]=Integer.parseInt(inp.readLine());
for(i=1;i<=n;i++)
{
known[i]=false;
p[i]=0;
d[i]=99;
}
}

void shortpath()
{
int numhost=1,h=1,min;
d[s]=0;
p[s]=0;
while(numhost<=n)
{
min=999;
for(i=1;i<=n;i++)
{
if((d[i]<min)&&(!known[i]))
{
min=d[i];
h=i;
}
}
known[n]=true;
for(i=1;i<=n;i++)
{
if(cost[h][i]!=0)
if((!known[i])&&(d[h]+cost[h][i]<d[i]))
{
d[i]=d[h]+cost[h][i];
p[i]=h;
}
}
numhost++;
}
}

void display()
{
int j=0;
System.out.println("shortest route from host "+s+" to all nodes");
System.out.println("Host\t\tDist\t\tRoute");
for(i=1;i<=n;i++)
{
 j=p[i];
if(i!=s)
route="H"+Integer.toString(p[i]);
route=Integer.toString(p[i]);
while(p[j]!=0)
{
route="H"+Integer.toString(p[j])+" "+route;
j=p[j];
}
System.out.println("H"+i+"\t\t"+d[i]+"\t\t"+route);
}
}
}

public class Routing
{
public static void main(String args[])throws Exception
{
Route r=new Route();
r.initialize();
r.shortpath();
r.display();
}
}
