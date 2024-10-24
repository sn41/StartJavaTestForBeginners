package tasks.basic;

public class Step4 {
    public static void main(String[] args) {
        //Посмотрим, как можно обратиться к методам класса.
        Smile2.print();
    }
}

class Smile2 {
    static void print(){
        System.out.println("Это стока выведена на экран методом print() класса Smile2");
    }
}

