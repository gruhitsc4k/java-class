import java.utils.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ")
        int num = inp.nextInt();

        int num2 = num;
        int digit_count = 0;

        while(num > 0){
            num = num / 10;
            digit_count += 1; // => digit_count = digit_count + 1
        }

        System.out.println(num2 + " has " + digit_count + " digit(s)");
    }
}