public class Main{
    public static void main(String args[]){
        

        // for(int i = 0; i < 5; i++){ // Outer for loop
        //     // System.out.println("We are at line # " + (i+1));

        //     for(int j = 0; j < 3; j++){ // Inner for loop
        //         // System.out.println("Giving chocolate to student #: " + (j+1));
        //         System.out.println("");
        //     }
        // }

        // System.out.println(5/2); // 2

        String encryptedText = "4|3|JABJADJB";
        String texts[] = encryptedText.split("[|]");

        int i = 0;
        String strFrontSpace = "";

        for(i = 0; i < encryptedText.length(); i++){
            if(encryptedText.charAt(i) == '|'){
                break;
            }else{
                strFrontSpace += encryptedText.charAt(i);
            }
        }

        System.out.println("Value of I = " + i);
        System.out.println("Front Spaces = " + strFrontSpace);

        String strTrailingSpace = "";
        for(i = i +1; i < encryptedText.length(); i++){
            if(encryptedText.charAt(i) == '|'){
                break;
            }else{
                strTrailingSpace += encryptedText.charAt(i);
            }
        }

        System.out.println("Value of I = " + i);
        System.out.println("Front Spaces = " + strTrailingSpace);

        String temp = "";
        for(i = i+1; i < encryptedText.length(); i++){
            temp += encryptedText.charAt(i);
        }

        System.out.println("Front Spaces = " + temp);

        // for(int i = 0 ; i < texts.length; i++){
        //     System.out.println(texts[i]);
        // }

        int frontSpaces = Integer.parseInt(strFrontSpace);
        int trailSpaces = Integer.parseInt(strTrailingSpace);
        String result = texts[2];
        // result to decrypted text

        for(int j = 0; j < frontSpaces; j++){
            result = " " + result;
        }

        for(int k = 0; k < trailSpace; k++){
            result = result + " ";
        }

        

    }
}

/*
* * *
* * *
* * *
* * *
* * *
*/