import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Equation e = new Equation();

        System.out.println("Введите квадратное уравнение: ");
        String equation = reader.readLine();
//        String equation = "17x - x^2 + x - 17 = 4 + x^2 - 17";
//        String equation = "-4x + 4 = 0";


        Converter.convertToABC(e, Separator.separate(equation));
        System.out.println(e);

        double[] mass = RootsOfEquation.getRoots(e);
        if (mass.length == 4) System.out.println("x - любое значение.");
        else if (mass.length == 3) System.out.println("Нет вещественных корней.");
        else if (mass.length == 1) System.out.println("Уравнение имеет один корень: x = " + mass[0]);
        else System.out.println("Уравнение имеет два корня: x1 = " + mass[0] + ", x2 = " + mass[1]);

    }
}
