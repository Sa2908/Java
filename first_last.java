import java.util.*;
class first_last
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n ,sum,first=0 ,last,m;
        System.out.println("Enter the number");
            n=in.nextInt();
            last=n%10;
            for(m=n;m!=0;m/=10)
            {
                if(m>=0||n<=9)
                first=m;
                else
                continue;
            }
            sum=first+last;
            System.out.println("Sum of first and last digit ="+sum);
    }
}
