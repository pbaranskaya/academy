package by.academy.lesson17.Exeption;

public class WrongLoginPasswordExeption extends Exception{

    private String detail;

    public WrongLoginPasswordExeption(){
        super();
    }

    public WrongLoginPasswordExeption(String message){
        super(message);
    }
}
