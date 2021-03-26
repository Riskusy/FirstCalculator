public class Action {

    public static String calculate(Number first, Number second, String action) throws Exception {
        int result;

        switch (action) {
            case "+":
                result = first.getValue() + second.getValue();
                break;

            case "-":
                result = first.getValue() - second.getValue();
                break;

            case "*":
                result = first.getValue() * second.getValue();
                break;

            case "/":
                result = first.getValue() / second.getValue();
                break;
            default:
                throw  new Exception("Нет такого символа");
        }

        if (first.getType() == NumberType.ROMAN) {
            return NumberRome.toRomanNumber(result);
        }else return String.valueOf(result);

    }
}
