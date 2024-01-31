package by.academy.lesson17.Exeption;

public class WrongPasswordException extends Exception{
    private String detail;

    public WrongPasswordException(){
        super();
    }

    public WrongPasswordException(String message){
        super(message);

    }
}
