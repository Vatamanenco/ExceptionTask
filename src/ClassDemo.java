
import java.lang.*;

    public class ClassDemo {

        public static void main(String[] args) throws ClassNotFoundException {
        exception();
        }
        public static void exception() {
            try {
                Class cls = Class.forName("NonExistingClass");
            }
            catch (ClassNotFoundException e){
                handling();
            }
        }
        public static void handling() {
            System.out.println("Class is not exists");
        }
    }
