public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int i, int j, String arr) {
        System.out.println("The element [ " + i + " , " + j + " ] = \"" + arr + "\" - can't convert to Integer");
    }
}
