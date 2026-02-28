import java.util.Scanner;

class Student{
    int age;
}

class Main{

    public static void main(String args[]){
        // %d -> integers
        // %f -> decimals (floating, double)
        
        float salary = 10000.123f;
        System.out.printf("My salary is %.2f", salary);

        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt(); // O(1)

        for(int i = 0; i < n; i++){
            System.out.println("Hello World"); // O(n)
        }

        try{
            int ans = 10 / 0;
        }catch(Exception e){
            System.out.println("Exception while running code: " + e);
        }

        String[][] harvestedFruits = { {} };

        for(int day = 0; day < harvestedFruits.length; day++){ // x
            System.out.print("Day " + (day+1));

            for(int i = 0; i < harvestedFruits[day].length; i++){ // x
                System.out.print(" | " + harvestedFruits[day][i]);
            }

            System.out.println();
        }

        // x^2 => O(n^2)
    }
}