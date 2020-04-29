class DigitsVariants {
     String[] errorMess = {
                "Все Ок",
                "Введенные числа за пределами допустимого диапазона",
                "Ошибка. Попытка деления на 0",
                "Результат - дробное число. Показана целая часть ",
                "Результат - отрицательное число. В римских цифрах невозможно отразить",
                "Результат - число 0. В римских цифрах невозможно отразить 0"
    };

     int digitOne;
     int digitTwo;
     String operator;
     int result;
     int errCode = 0;

    void doOperation() {

        if (checkDigitsRange()) {
            switch (operator){
                case "+": result = digitOne + digitTwo;
                    break;
                case "-": result = digitOne - digitTwo;
                    break;
                case "*": result = digitOne * digitTwo;
                    break;
                case "/":   if (digitOne % digitTwo != 0) errCode =3;
                        result = (int) digitOne / digitTwo;
                    break;
            }
            if (errCode !=3) checkResult();
        } else errCode = 1;

    }

    private boolean checkDigitsRange() {
        return (digitOne >= 1 && digitOne <= 10) && (digitTwo >= 1 && digitTwo <= 10);
    }

    void checkResult() {
     }

    void output() {

        if (errCode == 0) System.out.println("Результат: " + result);
        else
        if (errCode == 3) System.out.println(errorMess[errCode] + " = " + result);
        else
            System.out.println(errorMess[errCode]);
    }

}
