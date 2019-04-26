package GB_Lesson2;



public class ArraySum {




    public static int workingWithArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException(String.format("Неправильный размер массива длинна строки равна %d вместо допустимого значения 4", arr.length));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException(String.format("Неправильный размер массива длинна столбца равна %d вместо допустимого значения 4", arr[i].length));
            }


            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Введенное значение %s по адресу %d%d является недопустимым", arr[i][j], i, j));
                }

            }


        }
        return sum;
    }
}