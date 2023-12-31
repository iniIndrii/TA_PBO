import java.util.Scanner;
public class Minuman extends Pesanan {
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
        if (pilih == 2){
            System.out.println("\nMINUMAN");
            System.out.println("Menu Minuman");
            System.out.println("1. Air Es");
            System.out.println("2. Teh Es /Panas");
            System.out.println("3. Jeruk Es /Panas");
            System.out.println("4. Tanpa Minum");
            System.out.print("\nSilahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 1000;
                    System.out.println("Anda memilih Air Es");
                    break;
                case 2:
                    harga = 3000;
                    System.out.println("Anda memilih Teh Es /Panas");
                    break;
                case 3:
                    harga = 5000;
                    System.out.println("Anda memilih Jueruk Es /Panas");
                    break;
                case 4:
                    harga = 0;
                    System.out.println("Anda tidak minum");
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");

            }
            System.out.print("Masukkan Jumlah Pesanan : ");
            jmlPesanan = input.nextInt();
            jumlah = harga*jmlPesanan;
            System.out.println("Total harga Pesanan : "+jumlah);
        }
    }
}
