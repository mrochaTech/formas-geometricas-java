# Formas geometricas em Java

Projeto orientado a objetos sem dependencias externas. Requer JDK 8 ou superior.

## Compilar e executar

Abra o terminal na pasta deste projeto e execute:

```sh
mkdir bin
javac -encoding UTF-8 -d bin src/*.java
java -cp bin Principal
```

## Requisitos implementados

- `FormaGeometrica`: classe abstrata com `getArea()` e `getPerimetro()`.
- `Triangulo`, `Retangulo`, `Circunferencia` e `Pentagono`: subclasses com atributos privados e sobrescrita dos calculos.
- `Principal`: `ArrayList<FormaGeometrica>` com upcasting e exibicao polimorfica sem teste de tipo no laco de calculos.
- Sobrecargas `getArea(String unidade)` e `getPerimetro(String unidade)` implementadas na classe abstrata e herdadas por todas as subclasses. Elas chamam os calculos sobrescritos e retornam valores formatados com duas casas decimais. A unidade e um rotulo, sem conversao numerica.
- Quatro funcoes especificas demonstram `instanceof` seguido de downcasting explicito para acessar um metodo exclusivo de cada subclasse.
- Validacao rejeita medidas nulas, negativas, infinitas ou NaN e lados que nao formam um triangulo.

O triangulo usa a formula de Heron. O pentagono e **regular**. A area da circunferencia representa a area do circulo delimitado por ela. Todas as dimensoes de uma figura devem usar a mesma unidade.

Exemplos: triangulo (3, 4, 5) tem area 6 e perimetro 12; retangulo (4, 6) tem area 24 e perimetro 20; circunferencia de raio 3 tem area 9*pi e perimetro 6*pi; pentagono de lado 4 tem area aproximada 27,53 e perimetro 20.
