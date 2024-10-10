import java.util.*;
import java.lang.*;
class Armstrong
{
public static void main(String args[])
{
int n,r,temp,count=0,rem;
double sum=0,num;
System.out.println("Enter n value");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
num=n;
while(n!=0)
{
r=n%10;
sum=sum+Math.pow(r,3);
n=n/10;
}
if(sum==num)
System.out.println(num+" is a Armstrong number");
else
System.out.println(num+" is not an Armstrong number");
}
}