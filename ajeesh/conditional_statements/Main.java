import java.util.Scanner;

public class Main{


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age:- ");
        int age = in.nextInt();

        System.out.println("Enter your gender(M/F)? ");
        String gender = in.nextLine();



        for(int i = 5; i >= 0; i--){
            System.out.println(i);
        }

        
    }
}