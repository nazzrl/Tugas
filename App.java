import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double HARGA_PER_KG = 28000.0;
        System.out.print("Jumlah Telur (kg): ");
        double jumlahTelur = scanner.nextDouble();
        System.out.print("Uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();
        double totalBayar = jumlahTelur * HARGA_PER_KG;
        double uangKembalian = uangDiberikan - totalBayar;
        System.out.printf("Total Bayar: %.2f\n", totalBayar);
        System.out.printf("Uang Kembalian: %.2f\n", uangKembalian);
        
        scanner.close();
    }
}

