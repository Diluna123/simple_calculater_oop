public class Calculator {

    //constrature
    public Calculator() {



    }

    //methods
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
    public  int modulo(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {

        Calculator myCalculater = new Calculator();
        System.out.print(myCalculater.add(10, 20));


    }



}
