public class Retangulo extends FormaGeometrica {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        validarMedida(base);
        validarMedida(altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() { return base * altura; }

    @Override
    public double getPerimetro() { return 2 * (base + altura); }

    public boolean isQuadrado() { return base == altura; }
}
