import java.util.Scanner;
public class Makanan extends Pesanan {
    Scanner input = new Scanner(System.in);
    public int id;
    public int jmlPesanan;
    public int pilih;
    public int harga;
    public int jumlah;

    @Override
    public void insertdata() {
        System.out.print("\nPilih Mau Pesan Apa : ");
        pilih = input.nextInt();
        if (pilih == 1){
            System.out.println("\nMAKANAN");
            System.out.println("Menu Makanan");
            System.out.println("1. Lele Goreng");
            System.out.println("2. Bebek Goreng");
            System.out.println("3. Ayam Goreng");
            System.out.print("\nSilahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 20000;
                    System.out.println("Anda memilih Lele Goreng");
                    break;

                case 2:
                    harga = 15000;
                    System.out.println("Anda memilih Bebek Goreng");
                    break;
                case 3:
                    harga = 23000;
                    System.out.println("Anda memilih Ayam Goreng");
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");

            }
            System.out.print("Masukkan Jumlah Pesanan : ");
            jmlPesanan = input.nextInt();
            jumlah = harga*jmlPesanan;
            System.out.println("Total Harga Pesanan : "+jumlah);
        }
    }
}
