import java.util.Scanner;
public class HargaBayar23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk;
        int harga, jumlah, jmlHalaman;
        double dis,total,bayar,jmlDis;
        System.out.println("Masukkan Judul Buku yang Dibeli: ");
        merk = input.nextLine();
        System.out.println("Masukkan jumlah halaman pada buku yang dibeli: ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukkan harga yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan  besaran diskon: (0.x)");
        dis = input.nextDouble();
        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;
        System.out.println("Anda akan membeli buku dengan merk "+merk);
        System.out.println("Dengan halaman setebal "+ jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah "+jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah "+bayar);
        
    }
    
}
