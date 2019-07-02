import java.util.Scanner;
class VowelException extends RuntimeException
{
public VowelException()
{
System.out.println("its not allowed");
}
} 
public class Vowel extends VowelException
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
try
{
throw new VowelException();
}
catch(VowelException e)
{
System.out.println("Exception raised");
}
}
else
{
System.out.println("character is:"+ch);
}
}
}


