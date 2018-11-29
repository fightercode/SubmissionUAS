package fightercode.id;

import fightercode.id.score.FunctionScore;

import java.util.Scanner;

public class MainRank {

    public static void main(String[] args) {

        Scanner ambildata = new Scanner(System.in);
        FunctionScore penilaian = new FunctionScore();

        int pilihsiswa;

        String[] namasiswa = {
            "Fikri Amanullah",
            "Riziq Rezaldi",
            "Lukmanul Hakim",
            "Maudi Ayunda",
            "Suci Fitriani",
            "Herman Ananda",
            "Hendi Yahya",
            "Yuniarti",
            "Fajar Sanjaya"
        };

        String[] alamatsiswa = {
            "Bekasi",
            "Cikarang Pusat",
            "Cikarang Barat",
            "Bekasi",
            "Jakarta",
            "Bogor",
            "Bekasi",
            "Tanggerang",
            "Jakarta Selatan"
        };

        int[] umursiswa = {
                19,
                18,
                20,
                21,
                22,
                17,
                17,
                16,
                15
        };

        System.out.println("Open Transaction Data");
        System.out.println("=====================================");
        System.out.println("1. Fikri Amanullah");
        System.out.println("2. Riziq Rezaldi");
        System.out.println("3. Lukmanul Hakim");
        System.out.println("4. Maudi Ayunda");
        System.out.println("5. Suci Fitriani");
        System.out.println("6. Herman Ananda");
        System.out.println("7. Hendi Yahya");
        System.out.println("8. Yuniarti");
        System.out.println("9. Fajar Sanjaya");
        System.out.println("0. Exit");
        System.out.println("=====================================");
        System.out.print("Pilihan Anda [0-9]: ");
        pilihsiswa = ambildata.nextInt();

        switch (pilihsiswa){
            case 1:
                penilaian.tampilkanDataSiswa(namasiswa[0], alamatsiswa[0], umursiswa[0]);
                break;
            case 2:
                penilaian.tampilkanDataSiswa(namasiswa[1], alamatsiswa[1], umursiswa[1]);
                break;
            case 3:
                penilaian.tampilkanDataSiswa(namasiswa[2], alamatsiswa[2], umursiswa[2]);
                break;
            case 4:
                penilaian.tampilkanDataSiswa(namasiswa[3], alamatsiswa[3], umursiswa[3]);
                break;
            case 5:
                penilaian.tampilkanDataSiswa(namasiswa[4], alamatsiswa[4], umursiswa[4]);
                break;
            case 6:
                penilaian.tampilkanDataSiswa(namasiswa[5], alamatsiswa[5], umursiswa[5]);
                break;
            case 7:
                penilaian.tampilkanDataSiswa(namasiswa[6], alamatsiswa[6], umursiswa[6]);
                break;
            case 8:
                penilaian.tampilkanDataSiswa(namasiswa[7], alamatsiswa[7], umursiswa[7]);
                break;
            case 9:
                penilaian.tampilkanDataSiswa(namasiswa[8], alamatsiswa[8], umursiswa[8]);
                break;
            default:
                System.out.println("Anda keluar dari program!");
                break;
        }
    }
}
