import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks : ");
        marks= sun.nextInt();
        if(marks>=75){
            System.out.println("Grade is A ");
        }
        else if(marks>=65){
            System.out.println("Grade is B ");

        }
        else if(marks>=55){
            System.out.println("Grade is C ");
        }
        else if(marks>=35){
            System.out.println("Grade is S ");
        }
        else{
            System.out.println("Grade is F ");
        }
    }
}