package utils;

public class MyScreen {
    public static void println(String string) {
        System.out.println(string);
    }

    public static void println(String[] strings) {
        for (String tmp : strings) {
            println(tmp);
        }
    }

    public static void println(int value) {
        System.out.println(value);
    }

    public static void println(int[] values) {
        for (int tmp : values) {
            println(tmp);
        }
    }
}