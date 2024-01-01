package AplikasiPremium;

import java.util.ArrayList;

public class Client implements User {
    private static int id;
    private ArrayList<String> namaClient = new ArrayList();
    private ArrayList<Integer> saldo = new ArrayList();

    public int getId(String nama) {return this.namaClient.indexOf(nama); }
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    public void addSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public void setSaldo(int id, int saldo) {
        this.saldo.set(id, saldo);
    }

    public String getNama(int id) {
        return (String)this.namaClient.get(id);
    }

    public int getSaldo(int id) {
        return (Integer)this.saldo.get(id);
    }
    public void setId(int id) { this.id = id; }

    public static void tampilkanAkun(Client client, Pembelian pembelian) {
        System.out.println("-- Akun Anda --");
        System.out.println("Nama Pelanggan  : " + client.getNama(pembelian.getClient(id)));
        System.out.println("ID              : " + pembelian.getIDClient(pembelian.getClient(id)));
        System.out.println("Saldo           : " + client.getSaldo(pembelian.getClient(id)));
    }
}