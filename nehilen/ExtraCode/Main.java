class Main{

    public static void main(String args[]){
        
        try{
            int ans = 10 / 0;
        }catch(Exception e){
            System.out.println("Exception while running code: " + e);
        }

        String[][] harvestedFruits = {
            {"Mongo", "Pineapple"},
            {"Banana"},
            {"Kiwi", "Cherry", "Strawberry"}
        };

        for(int day = 0; day < harvestedFruits.length; day++){
            System.out.print("Day " + (day+1));

            for(int i = 0; i < harvestedFruits[day].length; i++){
                System.out.print(" | " + harvestedFruits[day][i]);
            }

            System.out.println();
        }
    }
}