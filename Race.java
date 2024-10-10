import java.util.*;
class Race
{
public static void main(String args[])
{
double b1,b2,b3,b4,b5,avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the speed of 1st biker:");
b1=sc.nextDouble();
System.out.println("Enter the speed of 2nd biker:");
b2=sc.nextDouble();
System.out.println("Enter the speed of 3rd biker:");
b3=sc.nextDouble();
System.out.println("Enter the speed of 4th biker:");
b4=sc.nextDouble();
System.out.println("Enter the speed of 5th biker:");
b5=sc.nextDouble();
avg=(b1+b2+b3+b4+b5)/5;
if(b1>avg)
System.out.println("biker1 is qualified in a race with "+b1+" speed");
if(b2>avg)
System.out.println("biker2 is qualified in a race with "+b1+" speed");
if(b3>avg)
System.out.println("biker3 is qualified in a race with "+b1+" speed");
if(b4>avg)
System.out.println("biker4 is qualified in a race with "+b1+" speed");
if(b5>avg)
System.out.println("biker5 is qualified in a race with "+b1+" speed");
}
}
