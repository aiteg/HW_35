public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.addFiveNumbers(); // добавляет 5 рандомных чисел
        myArrayList.toStringAllElements();

        myArrayList.deleteElement(1);
        myArrayList.toStringAllElements();

        myArrayList.changeElement(0, 100000);
        myArrayList.toStringAllElements();

        myArrayList.checkElement(100);

    }
}