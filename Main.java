class Calculator{ // if the class is declared as public then it needs to be in the other file or else it will throw an error
    int num1;
    int num2;
    public int calc(){
        return num1+num2;
    }
}



public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  // this is the object of the calculator type
        calculator.num1 = 10;
        calculator.num2 = 20;
        int result = calculator.calc();
        System.out.println(result);
    }
}