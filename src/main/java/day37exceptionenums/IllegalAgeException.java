package day37exceptionenums;

public class IllegalAgeException extends RuntimeException {

    /*
    1) Eger Runtime Custom Exception uretmek isterseniz Runtime Exception Class'a extend etmelisiniz
     */

    public IllegalAgeException() {

        super();
    }

    public IllegalAgeException(String message) {

        super(message);
    }
}