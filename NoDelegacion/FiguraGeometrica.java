import java.lang.Math;
public class FiguraGeometrica {
  public void calcularArea(Object objeto) {
    if(objeto instanceof Rectangulo) {
      Rectangulo rectangulo = (Rectangulo)objeto;
      System.out.println(rectangulo.getBase()*rectangulo.getAltura());
    }
    else if(objeto instanceof Circulo) {
      Circulo circulo = (Circulo)objeto;
      System.out.println(circulo.getRadio()*circulo.getRadio()*Math.PI);
    }
  }
}