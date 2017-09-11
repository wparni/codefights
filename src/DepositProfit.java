/**
 You have deposited a specific amount of dollars into your bank account.
 Each year your balance increases at the same growth rate. Find out how long it would take for your balance to pass a specific threshold with the assumption that you don't make any additional deposits.
 */
public class DepositProfit {

    static int depositProfit(int deposit, int rate, int threshold) {

        double result = 0;
        int year = 0;

        while (result < threshold) {
            result = (double) deposit+((deposit * rate) / 100);
            deposit = (int) result;
            year++;
        }

        return year;
    }

    public static void main(String[] args) {

        int deposit = 100;
        int rate = 20;
        int threshold = 170;

        System.out.println(depositProfit(deposit, rate, threshold));
    }
}
