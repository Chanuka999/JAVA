import java.util.Scanner;
public class max{
    public static void main(String[] args){
        Scanner sun = new Scanner(System.in);
       int number_1,number_2,number_3;
       System.out.print("Enter number 1 :");
       number_1=sun.nextInt();
       System.out.print("Enter number 2 :");
       number_2=sun.nextInt();
       System.out.print("Enter number 3:");
       number_3=sun.nextInt();
       if(number_1>number_2){
           System.out.print("Number 1 is a max number");
       }
       else if (number_3>number_1) {
           System.out.print("Number 3 is a max number ");
       }
       else {
           System.out.print("Number 2 is max number");
       }

   System.out.println(" ");
    }

}