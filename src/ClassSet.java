import java.util.HashSet;
import java.util.Set;

public class ClassSet {

    //Обьявление массива типа Set
    Set<Integer> numbers = new HashSet<>();

    public void printSet(Set<Integer> set) {
        for (Integer a : set) {
            System.out.print(a + " ");
        }
    }

    public void addSetValue(Set<Integer> set, int value) {
        set.add(value);
    }

    public void removeSetToValue(Set<Integer> set, int value) {
        set.remove(value);
    }

    public void clearSet(Set<Integer> set) {
        set.clear();
    }

    public void containsSetValue(Set<Integer> set, int value) {
        if (set.contains(value)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
