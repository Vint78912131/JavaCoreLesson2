import java.util.Arrays;

public class JavaCoreLesson2 {
    public static void main(String[] args) {
        String [][] arr1 = new String [][]{{"5","7","3"},{"7","0","12"}};
        String [][] arr2 = new String [][]{{"6","4","0"},{"7","-8","9"},{"8","3","%"}};
        String [][] arr3 = new String [][]{{"1","2","3","4"},{"2","8.6","4","5"},{"3","4","abcd","6"},{"4","5","6","7"}};

        TestExceptionClass test = new TestExceptionClass();
        System.out.println(JavaCoreLesson2.printArr(arr1));
        test.checkSizeArray(arr1);
        System.out.println(JavaCoreLesson2.printArr(arr2));
        test.checkSizeArray(arr2);
        System.out.println(JavaCoreLesson2.printArr(arr3));
        test.checkSizeArray(arr3);

        System.out.println(JavaCoreLesson2.printArr(arr1));
        test.getLineSumArray(arr1);
        System.out.println("\n"+JavaCoreLesson2.printArr(arr2));
        test.getLineSumArray(arr2);
        System.out.println("\n"+JavaCoreLesson2.printArr(arr3));
        test.getLineSumArray(arr3);
    }

    static String printArr(String [][] arr) {
        return Arrays.deepToString(arr);
    }
}
