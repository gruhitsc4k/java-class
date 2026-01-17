import java.util.Scanner;

/*
    *****
    ****
    ***
    **
    *
*/

public class Main{
    public static void main(String args[]){
        
        int total_rows = 5;
        for(int i = 0; i < total_rows; i++){
            int num_stars = total_rows - i;
            for(int j = 0; j < num_stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}