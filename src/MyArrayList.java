import java.util.ArrayList;

public class MyArrayList {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void addFiveNumbers() {
        for (int i = 0; i < 5; i++) {
            arrayList.add((int)(Math.random() * 10));
        }
    }

    public void toStringAllElements() {
        for(int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void deleteElement(int index) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++) {
            if (i == index) {
                continue;
            };
            temp.add(arrayList.get(i));
        }

        arrayList = temp;
    }

    public void changeElement(int index, int newElement) {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++) {
            if (i == index) {
                temp.add(newElement);
                continue;
            };
            temp.add(arrayList.get(i));
        }

        arrayList = temp;
    }

    public void checkElement(int element) {
        for (int num : arrayList) {
            if (num == element) {
                System.out.println("Данный элемент есть в списке");
                break;
            }
        }

        System.out.println("Данного элемента нет в списке");
    }
}
