
public class Madeup_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dividing two numbers");
        int divisor = 10;
        int dividend = 30;
        
        int quotient = evaluate(dividend,divisor);
        System.out.println("The quotient is " + quotient );
    }
    public static int evaluate(int num1, int num2)
    {
        return num1*num2;
    }
    
}
