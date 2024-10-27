package tasks.basic;

//Попробуем получить доступ к полям и методам класса

public class Step2 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*
        Разберём это выражение.

        Есть класс java.io.PrintStream
            эта запись означает, что есть пакет java
                в нём покет io
                    в нём класс PrintStream

        Этот класс, PrintStream, объявил метод println(String ), мы его вызываем

        Есть класс System
             этот класс имеет поле out тип которого - java.io.PrintStream

        Таким образом, мы
        обращаемся к члену класса System - полю out,
            мы вызываем его функцию println,
                передавая ей строку "Hello world!"
         */
    }
}


