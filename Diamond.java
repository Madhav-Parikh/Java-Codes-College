import java.lang.*;
import java.util.*;

class Diamond
{
public static void main(String m[])
{
char c;
int t,i,j;
Scanner in= new Scanner(System.in);

String s;
int k,d;

s="*";
System.out.println("Enter the Max Width"+s.charAt(0)+" :: ");
t=in.nextInt();
t--;
for(i=0;i<t;i++)
{
System.out.print("\t\t\t\t");
for(k=0;k<t-i;k++) 
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(0)+" ");
}
System.out.println(" ");
}
for(i=t;i>=0;i--)
{
System.out.print("\t\t\t\t");
for(k=t-i;k>0;k--)
{
System.out.print(" ");
          }

for(j=i;j>=0;j--)
{
System.out.print(s.charAt(0)+" ");
}
System.out.println(" ");
}

}
}

