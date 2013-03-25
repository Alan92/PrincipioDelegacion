public class Rectangulo {
  private int altura;
  private int base;
  public Rectangulo(int base, int altura) {
    setBase(base);
    setAltura(altura);
  }

  public void setBase(int base) {
    this.base = base;
  }
  public void setAltura(int altura) {
    this.altura = altura;
  }
  public int getAltura() {
    return altura;
  }
  public int getBase() {
    return base;
  }
}