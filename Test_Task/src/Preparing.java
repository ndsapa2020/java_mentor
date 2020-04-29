import java.util.Scanner;

class Preparing {
      void go()  {

        System.out.println("Наберите \"stop\" для выхода");

        String regexArabic = "\\d{1,2}\\s+[-+*/]\\s+\\d{1,2}";

        String regexRoman = "[IVX]{1,4}\\s+[-+*/]\\s+[IVX]{1,4}";

        String text = "";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите выражение: ");
            text = scan.nextLine().trim();
            if (text.matches(regexArabic)) {
               // System.out.println("Выражение правильное из арабских цифр");
                ArabWay arabicObject = new ArabWay(text);
                arabicObject.doOperation();
                arabicObject.output();

            } else
            if (text.matches(regexRoman)) {
                //System.out.println("Выражение правильное из римских цифр");
                RomanWay romanObj = new RomanWay(text);
                romanObj.doOperation();
                romanObj.output();
            } else
            if (text.compareTo("stop") != 0) System.out.println("Не корректный формат ...");
        } while (text.compareTo("stop") != 0);
    }
}
