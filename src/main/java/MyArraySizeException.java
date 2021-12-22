import java.io.IOException;

public class MyArraySizeException extends IOException {
    public MyArraySizeException() {
        System.out.println("You've wrong array size! Not \"4x4\"");
    }
}
