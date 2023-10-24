package utilities;

import java.util.Scanner;
import application.Menu;

public class Loop {

    public static void toLoop(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wanna continue? [y/n]");
        String exit = input.next();
        exit = exit.toLowerCase();

        if (exit.equals("y")){
            System.out.println();
            Menu.enterPassword();
        }
        else {
            System.out.println("Ending...");
        }
        input.close();
    }

}
