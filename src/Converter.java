import java.util.ArrayList;

public class Converter {

    public static void convertToABC(Equation e, ArrayList<String> list) {
        double a = 0, b = 0, c = 0;

        for (String currentCoefficient : list) {
            if (currentCoefficient.contains("x^2")) {
                currentCoefficient = currentCoefficient.replaceAll("x\\^2", "");
                a = getValue(a, currentCoefficient);
            } else if (currentCoefficient.contains("x")) {
                currentCoefficient = currentCoefficient.replaceAll("x", "");
                b = getValue(b, currentCoefficient);
            } else {
                c = c + Double.parseDouble(currentCoefficient);
            }
        }

        e.setA(a);
        e.setB(b);
        e.setC(c);
    }

    private static double getValue(double value, String currentCoefficient) {
        switch (currentCoefficient) {
            case "-":
                value--;
                break;
            case "":
                value++;
                break;
            default:
                value += Double.parseDouble(currentCoefficient);
                break;
        }
        return value;
    }
}
