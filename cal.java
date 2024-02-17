import java.util.Scanner;
public class cr {
    public static void main(String[] args) {
       Scanner sun = new Scanner(System.in);
       int number1,number2;
               System.out.print("Enter number 1:");
                number1= sun.nextInt();
               System.out.print("Enter number 2:");
               number2 =sun.nextInt();

        System.out.println(" ");
        System.out.println("A. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Multipication");
        System.out.println("D. Max value");

        System.out.println("");
        System.out.print("-->");
        String letter=sun.next();

        switch(letter){
            case "A":

                int total=number1+number2;
                System.out.println("Addition:" + total);
                break;
            case "B":
                int resalt=0;
                if(number1>number2) {
                     resalt = number1 - number2;
                }else{
                     resalt = number2 - number1;
                }
                System.out.println("substraction:" + resalt);
                break;
            case "C":
                 resalt=number1*number2;
                System.out.println("Multipication:" + resalt);
                break;
            case "D":
               if(number1>number2) {
                   System.out.println("Max number:" + number1);
               }else{
                   System.out.println(number2);
               }
               break;
            default:
                System.out.println("invalid entry");

        }




    }
}