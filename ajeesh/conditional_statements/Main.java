import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = in.nextInt();

        if(num > 0){
            System.out.println(num + " is a positive number.");
        }else if(num < 0){
            System.out.println(num + " is a negative number.");
        }
        else{
            System.out.println(num + " is a neutral number.");
        }
    }
}