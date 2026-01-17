import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = inp.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }
    }
}