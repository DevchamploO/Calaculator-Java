package Calculator;

/**
 * Created by tiffany on 3/6/17.
 */
public class Operations {

    private double answer = 0;
    public void equations(int equate, double val1, double val2) {

        switch(equate) {

            //Addition
            case 1:
                answer = val1 + val2;
                break;

            //Subtraction
            case 2:
                answer = val1 - val2;
                break;

            //Multiplication
            case 3:
                answer = val1 * val2;
                break;

            //Division
            case 4:
                answer = val1 / val2;
                break;

            //Square
            case 5:
                answer = Math.pow(val1, 2);
                break;

            //Square Root
            case 6:
                answer = Math.sqrt(val1);
                break;

            case 7:
                answer = Math.pow(val1, val2);
                break;

            //Sine
            case 8:
                answer = Math.sin(Math.toRadians(val1));
                break;

            //Cosine
            case 9:
                answer = Math.cos(Math.toRadians(val1));
                break;

            //Tangent
            case 10:
                answer = Math.tan(Math.toRadians(val1));
                break;

            //Inverse Sine
            case 11:
                answer = Math.asin(val1);
                break;

            //Inverse Cosine
            case 12:
                answer = Math.acos(val1);
                break;

            //Inverse Tangent
            case 13:
                answer = Math.toDegrees(Math.atan(Math.sin(val1)));
                break;

            //Log
            case 14:
                answer = Math.log(val1);
                break;

            //Inverse Log
            case 15:
                answer = Math.exp(Math.log(val1));
                break;

            //Factorial
            case 16:
                answer = Factorial.fact(val1);
                break;
        }

    }

    public double getAnswer() {
        return answer;
    }
}
