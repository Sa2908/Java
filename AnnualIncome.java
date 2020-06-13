import java.util.*;

class AnnualIncome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income;
        String name = "";
        double tax = 0.0;
        System.out.println("Enter Your Name");
        name = in.nextLine();
        System.out.println("Enter Your Annual Income");
        income = in.nextInt();
        if (income <= 10000)
            tax = 0;
        else if (income > 10000 && income <= 150000)
            tax = income * 0.1;
        else if (income > 150000 && income <= 250000)
            tax = income * 0.2 + 5000;
        else
            tax = income * 0.3 + 25000;
        System.out.println("Your name is " + name);
        System.out.println("Your Salary is " + income);
        System.out.println("Tax to be Paid is " + tax);

    }
}
