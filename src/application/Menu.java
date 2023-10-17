package application;

import utilities.Cipher;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    private static String word;

    public static void enterPassword(){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter with the word: ");
        word = input.nextLine();
        word = word.toLowerCase();
        System.out.println("-------------------");

        Cipher.toCrypto();



    }

    public String getWord(){
        return word;
    }

}
