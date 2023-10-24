package utilities;

import application.Menu;

public class Cipher {
    // To store input word
    private static String[] crypto;

    // Alphabet default
    private static String[] vect = new String[]{
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    };

    // Cipher alphabet
    private static String[] vectTwo = new String[]{
        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"
    };


    public static void toCrypto(){
        Menu m = new Menu();

        crypto = m.getWord().split("");
        System.out.printf("Original: %s%n", m.getWord());
        System.out.print("Crypto: ");

        for(int i = 0; i < crypto.length; i++){

            for(int j = 0; j < vect.length; j++){
                if(vect[j].equals(crypto[i])){
                    System.out.print(vectTwo[j]);
                }
            }

        }
        System.out.println();
        Loop.toLoop();
    }

}
