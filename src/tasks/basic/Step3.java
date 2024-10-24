package tasks.basic;


public class Step3 {
    public static void main(String[] args) {
        //Попробуем обратиться к полю smile класса Smile1.

        //Пишем имя класса Smile1, точку , имя поля smile.

        System.out.println("Hello world!" + Smile1.smile);

        //полям можно передавать новые значения
        Smile1.smile = "\uD83E\uDD23";   //🤣

        //посмотрим что получилось
        System.out.println("Hello world!" + Smile1.smile);
    }
}

class Smile1 {
    static String smile = "\uD83D\uDE00"; //    😀
}

