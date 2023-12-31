import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Kasir kasir = new Kasir();
        System.out.println("====== Kasir ======");
        System.out.print("Masukkan Nama  : ");
        kasir.nama = input.nextLine();
        System.out.print("Masukkan NO HP : ");
        kasir.no_tlpn = input.nextInt();

        Pembeli pembeli = new Pembeli();
        System.out.println("\n====== Pembeli ======");
        System.out.print("Masukkan Nama   : ");
        pembeli.nama = in.nextLine();
        System.out.print("Masukkan Alamat : ");
        pembeli.alamat= in.nextLine();
        System.out.print("Masukkan ID     : ");
        pembeli.id_pembeli = in.nextInt();
        System.out.print("Masukkan NO.HP  : ");
        pembeli.no_tlpn = in.nextInt();


        BufferedReader baca =new BufferedReader(new InputStreamReader(System.in));
        File file = new File("struk.txt");
        try {

            Makanan makanan = new Makanan();
            makanan.Pilihan();
            makanan.insertdata();

            Minuman minuman = new Minuman();
            minuman.Pilihan();
            minuman.insertdata();

            PrintWriter output = new PrintWriter(file);
            System.out.println("\n===========DATA Kasir===========");
            System.out.println("Nama Petugas : " + kasir.getNama());
            System.out.println("No.Hp        : " + kasir.getNo_tlpn());
            System.out.println("==================================\n");

            System.out.println("==========DATA Kasir============");
            System.out.println("Nama Kasir : " + pembeli.getNama());
            System.out.println("No ID        : " + pembeli.getId_pembeli());
            System.out.println("No HP        : " + pembeli.getNo_tlpn());
            System.out.println("Alamat       : " + pembeli.getAlamat());
            System.out.println("==================================\n");

            System.out.println("============STRUK Pesanan============");
            System.out.println("Nama Pembeli : "+ pembeli.getNama());
            System.out.println("No.ID        : "+ pembeli.getId_pembeli());
            System.out.println("NO.HP        : "+ pembeli.getNo_tlpn());
            System.out.println("Alamat       : "+ pembeli.getAlamat());
            System.out.println("Total Harga  : "+makanan.jumlah);
            System.out.println("==============================================");
            System.out.println("=======Terima Kasih Atas Kunjungan Anda=======");
            System.out.println("==============================================");

            output.println("============STRUK Pesanan============");
            output.println("Nama Pembeli : "+ pembeli.getNama());
            output.println("No.ID        : "+ pembeli.getId_pembeli());
            output.println("NO.HP        : "+ pembeli.getNo_tlpn());
            output.println("Alamat       : "+ pembeli.getAlamat());
            output.println("Total Harga  : "+makanan.jumlah);
            output.println("==============================================");
            output.println("=======Terima Kasih Atas Kunjungan Anda=======");
            output.println("==============================================");

            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak di temukan");
        }
    }
}
