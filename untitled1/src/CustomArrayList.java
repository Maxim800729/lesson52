import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {
    private List<Integer> list;

    public CustomArrayList() {
        this.list = new ArrayList<>();
    }

    // Очистка списка
    public void clear() {
        list.clear();
    }

    // Проверка, содержит ли список заданное значение
    public boolean isHasValue(int value) {
        return list.contains(value);
    }

    // Получение индекса первого вхождения значения
    public int indexOf(int value) {
        return list.indexOf(value);
    }

    // Удаление элемента по индексу
    public void removeByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    // Удаление элемента по значению
    public void removeByValue(int value) {
        list.remove(Integer.valueOf(value));
    }

    // Добавление массива элементов в список
    public void addAll(Integer[] arr) {
        for (Integer num : arr) {
            list.add(num);
        }
    }

    // Удаление всех дубликатов
    public void removeAllDuplikat() {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        list = uniqueList;
    }

    // Уменьшение всех элементов на 1
    public void decreaseArr() {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - 1);
        }
    }

    // Вывод списка
    public void printList() {
        System.out.println(list);
    }

    // Тестирование класса
    public static void main(String[] args) {
        CustomArrayList customList = new CustomArrayList();

        customList.addAll(new Integer[]{1, 2, 3, 4, 5, 2, 3});
        customList.printList(); // [1, 2, 3, 4, 5, 2, 3]

        System.out.println(customList.isHasValue(3)); // true
        System.out.println(customList.indexOf(4)); // 3

        customList.removeByIndex(1);
        customList.printList(); // [1, 3, 4, 5, 2, 3]

        customList.removeByValue(3);
        customList.printList(); // [1, 4, 5, 2, 3]

        customList.removeAllDuplikat();
        customList.printList(); // [1, 4, 5, 2, 3]

        customList.decreaseArr();
        customList.printList(); // [0, 3, 4, 1, 2]

        customList.clear();
        customList.printList(); // []
    }
}