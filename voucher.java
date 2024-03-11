import java.util.Scanner;

public class voucher {
    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);

        System.out.println("Enter The Amounts And End The Amounts E :");
        String[] amount = sun.nextLine().split(" ");
        String end = sun.next();

        int[] amounts = new int[amount.length];
        for (int i = 0; i < amount.length; i++) {
            amounts[i] = Integer.parseInt(amount[i]);
        }

        int Sum = 0;
        int fullAmount = 0;

        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] < 100000) {

                int Voucher = amounts[i] / 1000;
                Sum = Sum + Voucher;
                fullAmount = fullAmount + amounts[i];


            }
        }

        String answer = "no";
        for (int i = 0; i < amounts.length; i++)
            if (amounts[i] >= 1000) {
                answer = "yes";
            } else {
                answer = "no";
            }
        System.out.println("Do have voucher : " + answer);
        System.out.println("The total value of the bill : " + fullAmount);
        System.out.println("The number of vouchers : " + Sum);

    }
}
