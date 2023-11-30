import java.util.*;

class Check{
    public void func() throws ArithmeticException{
        try {
            int a = 10;
            int b = 0;
            a = a/b;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        finally{
            System.out.println("I am Finally");
        }
    }
}

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check c = new Check();
        try {
            c.func();
        }
        catch(ArithmeticException e){
            System.out.println("Outer Catch");
        }
        sc.close();
    }
}
