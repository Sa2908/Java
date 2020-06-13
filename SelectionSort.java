import java.util.*;
class selection
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, j, t, min;
        System.out.println("Enter the number of elements in the array");
        int l = in.nextInt();
        int m[] = new int[l];
        for(i = 0; i<l; i++)
        {
            System.out.println("Enter the elements in array");
            m[i]  = in.nextInt();
        }
        for(i = 0 ;i<l-1; i++)
        {
            min = i;
            for(j = i+1; j<l; j++ )
            {
                if(m[j]<m[min])
                min = j;
            }
            t = m[i];
            m[i] = m[min];
            m[min] = t;
        }
        System.out.println("The numbers arranged in ascending order are : ");
        for(i = 0;i<l; i++)
        System.out.println(m[i]);
    }
}
