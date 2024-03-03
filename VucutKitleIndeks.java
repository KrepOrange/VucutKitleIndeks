import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        //variable
        double height, weight;
        Scanner input = new Scanner(System.in);

        //Kilo (kg) / Boy(m) * Boy(m)

        System.out.print("Kg cinsinden kilonuzu giriniz: ");
        weight = input.nextDouble();
        System.out.print("Metre cinsinden boyunuzu giriniz: ");
        height = input.nextDouble();

        System.out.println("Vücut kitle indeksiniz: " + (weight / (height * height)));
    }
}
