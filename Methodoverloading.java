class Calculator {
    public int add (int num1, int num2) {
        return num1 + num2;
    }
    public int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public double add (double num1, double num2) {
        return num1 + num2;
    }

} 

// We can have the same method name using differennt parameters

public class Methodoverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2);

        double sum3 = calculator.add(5.5, 10.7);
        System.out.println("Sum of 5.5 and 10.7: " + sum3);
        
    }
}
