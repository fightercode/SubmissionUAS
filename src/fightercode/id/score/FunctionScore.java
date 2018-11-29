package fightercode.id.score;


import java.util.Scanner;

public class FunctionScore {

    public void tampilkanDataSiswa(String namaLengkap, String alamatSiswa, int umurSiswa){

        Scanner ambildata = new Scanner(System.in);

        double uts, uas, tugas;
        double getPersenuts, getPersenuas, getPersentugas, totalNilaiAkhir;

        System.out.print("Masukan Nilai UTS Siswa: ");
        uts = ambildata.nextDouble();
        System.out.print("Masukan Nilai UAS Siswa: ");
        uas = ambildata.nextDouble();
        System.out.print("Masukan Nilai Tugas Siswa: ");
        tugas = ambildata.nextDouble();

        //Proses Mendapatkan Nilai Akhir
        getPersenuts = uts%30;
        getPersenuas = uas%30;
        getPersentugas = tugas%70;
        totalNilaiAkhir = getPersenuts + getPersenuas + getPersentugas;

        System.out.println("\n\n\n");
        System.out.println("Data Nilai Siswa Ujian Akhir Semester 1 (UAS)");
        System.out.println("================================================");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Alamat Siswa : " + alamatSiswa);
        System.out.println("Umur Siswa   : " + umurSiswa);
        System.out.println("================================================");
        System.out.println("Nilai UTS    : " + uts);
        System.out.println("Nilai UAS    : " + uas);
        System.out.println("Nilai TUGAS  : " + tugas);
        System.out.println("================================================");
        System.out.println("Total Nilai  : " + totalNilaiAkhir);
    }

}
