import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int intValue = 10000;
        long longFromInt = intValue;

        double doubleVal =  3.14159;
        Double doubleObject = Double.valueOf(doubleVal);

        System.out.println("Это зачение переменной doubleObjct: "+doubleObject);

        double doubleValue = intValue;
        System.out.println(doubleValue);

        String doubleValButString = "3";
        double doubleFromString = Double.parseDouble(doubleValButString);
        int intFromString = Integer.parseInt(doubleValButString);
        System.out.println(doubleFromString);
        System.out.println(intFromString);

//        Integer sum = new Integer(2) + new Integer(3);
        int sum = 7 + 3;
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию: ");
        String info = scanner.nextLine();
        System.out.println(info);

        String str = "Hello ";

        StringBuilder sbAppend = new StringBuilder(str);
        sbAppend.delete(0,4);
        System.out.println(sbAppend);
        //reverse()-переворачивает строку
        //delete(х,у)-удаляет символы между указанныйми индексами
        //deleteChar(х)-удаляет указанный символ
        //length()-возвращает длину строки
        //toString()-преобразует StringBuilder в обычную строку

        if (sum == 5) {
            System.out.println("Ответ равен пяти");
        }else if (sum == 10) {
            System.out.println("Ответ равен десяти");
        } else {
            System.out.println("Я не знаю, что тут написано");
        }
    }
}