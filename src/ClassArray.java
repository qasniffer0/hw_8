

public class ClassArray {

    //Объявление массива длинной 5 ячеек
    int[] arr = new int[5];

    //Инициализация массива
    String[] arrName = {"Maike", "Jon", "Dock", "Sup"};

    //Вывод значений массива
    public void printArray(String[] array) {
        for (String a : array) {
            System.out.print(a + " ");
        }
    }

    //Динамическая инициализация массива
    public void dataArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}

