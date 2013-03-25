import java.io.*;
import java.util.*;
import java.lang.Math;
public class Circulo {
  private int radio;
  public Circulo(int radio) {
    setRadio(radio);
  }
  public double calcularAreaCirculo() {
    return getRadio()*getRadio()*Math.PI;
  }
  public int getRadio() {
    return radio;
  }
  public void setRadio(int radio) {
    this.radio = radio;
  }
}