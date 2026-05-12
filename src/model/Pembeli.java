package model;

public class Pembeli {

    protected String namaPelanggan;
    protected int nomorAntrian;

    public Pembeli(String namaPelanggan,
                   int nomorAntrian) {

        this.namaPelanggan =
            namaPelanggan;

        this.nomorAntrian =
            nomorAntrian;
    }

    public String getNamaPelanggan() {

        return namaPelanggan;
    }

    public int getNomorAntrian() {

        return nomorAntrian;
    }
}