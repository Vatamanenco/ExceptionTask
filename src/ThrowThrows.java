import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ThrowThrows {
    @Test
    public void error() throws AssertionError{
        String a = "abc";
        String b = "abc";
        try{
        assertThrows(AssertionError.class, () -> {
//            assertFalse(a == b);
            assertFalse(a.equalsIgnoreCase(b));
        });
            System.out.println("Succes");
        }
        catch (AssertionError e)
        {
            System.out.println("First string: " + a);
            System.out.println("Second string: " + b);
        }
    }
}
