// FILE: src/model/Cookies.java

package model;

public class Cookies extends Pembeli {

    private int id;
    private String namaMenu;
    private int harga;
    private int jumlah;
    private int total;

    public Cookies(String namaPelanggan,
                   int nomorAntrian,
                   String namaMenu,
                   int harga,
                   int jumlah,
                   int total) {

        // constructor parent
        super(namaPelanggan, nomorAntrian);

        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public int getId() {

        return id;
    }

    public String getNamaMenu() {

        return namaMenu;
    }

    public int getHarga() {

        return harga;
    }

    public int getJumlah() {

        return jumlah;
    }

    public int getTotal() {

        return total;
    }
}