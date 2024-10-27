package tasks.basic;


//Классы и объекты
//создадим класс который хранит эмодзи

class Emoji {
    //строку эмодзи будем хранить в поле класса, переменной code
    String code = "";
}

//Давайте используем этот класс
public class Step6 {
    public static void main(String[] args) {
        //объявим локальные переменные
        String catCode;
        String dogCode;

        Emoji cat;
        Emoji dog;

        //присвоим им значения - инициализируем

        catCode = "\uD83D\uDC31";//🐱
        dogCode = "\uD83D\uDC36";//🐶

        cat = new Emoji();
        cat.code = "\uD83D\uDC31";//🐱

        dog = new Emoji();
        dog.code = "\uD83D\uDC31";//🐶

        //можно сразу и объявить и инициализировать

        String cowCode = "\uD83D\uDC2E";//🐮
        String pigCode = "\uD83D\uDC37";//🐷

        Emoji cow = new Emoji();
        cow.code = cowCode;//🐮

        Emoji pig = new Emoji();
        pig.code = pigCode;//🐷

        //теперь используем эти переменные

        System.out.println(catCode);
        System.out.println(dogCode);
        System.out.println(cowCode);
        System.out.println(pigCode);

        System.out.println("Теперь обратимся к объектам cat, dog, cow, pig");

        System.out.println(cat.code);
        System.out.println(dog.code);
        System.out.println(cow.code);
        System.out.println(pig.code);
    }


}
