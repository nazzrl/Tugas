import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volume = Math.pow(sisi, 3);
        System.out.printf("Volume kubus: %.2f\n", volume);
        scanner.close();
    }
}
