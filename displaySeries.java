import java.util.*;

public class displaySeries {
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Choice Please");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                int n, s = 0, i, c = 3;
                System.out.println("Enter the value of n");
                n = in.nextInt();
                System.out.println("Your series is : ");
                for (i = 1; i <= n; i++) {
                    System.out.println(s);
                    s = s + c;
                    c = c + 2;
                }
                break;
            case 2:
                int a, b, j;
                double sum = 0.0;
                for (j = 1; j <= 20; j++) {
                    a = j;
                    b = a + 1;
                    sum = sum + (a/b);
                }
                System.out.println("The sum of the Series is = " +sum);
                break;
            default:
            System.out.println("Your Choice is Wrong");

        }

    }
}
