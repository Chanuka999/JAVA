import java.util.Scanner;
public class student {
    public static void main(String[] args){
        Scanner sun =new Scanner(System.in);

        boolean flag=true;

        while(flag){


          String name;
          System.out.print("Enter Student name :");
          name=sun.next();
          
          System.out.print("Enter student address :");
          String address=sun.next();
          
          System.out.print("Enter Number of Subjects :");
          int No_subjects= sun.nextInt();

          System.out.println();
          int marks=0;
          int max=0;
          int total=0;
          
          for(int i=0;i<No_subjects;i++){
            System.out.print("Enter subject " + (i+1 )+" marks :");
           marks= sun.nextInt();
           if(max<marks){
               max=marks;
           total=total+marks;
           }
         }
          System.out.println();

          System.out.println("A.show student details.");
          System.out.println("B.Maxium marks.");
          System.out.println("C.Average marks.");
          System.out.println("D.show resalt");
          System.out.println("X. Exit.");

        System.out.println();

        System.out.print("-->");
        String letter=sun.next();

        System.out.println();
        double average=(double)total/No_subjects;
        switch(letter) {
            case "A":
                System.out.println("Student Name:" + name);
                System.out.println("Student Address:" + address);
                break;
            case "B":
                System.out.println("Max marks:" + max);
                break;
            case "C":

                System.out.println("Average" + average);
                break;
            case "D":
                if (average >= 50) {
                    System.out.println("pass");
                } else {
                    System.out.println("Fail");
                }
                break;
            case "X":
                System.out.println("Good bye.....");
                flag=false;
                break;
            default:
                System.out.println("invalid entry");
        }
        }
    }
}