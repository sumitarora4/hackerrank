package Java;


import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                sum += i;
            }
        return sum;
    }
}

public class JavaInterface {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        MyCalculator myCalculator = new MyCalculator();

        System.out.println(myCalculator.divisor_sum(n) + "\n");
        s.close();

    }
}
