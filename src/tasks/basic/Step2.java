package tasks.basic;

//Попробуем получить доступ к полям и методам класса

public class Step2 {
    public static void main(String[] args) {
        /*
        разберём это выражение
        Есть класс java.io.PrintStream
            эта запись означает, что есть пакет java
                в нём покет io
                    в нём класс PrintStream

        Этот класс объявил метод println(String )
            точнее там объявлена группа методов println для разных типов аргументов...

        Теперь
            Есть класс System
                этот класс имеет поле out тип которого = java.io.PrintStream

        И в результате мы делаем следующее:
        Обращаемся к члену класса System - полю out;
            мы вызываем его функцию println;
                и передаём ей строку "Hello world!"
         */
        System.out.println("Hello world!");
    }
}


