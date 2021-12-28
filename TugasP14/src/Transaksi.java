import java.util.Scanner;

public class Transaksi extends Barang implements Penjualan {
    Scanner user = new Scanner(System.in);

    @Override
    public void NoFaktur() {
        this.NoFaktur = user.nextInt();
    }

    @Override
    public void NamaBarang() {
        this.namaBarang = user.next();
    }

    @Override
    public void HargaBarang() {
        this.hargaBarang = user.nextInt();
    }

    @Override
    public Integer SubTotal() {
        this.subTotal = hargaBarang * jumlahBarang;

        return this.subTotal;
    }

    @Override
    public Double Discount() {
        if (subTotal > 10000000) {
            this.discount = 0.1;
            System.out.println("\nKamu mendapatkan diskon 10%\n");
        } else if (subTotal > 1000000) {
            this.discount = 0.05;
            System.out.println("\nKamu mendapatkan diskon 5%\n");
        } else if (subTotal > 500000) {
            this.discount = 0.03;
            System.out.println("\nKamu mendapatkan diskon 3%\n");
        } else if (subTotal >= 250000) {
            this.discount = 0.01;
            System.out.println("\nKamu mendapatkan diskon 1%\n");
        } else {
            System.out.println("\nKamu tidak mendapatkan diskon\n");
        }
        return this.discount;
    }

    @Override
    public void TotalHarga() {
        this.totalBayar = (int) (this.subTotal - (this.subTotal * this.discount));

    }

    
}
