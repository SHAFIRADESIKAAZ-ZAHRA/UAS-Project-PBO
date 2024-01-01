package AplikasiPremium;

import java.util.Scanner;

public class Saldo {
    protected static Scanner input = new Scanner(System.in);
    public static void saldo(Client client, Pembelian pembelian, int id) {
        int saldosekarang = client.getSaldo(pembelian.getClient(id));
        System.out.println("-- Top Up Saldo --");
        System.out.println("Saldo Anda Saat Ini: " + saldosekarang);

        System.out.print("Masukkan Jumlah Saldo yang Ingin Di-Top Up: ");
        int jumlahTopUp = input.nextInt();

        int saldoBaru = saldosekarang + jumlahTopUp;
        client.setSaldo(pembelian.getClient(id), saldoBaru);

        System.out.println("Top Up Saldo Berhasil!");
        System.out.println("Saldo Anda Sekarang: " + saldoBaru);
    }
}