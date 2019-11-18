package question1;

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

}
