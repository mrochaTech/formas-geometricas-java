/** Triangulo definido pelas medidas de seus tres lados. */
public class Triangulo extends FormaGeometrica {
    private final double a;
    private final double b;
    private final double c;

    public Triangulo(double a, double b, double c) {
        validarMedida(a);
        validarMedida(b);
        validarMedida(c);
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Os lados nao formam um triangulo.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimetro() {
        return a + b + c;
    }

    public String getTipoTriangulo() {
        if (a == b && b == c) return "Equilatero";
        if (a == b || a == c || b == c) return "Isosceles";
        return "Escaleno";
    }
}
