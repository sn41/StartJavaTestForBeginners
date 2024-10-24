package utils;

public class Screen {
    public void println(String string) {
        System.out.println(string);
    }

    public void println(String[] strings) {
        for (String tmp : strings) {
            println(tmp);
        }
    }

    public void println(int value) {
        System.out.println(value);
    }

    public void println(int[] values) {
        for (int tmp : values) {
            println(tmp);
        }
    }
}