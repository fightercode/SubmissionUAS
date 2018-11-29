package fightercode.id.transaction;

import java.util.Scanner;

public class NotaPembelian {

    public void TransactionData (String barang, int harga) {
        // TODO 3.2: Membuat Method Transaksi Nota, Dalam Transaksi ini User harus Memasukan Total Pembelain Barang yang Dibeli
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa yang di Beli: ");
        int totalbelibarang = input.nextInt();

        // TODO 3.3: Membuat Operasi Total Uang yang Harus dibayarkan dari Hasil inputan sebelumnya
        int totalbayar = harga * totalbelibarang;

        // TODO 3.4: Menampilkan Nota dimana Aksi yang diberikan
        System.out.println("\n\n");
        System.out.println("Nota Pembayaran");
        System.out.println("=====================================");
        System.out.println("Open Transaction Data, Barang yang \n" +
                "dipilih adalah " + barang + " dengan harga\n" +
                "satuan Rp. " + harga + ", total bayar\n" +
                "Rp. " + totalbayar + ", Thanks for transaction. :-D");
    }

    public void TransactionExit (){
        // TODO 3.5: Membuat Method Pesan Keluar
        System.out.println("Anda keluar dari program! :-D");
    }
}
