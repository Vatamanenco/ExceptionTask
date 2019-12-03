public class Divide {
    static final int i = 5;
    static final int zero = 0;
    public static void divideByZero(int i, int zero){
        try {
            System.out.println(i/zero);
        }
        catch (ArithmeticException e) {
            System.out.println("TRY IS NOT EXECUTED, Arithmetic Exception");
        }
    }
    public static void main(String[] args) {
        divideByZero(i, zero);
    }

}
