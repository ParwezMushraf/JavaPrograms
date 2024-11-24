package nonstatic_member;

import static_member.sample;

public class sample1
{
public static void m1()
{
	int a=98;
	int b=20;
System.out.println(a);
}
int a;
int b=20;
public static void main(String args[])
{
	sample1 rev=new sample1();
	System.out.println(rev.b);
}
}

