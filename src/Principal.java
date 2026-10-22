import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> figuras = new ArrayList<>();

        // Upcasting: referencias da classe mae recebem objetos das classes filhas.
        FormaGeometrica circulo = new Circunferencia(3);
        figuras.add(circulo);
        figuras.add(new Triangulo(3, 4, 5));
        figuras.add(new Retangulo(4, 6));
        figuras.add(new Retangulo(5, 5));
        figuras.add(new Pentagono(4));

        System.out.println("AREA E PERIMETRO (medidas em cm)");
        // Polimorfismo: nenhum teste de tipo e necessario para calcular.
        for (FormaGeometrica figura : figuras) {
            System.out.println(figura.getClass().getSimpleName());
            System.out.println("  Area: " + figura.getArea("cm"));
            System.out.println("  Perimetro: " + figura.getPerimetro("cm"));
        }

        System.out.println("\nCARACTERISTICAS ESPECIFICAS");
        mostrarDiametros(figuras);
        mostrarRetangulos(figuras);
        mostrarTiposTriangulos(figuras);
        mostrarLadosPentagonos(figuras);
    }

    public static void mostrarDiametros(ArrayList<FormaGeometrica> figuras) {
        for (FormaGeometrica figura : figuras) {
            if (figura instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) figura; // Downcasting seguro.
                System.out.println("Diametro da circunferencia: " + c.getDiametro() + " cm");
            }
        }
    }

    public static void mostrarRetangulos(ArrayList<FormaGeometrica> figuras) {
        for (FormaGeometrica figura : figuras) {
            if (figura instanceof Retangulo) {
                Retangulo r = (Retangulo) figura;
                System.out.println("Retangulo e quadrado? " + r.isQuadrado());
            }
        }
    }

    public static void mostrarTiposTriangulos(ArrayList<FormaGeometrica> figuras) {
        for (FormaGeometrica figura : figuras) {
            if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura;
                System.out.println("Tipo do triangulo: " + t.getTipoTriangulo());
            }
        }
    }

    public static void mostrarLadosPentagonos(ArrayList<FormaGeometrica> figuras) {
        for (FormaGeometrica figura : figuras) {
            if (figura instanceof Pentagono) {
                Pentagono p = (Pentagono) figura;
                System.out.println("Numero de lados do pentagono: " + p.getNumeroLados());
            }
        }
    }
}
