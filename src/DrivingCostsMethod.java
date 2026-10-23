import java.util.Scanner;

public class DrivingCostsMethod {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double carMpg = scnr.nextDouble();
      double gasCost = scnr.nextDouble();

      DrivingCostsMethod car = new DrivingCostsMethod();

      System.out.printf("%.2f ", car.drivingCost(10.0, carMpg, gasCost));
      System.out.printf("%.2f ", car.drivingCost(50.0, carMpg, gasCost));
      System.out.printf("%.2f%n", car.drivingCost(400.0, carMpg, gasCost));
   }

   public double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      return drivenMiles / milesPerGallon * dollarsPerGallon;
   }
}
