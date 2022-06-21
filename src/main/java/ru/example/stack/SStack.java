package ru.example.stack;

class AbsStack {

    private char ch[]; // массив для хранения символов

    private int index; // индекс текущей свободной позиции

    AbsStack(int size) {
        ch = new char[10];
    }

    private void push(char sym) {
        // добавляем элемент в стэк
        if (index < ch.length) {
            ch[index] = sym;
            index++;
        }
        else System.out.println("Стэк переполнен.");
    }

    private void pop() {
        //убираем элемент из стэка
        if (index > 0) {
            index--;
        }
        else System.out.println("Стэк пуст.");
    }

    void usepush(char x) {
        //Вызов добавления
        push(x);
    }

    void usepop() {
        //Вызов удаления
        pop();
    }

    void showstack() {
        for (int i = 0; i < index;i++) {
            System.out.print(ch[i]);
        }
    }


}


public class SStack {
    public static void main(String[] args) {
        char ch[] = new char[10];

        AbsStack stack = new AbsStack(10);

//        Загрузка элементов массива
        for (int i = 0; i < 10; i++) {
            ch[i] = (char) ('A' + i);
        }

        // загрузка стэка элементами
        for (int i = 0; i < 10; i++) {
            stack.usepush(ch[i]);
        }
        stack.showstack();

//        Удаление элемента стэка
        stack.usepop();
        System.out.println();
//        Проверка удаления
        stack.showstack();
        System.out.println();
//   Проверка переполнения

        stack.usepush('P');
        stack.showstack();
        System.out.println();
        stack.usepush('O');
        stack.showstack();
        System.out.println();
        System.out.println();

//        Проверка пустого стэка
        for (int i = 0; i < ch.length + 1;i++) {
            stack.usepop();
            stack.showstack();
            System.out.println();
        }

    }
}
