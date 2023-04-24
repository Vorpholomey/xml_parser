import java.util.Random;
import java.util.stream.Collectors;

public class Calculate {

    public static String getRandInt(int length) {
        Random random = new Random();
        String value = "";
        for (int i = 0; i < length; i++) {
            value = value + random.nextInt(9);
        }
        return value;
    }

    public static String getEnum(String[] arg) {
        Random random = new Random();
        return arg[random.nextInt(arg.length)];
    }

    public static String getEnumValue(String num, String[] arg) {
        int i = Integer.parseInt(num);
        return arg[i];
    }

    public static String getEnumValueDoc(String num, String[] arg) {
        int i = Integer.parseInt(num);
        String value;
        if (i == 42) {
            value = arg[7];
        } else value = arg[i];
        return value;

    }

    public static String getRandStr(int size) {
        String symbols = "абвгдеёжзиклмнопрстуфхцчшщъыьэюя";
        return new Random().ints(size, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());

    }
    public static String getRandStrInt(int size) {
        String symbols = "abcdefghijklmnopqrstuvwxyz1234567890";
        return new Random().ints(size, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());

    }

}


