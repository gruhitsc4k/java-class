import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = in.nextInt();

        /*
            Write a program to tae a person's age and inform them about their age grop.
            1. < 12 - kid
            2. 12 - 18 - Teen
            3. 19-30 - Youth
            4. 31-60 - Adult
            5. > 61 - Senior 
        */

        if(num % 2 == 0 && num > 0){
            System.out.println("You have the right number.");
        }else{
            System.out.println("The number is invalid.");
        }
    }
}