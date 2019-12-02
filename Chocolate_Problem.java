
import java.util.Scanner;


public class Chocolate_Problem 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of students");
        int m=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int diff=0;
        for(int i=0;i<m;i++)
        {
            diff=a[m-1]-a[0];
        }
        System.out.println("Minimum difference is: "+diff);
        
    }
}
