import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int n=5,f1=0,f2=1,i=1;
System.out.println("first"+n+" terms");
while (i<=n)
{
System.out.print(f1);
int sum=f1+f2;
f1=f2;;
f2=sum;
i++;
	}
}
}
