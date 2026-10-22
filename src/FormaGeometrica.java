import java.util.Locale;

/** Contrato comum a todas as figuras. */
public abstract class FormaGeometrica {
    public abstract double getArea();
    public abstract double getPerimetro();

    // Sobrecargas herdadas por todas as figuras; usam despacho polimorfico.
    public String getArea(String unidade) {
        validarUnidade(unidade);
        return String.format(Locale.forLanguageTag("pt-BR"), "%.2f %s²", getArea(), unidade);
    }

    public String getPerimetro(String unidade) {
        validarUnidade(unidade);
        return String.format(Locale.forLanguageTag("pt-BR"), "%.2f %s", getPerimetro(), unidade);
    }

    protected static void validarMedida(double medida) {
        if (!Double.isFinite(medida) || medida <= 0) {
            throw new IllegalArgumentException("A medida deve ser positiva e finita.");
        }
    }

    private static void validarUnidade(String unidade) {
        if (unidade == null || unidade.trim().isEmpty()) {
            throw new IllegalArgumentException("Informe uma unidade de medida.");
        }
    }
}
