/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationControllerPattern;

/**
 *
 * @Rob Johnson
 */
import cit360.Controller;
import java.util.Scanner;

public class Application extends javax.swing.JFrame {

    public static void main(String[] args) {
        boolean b_expression = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                Controller calculate = new Controller();
                Integer engineSize;
                String operation;
                String str;
                
                //convert engine size from between metric and standard
                System.out.println("Enter 'a' to convert engine size to cubic inches,");
                System.out.println("Enter 'b' to convert engine size to cubic centimeters.");
                operation = input.nextLine();
                
                if (operation.equals("a")) {
                    System.out.println("convert cubic centimeters to cubic inches");
                } else if (operation.equals("b")) {
                    System.out.println("convert cubic inches to cubic centimeters");
                } else {
                    System.out.println("a or b please.");
                    continue;
                }
                
                System.out.println("Enter the engine size:");
                engineSize = Integer.parseInt(input.nextLine());

                System.out.println("The engine size is:");

                HashMapController.hashMapMap(operation, engineSize);

                System.out.println("Would you like another conversion (y/n):");
                str = input.nextLine();

                if (str.equals("y") || str.equals("yes")) {
                    b_expression = true;
                } else {
                    b_expression = false;
                }
            } catch (Exception e) {
                System.out.println("Somethings gone wrong, please try again.");
                b_expression = true;
            }
        } while (b_expression);
    }
}
