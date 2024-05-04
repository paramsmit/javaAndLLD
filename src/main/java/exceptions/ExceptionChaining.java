package exceptions;

public class ExceptionChaining {

    public static void main(String [] args) throws Exception1 {
        try{
            getValue();
        } catch (Exception2 e){
            throw new Exception1("exception1", e);
        }
    }

    public static void getValue() throws Exception2 {
        try{
            getAnotherValue();
        } catch (Exception3 e){
            throw new Exception2("exception2", e);
        }
    }

    public static void getAnotherValue() throws Exception3 {
        throw new Exception3("exception3");
    }
}

class Exception1 extends Exception {
    public Exception1(String message){
        super(message);
    }
    public Exception1(String message, Throwable e){
        super(message, e);
    }
}

class Exception2 extends Exception {
    public Exception2(String message){
        super(message);
    }
    public Exception2(String message, Throwable e){
        super(message, e);
    }
}

class Exception3 extends Exception {
    public Exception3(String message){
        super(message);
    }
}

