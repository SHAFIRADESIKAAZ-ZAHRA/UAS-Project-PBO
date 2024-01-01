package AplikasiPremium;

import java.util.Scanner;

class Main {
    static Client client = new Client();
    static Pembelian pembelian = new Pembelian();
    static DaftarHarga jenisaplikasi = new DaftarHarga();
    static Saldo saldoanda = new Saldo();
    static Scanner input;
    static boolean tetap;
    static String key;

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Pembelian Aplikasi Premium ");
        System.out.print("Masukkan Nama = ");
        String nama = input.next();
        client.setNama(nama);
        System.out.print("Masukkan ID = ");
        int Id = input.nextInt();
        pembelian.setIDClient(Id);
        System.out.print("Masukkan Saldo = ");
        int saldo = input.nextInt();
        client.addSaldo(saldo);
        int id = pembelian.getIDClient(client.getId(nama));
        client.setId(id);
        menu(id);
    }

    public static void menu(int id) {
        while(tetap) {
            System.out.println("-- Menu Aplikasi Premium --");
            System.out.println("1. Daftar Harga Aplikasi");
            System.out.println("2. Pembelian");
            System.out.println("3. Top Up Saldo");
            System.out.println("4. Akun Anda");
            System.out.println("5. Exit");
            System.out.print("Pilih menu = ");
            int menu = input.nextInt();
            if (menu == 1) {
                jenisaplikasi.daftarharga();
                System.out.println("Ketik Apapun Untuk Kembali");
                key = input.next();
            } else if (menu == 2) {
                pembelian.beliAplikasi(client, id);
                System.out.println("Ketik Apapun Untuk Kembali");
                key = input.next();
            } else if (menu == 3) {
                saldoanda.saldo(client, pembelian, id);
                System.out.println("Ketik Apapun Untuk Kembali");
                key = input.next();
            } else if (menu == 4) {
                Client.tampilkanAkun(client,pembelian);
                System.out.println("Ketik Apapun Untuk Kembali");
                key = input.next();
            } else if (menu == 5) {
                System.out.println("Anda Telah Keluar");
                tetap = false;
            } else {
                System.out.println("Input yang anda masukkan tidak sesuai");
                System.out.println("Ketik Apapun Untuk Kembali");
                key = input.next();
            }
        }

    }
    static {
        input = new Scanner(System.in);
        tetap = true;
    }
}
