class RomanWay extends DigitsVariants {

    private String[] romanNums = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private String[] romanNumsDecimal = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "LC", "C"};


    RomanWay(String text) {

        String[] operands = text.split("\\s++");
        digitOne = getArabAnalog(operands[0]);
        digitTwo = getArabAnalog(operands[2]);
        operator = operands[1].trim();

    }

    private int getArabAnalog(String str) {
        int arabAnalog = 0;
        for (int i = 1; i < romanNums.length; i++)
            if (str.compareTo(romanNums[i]) == 0) arabAnalog = i;
            if (arabAnalog == 0) errCode = 2;
        return arabAnalog;
    }


    private String getRomanFromArabic(int arabNum) {

        int decs= (int) arabNum/10;
        int units = Math.round(arabNum % 10);

        String a = romanNumsDecimal[decs];
        String b = romanNums[units];
        return a + b;
    }

    @Override
    void checkResult() {
        if (result < 0) errCode = 4;
        if (result == 0) errCode = 5;
    }

    @Override
    void output() {

        if (errCode == 0) System.out.println("Результат: " + getRomanFromArabic(result));
        else
        if (errCode == 3) System.out.println(errorMess[errCode] + " = " + getRomanFromArabic(result));
        else
        System.out.println(errorMess[errCode]);
    }



}
