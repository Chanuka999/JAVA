import java.util.Scanner;
public class cr{
        public static void main(String[] args){
                Scanner sun = new Scanner(System.in);

                System.out.print("Enter salary :");
                int salary =sun.nextInt();

                int resalt = salary/5000;
                salary=salary % 5000;
                System.out.println("5000 notes :"+resalt);

                 resalt = salary/2000;
                 salary=salary % 2000;
                 System.out.println("2000 notes:" + resalt);


                resalt = salary/1000;
                salary=salary % 1000;
                System.out.println("1000 notes:" + resalt);


                resalt = salary/500;
                salary=salary % 500;
                System.out.println("500 notes:" + resalt);

                resalt = salary/100;
                salary=salary % 100;
                System.out.println("100 notes:" + resalt);

                resalt = salary/50;
                salary=salary % 50;
                System.out.println("50 notes:" + resalt);

                resalt = salary/20;
                salary=salary % 20;
                System.out.println("20 notes:" + resalt);

                resalt = salary/10;
                salary=salary % 10;
                System.out.println("10 coins:" + resalt);

                resalt = salary/5;
                salary=salary % 5;
                System.out.println("5 coins:" + resalt);

                resalt = salary/2;
                salary=salary % 2;
                System.out.println("2 coins:" + resalt);

                System.out.println("1 coins" + resalt);




        }
}
