import java.util.ArrayList;
import java.util.List;

public class ClassList {

    //Обьявление массива типа List
    List<String> aList = new ArrayList<>();

    //метод для вывода всего массива
    public void printList(List<String> list) {
        for (String a : list) {
            System.out.println(a);
        }
    }

    public void addListValue(List<String> list, String value) {
        list.add(value);
    }

    public void removeListValueToObject(List<String> list, String value) {
        list.remove(value);
    }

    public void removeListValueToIndex(List<String> list, int index) {
        list.remove(index);
    }

    public void searchByValue(List<String> list, String value) {
        if (list.contains(value)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
