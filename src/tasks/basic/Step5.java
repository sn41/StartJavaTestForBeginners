package tasks.basic;

public class Step5 {
    //Переменные бывают полями класса, как smile1
    static String smile = "\uD83D\uDC83";  //💃

    public static void main(String[] args) {
        //используем поле класса smile
        System.out.println(smile);

        //Переменные могут применяться в блоке кода,
        // как локальная переменная smile2

        String smile2 = "\uD83E\uDD2D";//🤭

        System.out.println( smile2);
    }

    //давайте исследуем правила видимости переменных
    //если в коде находится ошибка, мы его закомментируем

    public static void f2(){
        //видите, в другом методе f2 этого класса переменная smile2 не видна
        //ошибка
        //System.out.println( smile2);

        //поле класса smile1 - видно
        System.out.println(smile);
    }

    public static void f3(){
        //используем переменную tmp, в которую мы будем
        //пытаться поместить значения из переменных pistol, peach
        String tmp = "";

        //итак
        //tmp = pistol;
        //ошибка - здесь переменные pistol, peach не видны

        //объявим переменную pistol
        String pistol;
        //присвоим ей значение
        pistol = "\uD83D\uDD2B";//🔫

        tmp = pistol;
        //сработало, переменная pistol видна после её объявления

        //теперь создадим какой-нибудь блок кода
        {
            tmp = pistol;
            //pistol видна и здесь
            //tmp = peach;
            //peach не видна
            tmp = smile;

            //объявим переменную
            String peach = "\uD83C\uDF51";//🍑
            tmp = peach;
            //peach  видна
        }

        //tmp = peach;
        //peach не видна
        //переменная не видна за границами блока кода, где она объявлена
        //можно объявить новую переменную с таким именем
        String peach = "\uD83E\uDD8A";//🦊

        //как видим поле класса видно всюду внутри класса
        tmp = smile;
        System.out.println(smile);

        // интересно, что можно создать локальную переменную smile1,
        // которая "перекроет" видимость переменной класса smile1
        String smile1 = "\uD83D\uDC35"; //🐵
        System.out.println( smile1);

        tmp = smile1;
        System.out.println( tmp );

        // Но в одном блоке кода переменные с одинаковым идентификатором недопустимы.
        // String pistol;

    }
}

