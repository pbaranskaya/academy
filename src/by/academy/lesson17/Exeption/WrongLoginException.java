package by.academy.lesson17.Exeption;

public class WrongLoginException extends Exception{

    private String detail;

    public WrongLoginException(){
        super();
    }

    public WrongLoginException(String message){
        super(message);
    }
}
