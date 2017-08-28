package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tiffany on 6/29/17.
 */
public class milk {

    milk() {
        System.out.println("========================");
        System.out.println("Java Scientific calculator!");
        System.out.println("========================");
    }

    Scanner input = new Scanner(System.in);

    private int count = 0;
    private int counter = 0;
    private int menuChoice = 0;
    private double num1 = 0.0;
    private double num2 = 0.0;
    private boolean validEntry = false;
    Operations op = new Operations();

    public void menuCalc() {

        do {
            input.next();
            //double num1 = op.getAnswer();

            System.out.println("------------------------");
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiply");
            System.out.println("(4) Divide");
            System.out.println("(5) Square");
            System.out.println("(6) Square Root");
            System.out.println("(7) Exponents");
            System.out.println("------------------------");
            System.out.println("(8) Sine");
            System.out.println("(9) Cosine");
            System.out.println("(10) Tangent");
            System.out.println("(11) Inverse sine");
            System.out.println("(12) Inverse cosine");
            System.out.println("(13) Inverse Tangent");
            System.out.println("------------------------");
            System.out.println("(14) Log");
            System.out.println("(15) Inverse Log");
            System.out.println("(16) Factorial");
            System.out.println("------------------------");
            System.out.println("(17) Reset");
            System.out.println("------------------------");
            System.out.println("Choose Operation:");

            // Input choosen menu option
            //Loop catches any wrong input and asks again.
            while(!validEntry) {
                try {
                    menuChoice = input.nextInt();
                    //Will make user reenter number if it is out of range
                    if(menuChoice > 0 && menuChoice < 18) {
                        validEntry = true; //Will not get here if nextInt() throws an exception
                    } else {
                        System.err.println("Error!!! Please enter a valid number below:");
                    }
                }
                catch (InputMismatchException e) {
                    input.nextLine(); //Lets the Scanner skip over the bad input
                    System.err.println("Error!!! Please enter a valid number below:");
                    //Do not call nextInt(). While loop will loop back to call it in the try block.
                }
            }
            System.out.println("========================");


            if (menuChoice == 17) {
                num1 = 0;
                num2 = 0;
                counter = 0;
            }else {

                //Get first number of equation on first use except after reset
                if(counter == 0) {
                    System.out.println("First Number: ");
                    while (validEntry) {
                        try {
                            num1 = input.nextDouble();
                            validEntry = false;
                        } catch (InputMismatchException e) {
                            input.nextLine(); //Lets the Scanner skip over the bad input
                            System.err.println("Error!!! Please enter a valid number below:");
                        }
                    }
                }

                while(!validEntry) {
                    try {
                        if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4 || menuChoice == 7) {
                            System.out.println("Second Number: ");
                            num2 = input.nextDouble();
                            op.equations(menuChoice, num1, num2);
                            validEntry = true;
                        }
                        //If not a reset continue calculator
                        else if (menuChoice == 17) {
                            num1 = 0;
                            num2 = 0;
                            counter = 0;
                        } else {
                            op.equations(menuChoice, num1, 0);
                        }
                    } catch (InputMismatchException e) {
                        input.nextLine(); //Lets the Scanner skip over the bad input
                        System.err.println("Error!!! Please enter a valid number below:");
                    }
                    System.out.println("Answer: " + op.getAnswer());
                    counter = counter + 1;
                }
            }

            System.out.println("Continue?...(0)Yes | (1)No");
            count = input.nextInt();
            num1 = op.getAnswer();
        } while (count == 0);

    }

}
