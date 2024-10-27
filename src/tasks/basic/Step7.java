package tasks.basic;

//Нам удобнее передавать код символа сразу при создании объекта.
//Изменим класс Emoji, используем КОНСТРУКТОР класса

class Emoji1{
    //поле класса, переменная code
    String code;

    //конструктор класса
    Emoji1(String newCode){
        code = newCode;
    }

}
public class Step7 {
    public static void main(String[] args) {
        Emoji1 cow = new Emoji1("\uD83D\uDC2E");
        Emoji1 pig = new Emoji1("\uD83D\uDC37");

        System.out.println(cow.code);
        System.out.println(pig.code);
    }
}
