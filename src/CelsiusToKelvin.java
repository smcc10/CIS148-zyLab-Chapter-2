import java.util.Scanner;

public class CelsiusToKelvin {

   public static double convert(double degreesCelsius) {
      return degreesCelsius + 273.15;
   }
   
   public static void main(String[] args) {
      double result = convert(new Scanner(System.in).nextDouble());
      System.out.printf("%.2f", result);
   }
}
