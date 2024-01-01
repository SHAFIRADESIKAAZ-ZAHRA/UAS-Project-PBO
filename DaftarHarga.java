package AplikasiPremium;

import java.util.ArrayList;

public class DaftarHarga {
    private ArrayList<String> jenisaplikasi = new ArrayList();
    private ArrayList<Integer> harga = new ArrayList();
    public int size() {
        return this.jenisaplikasi.size();
    }

    public DaftarHarga() {
        this.jenisaplikasi.add("Netflix");
        this.harga.add(4000);
        this.jenisaplikasi.add("Disney Hotstar");
        this.harga.add(3000);
        this.jenisaplikasi.add("WeTV");
        this.harga.add(2000);
        this.jenisaplikasi.add("Viu");
        this.harga.add(2500);
        this.jenisaplikasi.add("Iflix");
        this.harga.add(2500);
        this.jenisaplikasi.add("Iqiyi");
        this.harga.add(2000);
    }

    public String getAplikasi(int id) {
        return (String)this.jenisaplikasi.get(id);
    }

    public int getHarga(int id) {
        return (Integer)this.harga.get(id);
    }
    public void daftarharga() {
        int n = this.size();

        for (int i = 0; i < n; ++i) {
            System.out.println("-------------------------------");
            System.out.println("    *Aplikasi " + this.getAplikasi(i) + "*");
            System.out.println("Harga           = " + this.getHarga(i));
            System.out.println("ID Aplikasi     = " + (i));
        }
    }
}
