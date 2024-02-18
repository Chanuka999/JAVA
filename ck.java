import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sun = new Scanner(System.in);
        while(true) {
            System.out.print("Do you want to add new student.   ?  (Y/N) :");
            String letter = sun.next();
            System.out.println();

            switch(letter) {
                case "Y":
                    System.out.print("Enter student Name:");
                    String name=sun.next();
                    System.out.print("Enter student Address :");
                    String address=sun.next();
                    System.out.print("Enter number of subjects:");
                    int subjects=sun.nextInt();
                    int[] Marks=new int[subjects];
                    for(int i=0;i<subjects;i++){
                        System.out.print("Enter Subject " + (i+1) + " Marks :");
                        Marks[i]=sun.nextInt();
                    }
                    System.out.println();

                    boolean flag=true;
                    while(flag) {
                        System.out.println("A.show students details");
                        System.out.println("B.show students Marks.");
                        System.out.println("C.show resalt");
                        System.out.println("X.Exit.");

                        System.out.println();

                        System.out.print("-->");
                        letter = sun.next();

                        System.out.println();


                        switch (letter) {
                            case "A":
                                System.out.println("student Name :" + name);
                                System.out.println("Student Address :" + address);
                                break;
                            case "B":
                                System.out.print("Students Marks : (");
                                for (int i = 0; i < Marks.length; i++) {
                                    System.out.print(Marks[i] + " ");
                                }
                                System.out.println(" ) ");
                                break;
                            case "C":
                                int total = 0;
                                double average = 0;
                                for (int i = 0; i < Marks.length; i++) {
                                    total = total + Marks[i];
                                }
                                average = (double) total / subjects;
                                System.out.print("Students resalt :");
                                if (average >= 50) {
                                    System.out.println("Pass");
                                } else {
                                    System.out.println("Fail");
                                }

                                break;
                            case "X":
                                flag=false;
                                break;
                            default:
                                System.out.println("Invalid entry");
                        }
                        System.out.println();
                    }
                break;
                case "N":
                    System.out.println(" ........GOOD BYE........");
                    return;
                default:
                    System.out.println("invalid entry");
            }
        }
    }
}