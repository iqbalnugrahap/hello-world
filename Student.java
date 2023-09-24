public class Student {
    private String nama;
    private String indeks;
    private  Double Ipk;
    private Double poinkualitas;

    //konstruktor Student digunakan untuk memberi nilai awal pada objek yang telah di buat dalam class
    public Student(String nama, String indeks, double ipk, Double poinkualitas) {
        this.nama = nama;
        this.indeks=indeks;
        this.Ipk= ipk;
    }

    // getter getIpk digunakan untuk memngambil nilai ipk karena variable private
    public Double getIpk() {
        return Ipk;
    }
    // getter getname digunakan untuk memngambil nilai ipk karena variable private

    public String getNama() {
        return nama;
    }
    // getter getIpk digunakan untuk memngambil nilai ipk karena variable private
    public String getIndeks() {
        return indeks;
    }
    // getter getIpk digunakan untuk memngambil nilai ipk karena variable private
    public Double getPoinkualitas() {
        return poinkualitas;
    }


    }