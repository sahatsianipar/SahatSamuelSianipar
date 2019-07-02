package com.example.mcsahat;

public class Mahasiswa {

    private String nama;
    private String alamat;
    private String nik;

    public Mahasiswa(String nama, String alamat, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNik() { return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
