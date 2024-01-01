package AplikasiPremium;

import java.util.ArrayList;
import java.util.Scanner;

import static AplikasiPremium.Main.jenisaplikasi;
import static AplikasiPremium.Main.pembelian;

public class Pembelian extends Transaksi{
    protected static Scanner input = new Scanner(System.in);
    private ArrayList<Integer> idClient = new ArrayList();
    private ArrayList<Integer> IdAplikasi = new ArrayList();
    private ArrayList<Integer> durasi = new ArrayList();
    private ArrayList<String> Emailakun = new ArrayList();
    public DaftarHarga aplikasi = new DaftarHarga();
    public Pembelian() {
        for(int i = 0; i < this.aplikasi.size(); ++i) {
            this.IdAplikasi.add(i);
        }
    }

    public void setIDClient(int id) {
        this.idClient.add(id);
    }
    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }
    public void setEmailakun(String emailakun) {
        this.Emailakun.add(emailakun);
    }
    public int getClient(int id) {
        return this.idClient.indexOf(id);
    }
    public int getIDClient(int id) {
        return this.idClient.get(id);
    }
    public int getIdAplikasi(int id) {
        return this.IdAplikasi.get(id);
    }

    @Override
    public void beliAplikasi(Client client, int clientId) {
        jenisaplikasi.daftarharga();
        System.out.println("Masukkan Id Aplikasi Yang Anda Inginkan : ");
        int aplikasiId = input.nextInt();
        if (aplikasiId>=0 && aplikasiId<=5) {
            System.out.println("Masukkan Durasi (hari) : ");
            int durasi = input.nextInt();
            setDurasi(durasi);
            System.out.println("Masukkan Email : ");
            String emailakun = input.next();
            setEmailakun(emailakun);
            int harga = aplikasi.getHarga(getIdAplikasi(aplikasiId)) * durasi;
            int total = client.getSaldo(getClient(clientId)) - harga;
            if (client.getSaldo(getClient(clientId)) >= harga) {
                System.out.println("----------Pembelian Aplikasi Premium----------");
                System.out.println("Nama Pelanggan = " + client.getNama(getClient(clientId)));
                System.out.println("ID Pelanggan   = " + pembelian.getIDClient(getClient(clientId)));
                System.out.println("Akun Email     = " + emailakun);
                System.out.println("Jenis Aplikasi = " + aplikasi.getAplikasi(aplikasiId));
                System.out.println("Durasi (hari)  = " + durasi);
                System.out.println("Total Harga    = " + harga);
                System.out.println("Sisa Saldo     = " + total);
                client.setSaldo(getClient(clientId), client.getSaldo(getClient(clientId)) - harga);
                System.out.println("---Terimakasih Telah Membeli Aplikasi Premium---");
            } else {
                System.out.println("Saldo Anda Tidak Cukup");
            }
        }
        else {
            System.out.println("Id Aplikasi Tidak Tersedia");
        }
    }
}

