
public class Main {
    public static void main(String[] args) {
        /**
         * Работаем с Array
         */
        ClassArray classArray = new ClassArray();

        //Добавление в массив значений
        classArray.arr[0] = 1;
        classArray.arr[1] = 8;
        classArray.arr[2] = 4;

        //Вывод значений массива через метод
        classArray.printArray(classArray.arrName);
        System.out.println();
        classArray.dataArray(classArray.arr);
        System.out.println();
        System.out.println("Размер массива " + classArray.arrName.length);
        System.out.println("++++++++++++++++++++");

        /**
         * Работаем с List
         */
        ClassList classList = new ClassList();

        //Добавление в массив значений
        classList.addListValue(classList.aList, "BMW");
        classList.addListValue(classList.aList, "Audi");
        classList.addListValue(classList.aList, "VAZ");
        classList.addListValue(classList.aList, "KIA");

        //Поиск в Листе по значению
        classList.searchByValue(classList.aList, "BMW");

        //Вывод Листа
        classList.printList(classList.aList); //1-й вариант вывода

        //Удаление значения из Листа
        classList.removeListValueToObject(classList.aList, "VAZ"); // по значению
        classList.removeListValueToIndex(classList.aList, 1); // по индексу
        System.out.println(classList.aList);//2-й вариант вывода
        System.out.println("++++++++++++++++++++");

        /**
         * Работаем с Set
         */
        ClassSet classSet = new ClassSet();

        //Добавление в массив значений
        classSet.addSetValue(classSet.numbers, 1);
        classSet.addSetValue(classSet.numbers, 15);
        classSet.addSetValue(classSet.numbers, 12);
        classSet.addSetValue(classSet.numbers, 13);
        classSet.addSetValue(classSet.numbers, 13);//Добавление дубликатов не происходит

        //Вывод Set
        classSet.printSet(classSet.numbers);
        System.out.println();

        //Удаление
        classSet.removeSetToValue(classSet.numbers, 1);// по значению
        classSet.printSet(classSet.numbers);
        System.out.println();
        classSet.containsSetValue(classSet.numbers, 12); // поиск в коллекции по значению
        classSet.clearSet(classSet.numbers);// полная очистка
        System.out.println("++++++++++++++++++++");

        /***
         * Работа с Map
         */
        ClassMap classMap = new ClassMap();

        //Добавление в Map
        classMap.addValueMap(classMap.people, 123343, "Max");
        classMap.addValueMap(classMap.people, 123344, "Jon");
        classMap.addValueMap(classMap.people, 123345, "Ivan");
        classMap.addValueMap(classMap.people, 123346, "Mot");

        //Вывод Мапы
        classMap.printMap(classMap.people);
        //Получение объекта по ключу
        classMap.getObjectMap(classMap.people, 123343);
        //Удаление обекта по ключу
        classMap.removeObjectMap(classMap.people, 123346);
        System.out.println();
        classMap.printMap(classMap.people);
    }
}