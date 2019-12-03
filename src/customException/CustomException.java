package customException;

public class CustomException extends Exception {
    public CustomException (String message){
        super(message);
    }

    public static void main(String[] args) throws CustomException {
        try {
            throw new CustomException("My Custom Exception");
        }
        catch (CustomException e){
            System.out.println("111");
            e.printStackTrace();
        }
    }
}
