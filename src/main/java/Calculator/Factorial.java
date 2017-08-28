package Calculator;

/**
 * Created by tiffany on 3/7/17.
 */
public class Factorial {

    // Finds the factorial of a given number
    public static double fact(double val1) {

        double num = 0.0;

        if(val1 <= 1) {

            return num = 1;

        }
        else {

            return num =  val1 * fact(val1 - 1);

        }



    }

}
