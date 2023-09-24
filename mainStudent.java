public class mainStudent {
    public static void main(String[] args) {

    Student nilai = new Student("iqbal","B",3.21,0.5);


        System.out.println("nama : " + nilai.getNama());

        System.out.println();
       if (nilai.getIpk()>3.5&&nilai.getIpk()<4.0) {
           System.out.println("Indeks anda A");
       } else if(nilai.getIpk()>3.0&&nilai.getIpk()<3.5) {
           System.out.println("Grade anda B");

       }else if(nilai.getIpk()>2.75&&nilai.getIpk()<3.0) {
           System.out.println("Grade anda C");
       }else if(nilai.getIpk()>2.0&&nilai.getIpk()<2.75) {
           System.out.println("Grade anda D");
       }else {
           System.out.println("nilai anda tidak ada");
       }

    }
}