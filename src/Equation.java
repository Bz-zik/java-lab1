public class Equation {

    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if (a != 0) {
            sb.append(a).append("x^2 ");
        }
        if (b != 0) {
            sb.append(b < 0 ? "- " + Math.abs(b) : (a != 0 ? "+ " + b : "" + b)).append("x ");
        }
        if (c != 0) {
            sb.append(c < 0 ? "- " + Math.abs(c) : (a != 0 || b != 0 ? "+ " + c : "" + c));
        }
        sb.append(" = 0");
        return sb.toString();
    }
}
