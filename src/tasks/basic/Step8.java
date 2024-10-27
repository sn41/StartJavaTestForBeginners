package tasks.basic;

//нам удобно чтобы класс сам умел выводить на экран изображение
class Emoji2{

    //нам теперь не нужно со стороны обращаться к code
    //установим ему видимость из класса - private
    private String code;

    Emoji2(String newCode){
        code = newCode;
    }

    //добавим метод вывода кода на экран
    public void printCode(String str){
        System.out.println(str + code);
    }

}
public class Step8 {
    public static void main(String[] args) {
        Emoji2 cow = new Emoji2("\uD83D\uDC2E");
        Emoji2 pig = new Emoji2("\uD83D\uDC37");

        cow.printCode("cow = ");

        pig.printCode("pig = ");
//        System.out.println(cow.code);

    }
}

// продолжение в пакете round1
