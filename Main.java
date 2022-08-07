import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    int r;
    double 𝜋=3.14,alan,𝛼;

    System.out.println("Dairenin yaricapini giriniz:");
    r=input.nextInt();
    System.out.println("Merkez acisinin olcusunu giriniz:");
    𝛼=input.nextDouble();

    alan= (𝜋 *(r*r) * 𝛼) / 360;

    System.out.println("Daire diliminin alani:"+ alan);





    }

}
