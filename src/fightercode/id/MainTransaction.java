package fightercode.id;

import fightercode.id.transaction.NotaPembelian;

import java.util.Scanner;

public class MainTransaction {

    public static void main(String[] args) {

        // TODO 1: Deklarasikan Class Operasi untuk Inputan
        Scanner ambildata = new Scanner(System.in);

        // TODO 4.1: Untuk Memanggil Method dari Class NotaPembelian kita harus mendeklarasikan class terlebih dahulu
        // TODO 4.2: Untuk Mengakses Method dari Dekalasi variable yang dibuat misal: transact.TransactionData

        NotaPembelian transact = new NotaPembelian();

        // Variable Global (Yang dapat diakses di class ini)
        String set_barangyangdipilih;
        int set_hargabarang;
        int inputan_pilihbarang;

        System.out.println("Open Transaction Data");
        System.out.println("=====================================");
        System.out.println("1. Monitor 21 Inch");
        System.out.println("2. Keyboard Gaming");
        System.out.println("3. CPU Z ASUS X451 Core i5");
        System.out.println("4. Mouse Gaming");
        System.out.println("0. Exit");
        System.out.println("=====================================");
        System.out.print("Pilih Barang [0-4]: ");
        inputan_pilihbarang = ambildata.nextInt();

        // TODO 2: Buat Fungsi dengan Menggunakan If & If Else
        // TODO 2.1: Dengan ketentuan Jika pilhan barang 1 maka akan mendapatkan deskripsi: 1. Barang yang dipilih, 2. Harga Barang
        // TODO 2.2: Membuat Notanya setelah dilakukan transaksi tersebut
        // TODO 2.3: Jika User Memilih Pilihan 0 Maka akan Tampil Pesan Keluar dari Program dan tidak menampilkan transaksi
        // TODO 3.1: Buatlah Class NotaPembelian untuk membuat function dari Nota Pembayaran

        if (inputan_pilihbarang == 1) {
            set_barangyangdipilih = "Monitor 21 Inch";
            set_hargabarang = 1600000;

            transact.TransactionData(set_barangyangdipilih, set_hargabarang);
        } else if (inputan_pilihbarang == 2) {
            set_barangyangdipilih = "Keyboard Gaming";
            set_hargabarang = 1400000;

            transact.TransactionData(set_barangyangdipilih, set_hargabarang);
        } else if (inputan_pilihbarang == 3) {
            set_barangyangdipilih = "CPU Z ASUS X451 Core i5";
            set_hargabarang = 1300000;

            transact.TransactionData(set_barangyangdipilih, set_hargabarang);
        } else if (inputan_pilihbarang == 4) {
            set_barangyangdipilih = "Mouse Gaming";
            set_hargabarang = 1100000;

            transact.TransactionData(set_barangyangdipilih, set_hargabarang);
        } else if (inputan_pilihbarang == 0) {

            transact.TransactionExit();
        }
    }
}
