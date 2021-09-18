package com.company;

import com.company.factories.GUIFactory;
import com.company.factories.LinuxFactory;
import com.company.factories.MacOSFactory;
import com.company.factories.WindowsFactory;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static Application configureApplication(int number) {
        Application app;
        GUIFactory factory = null;
        if (number == 1) {
            factory = new WindowsFactory();
        } else if (number == 2) {
            factory = new LinuxFactory();
        } else if (number == 3) {
            factory = new MacOSFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Testing Abstract Factory Pattern");
            int number = 1;
            while (number >= 1 && number <= 3) {
                System.out.println("--------------------------------------------------------------------------------1");
                System.out.println("*********** Choose the Operating System to create: ***********");
                System.out.println("Option 1: Windows");
                System.out.println("Option 2: Linux");
                System.out.println("Option 3: MacOS");
                System.out.println("Other: Exit");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if (number < 1 || number > 3) {
                    System.out.println("Good Bye --- " + LocalDateTime.now() + "!!!");
                    System.out.println();
                    System.exit(1);
                }
                Application app = configureApplication(number);
                System.out.println("***** Response: ");
                app.paint();
            }
        } catch (Exception e) {
            System.out.println("You have introduced an incorrect value");
            System.out.println("Good Bye --- " + LocalDateTime.now() + "!!!");
            System.exit(1);
        }
    }
}
