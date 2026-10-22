/** A area corresponde ao circulo delimitado pela circunferencia. */
public class Circunferencia extends FormaGeometrica {
    private final double raio;

    public Circunferencia(double raio) {
        validarMedida(raio);
        this.raio = raio;
    }

    @Override
    public double getArea() { return Math.PI * raio * raio; }

    @Override
    public double getPerimetro() { return 2 * Math.PI * raio; }

    public double getDiametro() { return 2 * raio; }
}
