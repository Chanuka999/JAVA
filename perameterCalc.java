import java.util.Scanner;
public class perameterCalc{

    public static void main(String[] args){
        Scanner sun = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter Number 1 :");
         number1=sun.nextInt();
        System.out.print("Enter Number 2 :");
        number2= sun.nextInt();

        System.out.println("");

        System.out.println("A.Adition");
        System.out.println("B.Subtraction");
        System.out.println("C.Devition");
        System.out.println("D.Multiplication");

        System.out.println();
        System.out.print("-->");
        String letter=sun.next();

        switch (letter){
            case "A":
                add(number1,number2);
                break;
            case "B" :
                sub(number1,number2);
                break;
            case "C" :
                dev(number1,number2);
                break;
            case "D" :
                mul(number1,number2);
                break;
            default:
                System.out.println("invalid entry");


        }
    }
 public static void add(int number1,int number2){
        int total = number1+ number2;
        System.out.println("Adition :"+ total);

        }

 public static void sub(int number1,int number2){
        int resalt=0;
        if(number1>number2){
            resalt=number1-number2;
        }else{
            resalt=number2-number1;
        }
     System.out.println("Subtraction :"+ resalt);
 }

 public static void dev(int number1, int number2){
        int resalt=0;
        if(number1>number2){
            resalt=number1/number2;

        }else{
            resalt=number2/number1;
        }
     System.out.println("Devition :" + resalt);
 }

 public static void mul(int number1,int number2){
        int resalt=0;
        resalt=number1 * number2;
     System.out.println("Multipication:" + resalt);

 }
 }


