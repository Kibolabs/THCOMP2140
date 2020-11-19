import java.util.Scanner;

public class Mileage{
    public static void main(String[] args) {
      int miles;
      double gallons; mpg;
      
      Scanner sc = new Scanner(System.in);

      miles=sc.nextInt();

      gallons=sc.nextDouble();
      mpg=miles/gallons;

      System.out.println("Miles"+"Per"+"Gallon: " + mpg);
    }
}