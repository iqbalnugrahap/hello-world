public class bangungRuang {
    // varaible
    private Integer Panjang;
    private Integer Lebar;
    private Integer Tinggi;


    //konstraktor bangun ruang digunakan untuk memberi nilai awal pada objek yang telah di buat dalam class
    public bangungRuang(int Panjang,int Lebar, int Tinggi) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;
    }
    //metode untuk perjitungan balok
    public Integer perhitungan() {
        if (Panjang != null && Lebar != null && Tinggi != null ) {
            return Panjang * Lebar * Tinggi;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {

        //membuat objek balok
        bangungRuang balok = new bangungRuang(5, 3, 3);

        // membuat perhitungan dari objek balok dan dihitung mengguankan metode perhitugan
        Integer volume = balok.perhitungan();

        //menampilkan hasil perhitungan
        System.out.println("perhitungan hasil : " +  volume);
    }
}