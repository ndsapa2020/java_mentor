class ArabWay extends DigitsVariants {

    ArabWay(String text) {

        String[] operands = text.split("\\s++");
        digitOne = Integer.parseInt(operands[0]);
        digitTwo = Integer.parseInt(operands[2]);
        operator = operands[1].trim();

    }
}
