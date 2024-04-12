package codigo;

import java.awt.*;

public class Rectangulo extends Figura {

   private double base;
   private double altura;

   public Rectangulo(double x, double y, Color color, int base, int altura){
      super(x, y, color);
      this.base = base;
      this.altura = altura;
   }

   public double getBase(){
      return base;
   }

   public double getAltura(){
      return altura;
   }

   public void setBase(double base){
      this.base = base;
   }

   public void setAltura(double altura){
      this.altura = altura;
   }

   @Override
   public double perimetro (){
      return 2 * base + 2 * altura;
   }

   @Override
   public double area (){
      return base * altura;
   }

}
