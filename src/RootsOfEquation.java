public class RootsOfEquation {
    public static double[] getRoots(Equation e) {
        double a = e.getA(), b = e.getB(), c = e.getC();
        double[] res;

        // ax^2 + bx + c = 0
        if (a != 0 && b != 0 && c != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                res = new double[2];
                res[0] = (-b + Math.sqrt(d)) / (2 * a);
                res[1] = (-b - Math.sqrt(d)) / (2 * a);
            } else if (d == 0) {
                res = new double[1];
                res[0] = -b / (2 * a);
            } else res = new double[3];
        }

        // bx + c = 0
        else if (a == 0 && b != 0 && c != 0) {
            res = new double[1];
            res[0] = -c / b;
        }

        // ax^2 + c = 0
        else if (a != 0 && b == 0 && c != 0) {
            if ((c > 0 && a > 0) || (c < 0 && a < 0)) res = new double[3];
            else {
                res = new double[2];
                res[0] = Math.sqrt(Math.abs(c / a));
                res[1] = -Math.sqrt(Math.abs(c / a));
            }
        }

        //ax^2 + bx = 0, x(ax+b) = 0
        else if (a != 0 && b != 0 && c == 0) {
            res = new double[2];
            res[0] = 0;
            res[1] = -b / a;
        }

        // c = 0;
        else if (a == 0 && b == 0 && c != 0) {
            res = new double[3];
        }

        // bx = 0;
        else if (a == 0 && b != 0 && c == 0) {
            res = new double[1];
            res[0] = 0;
        }

        // ax^2 = 0;
        else if (a != 0 && b == 0 && c == 0) {
            res = new double[1];
            res[0] = 0;
        }

        //0 = 0
        else {
            res = new double[4];
        }

        return res;
    }
}