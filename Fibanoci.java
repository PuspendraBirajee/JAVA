import java.util.*;
class Fibanoci
{
public static void main(String args[])
{
int n,sum=0,a=0,b=1,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
c=a+b;
while(c<=n)
{
if(c%2==0)
sum=sum+c;
a=b;
b=c;
c=a+b;
}
System.out.println("sum of all even terms in fibanocii is "+sum);
}
}