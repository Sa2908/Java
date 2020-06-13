import java.util.*;

//8013446613
class BubbleSort 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int i = 0, t;
        int l = in.nextInt();
        int a[] = new int[l];
        System.out.println("Enter the Elemnts in the Array");
        for (i = 0; i < l; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < l; i++) 
        {
            for (int j = 0; j < (l - (1 + i)); j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("Elements in arranged ascending order are :");
        for (i = 0; i < l; i++)
            System.out.println(a[i]);
    }
}
