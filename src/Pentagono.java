/** Pentagono regular: cinco lados e cinco angulos iguais. */
public class Pentagono extends FormaGeometrica {
    private final double lado;

    public Pentagono(double lado) {
        validarMedida(lado);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return 5 * lado * lado / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    public double getPerimetro() { return 5 * lado; }

    public int getNumeroLados() { return 5; }
}
