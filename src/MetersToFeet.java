import java.util.Scanner;

public class MetersToFeet {

   public static double convert(double meters) {
      return meters * 3.28;
   }
   
   public static void main(String[] args) {
      double result = convert(new Scanner(System.in).nextDouble());
      System.out.printf("%.2f", result);
   }
}
