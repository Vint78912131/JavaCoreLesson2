public class TestExceptionClass {
    public TestExceptionClass(){
    }

    public boolean checkSizeArray(String [][] arr) {
        try {
            if (arr != null) {
                if ((arr.length != 4) && (arr[0].length != 4))
                    throw new MyArraySizeException();
                else
                    System.out.println("You've good array size - \"4x4\".");
                }
        }
        catch (MyArraySizeException e){
            System.out.println("MyArraySizeException is catched.");
        }
        finally {
            System.out.println("Array is checked.\n");
        }
        return true;
    }


    public boolean getLineSumArray(String [][] arr) {
        for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                String result = "";
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                    result += arr[i][j] + " + ";
                }
                catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException(i, j, arr[i][j]);
                    }
                    catch (MyArrayDataException c) {
                        System.out.println("MyArrayDataException is catched.");
                    }
                }
            }
            System.out.println(result.substring(0,result.length()-3) + " = " + sum);
        }
        System.out.println("Array is checked.");
       return true;
    }
}
