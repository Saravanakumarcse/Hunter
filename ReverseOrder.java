import java.util.*;
public class ReverseOrder
{
public static void main(String args[]) throws Exception
{
String s=new String[100];
Scanner in=new Scanner(System.in);
s=in.next();
String p[]=s.split("\\s");
for(int i=p.length();i>=0;i--)
{
System.out.println(p[i]+"\t");
}
}
}
