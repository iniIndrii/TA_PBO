public abstract class Pesanan implements DaftarMenu {
    public abstract void insertdata();

    @Override
    public void Pilihan() {
        System.out.println("\nSELAMAT DATANG DI PECEL LELE Mbak Indri");
        System.out.println("=============Mau Pesan Apa?============");
        System.out.println("1. Daftar Menu Makanan");
        System.out.println("2. Daftar Menu Minuman");
        System.out.println("=======================================");

    }
}
