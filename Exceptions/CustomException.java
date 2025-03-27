package Exceptions;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {

        public static void ValidateAge(int age) throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("Age must be 18 or above");
            }
            else{
                System.out.println("Access Granted");
            }
        }

    public static void main(String[] args) {
        try{
            ValidateAge(15);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

