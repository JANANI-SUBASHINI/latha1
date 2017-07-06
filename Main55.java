# latha1
import java.io.*;
import java.util.*;
public class Main55
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,sum=0;
    System.out.println("Enter an integer");
    a=Integer.parseInt(br.readLine());
    for(int i=0;i<=a;i++)
    {
      sum=sum+i;
    }
    System.out.println("The count of integer is an: " +sum);
  }
  }
