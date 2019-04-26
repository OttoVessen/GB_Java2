package GB_Lesson2;

public class Man {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        // Массив для провеки суммирования элементов массива методом
        String[][] arr = {{"288", "17", "56", "23", }
                , {"72", "88", "99", "11"}
                , {"15", "78", "95", "36"}
                , {"22", "66", "77", "19"}
        };
        //Массивы для проверки работы исключения MyArraySizeException
        String[][] arr1 = {{"288", "17", "56", "23", }
                , {"72", "88", "99", "11"}
        };

        String[][] arr2 = {{"288", "17", "56", "23","20" }
                , {"72", "88", "99", "11"}
                , {"15", "78", "95", "36"}
                , {"22", "66", "77", "19"}
        };





        System.out.println( ArraySum.workingWithArray(arr1));
    }
}
