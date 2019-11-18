package question1;

import java.util.Scanner;

public class MyFirstException extends Exception {
    MyFirstException(String message) {
        super(message);
    }

}

class Main {
    public void result(int num1, int num2) throws MyFirstException {
        if (num1 + num2 < 150) {
            throw new MyFirstException("Custom Exception Occurred");
        } else {
            System.out.println(num1 + num2);
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Main obj = new Main();
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        try {
            obj.result(num1, num2);
        } catch (MyFirstException e) {
            System.out.println(e.getMessage());
        }
    }
}
