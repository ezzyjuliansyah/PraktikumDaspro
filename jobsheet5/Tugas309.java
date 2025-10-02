import java.util.Scanner;
public class Tugas309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("---Sistem Akses Wifi Kampus---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain):");
        String jenisPengguna = sc.next();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            //jika dosen
            System.out.println("Akses wifi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            //jika mahasiswa cek SKS
            System.out.print("Masukkan jumlah SKS yang diambil");
            int sks = sc.nextInt();

            if (sks >=12) {
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            //jika bukan dosen maupun mahasiswa
            System.out.println("Akses ditolak"); 

        }
        sc.close();    
    }
}    