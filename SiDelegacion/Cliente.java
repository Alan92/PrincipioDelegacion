public class Cliente {
  public static void main(String args[]) {
    Circulo circulo = new Circulo(5);
    Rectangulo rectangulo = new Rectangulo(3,4);
    FiguraGeometrica figura = new FiguraGeometrica();
    figura.calcularArea(rectangulo);
    figura.calcularArea(circulo);
  }
}