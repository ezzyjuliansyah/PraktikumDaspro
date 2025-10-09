import java.text.DecimalFormat;
import java.util.Scanner;

public class CM1_09 {
  // fungsi untuk mengkonversi nilai angka menjadi nilai huruf
  public static String konversiNilai(double nilai) {
    if (nilai > 80 && nilai <= 100) {
      return "A";
    } else if (nilai > 73 && nilai <= 80) {
      return "B+";
    } else if (nilai > 65 && nilai <= 73) {
      return "B";
    } else if (nilai > 60 && nilai <= 65) {
      return "C+";
    } else if (nilai > 50 && nilai <= 60) {
      return "C";
    } else if (nilai > 39 && nilai <= 50) {
      return "D";
    } else {
      return "E";
    }
  }

  public static void main(String[] args) {
    //deklarasi scanner untuk user 
    Scanner input = new Scanner(System.in);
    // untuk menjadikan desimal 2 angka dibelakang koma
    DecimalFormat df = new DecimalFormat("#.00");

    //input dari user
    System.out.println("=== INPUT DATA MAHASISWA ===");
    System.out.print("Nama : ");
    String nama = input.nextLine();
    System.out.print("NIM : ");
    String NIM = input.nextLine();

    System.out.print("\n");

    System.out.println("--- Mata kuliah 1: Algoritma dan Pemrograman ---");
    System.out.print("Nilai UTS : ");
    int nilaiUTSMatkul1 = input.nextInt();
    System.out.print("Nilai UAS : ");
    int nilaiUASMatkul1 = input.nextInt();
    System.out.print("Nilai Tugas : ");
    int nilaiTugasMatkul1 = input.nextInt();

    System.out.print("\n");

    System.out.println("--- Mata kuliah 2: Struktur Data ---");
    System.out.print("Nilai UTS : ");
    int nilaiUTSMatkul2 = input.nextInt();
    System.out.print("Nilai UAS : ");
    int nilaiUASMatkul2 = input.nextInt();
    System.out.print("Nilai Tugas : ");
    int nilaiTugasMatkul2 = input.nextInt();

    System.out.print("\n");

    //menghitung nilai akhir
    double nAkhirMatkul1 = (nilaiUTSMatkul1 * 0.3) + (nilaiUASMatkul1 * 0.4) + (nilaiTugasMatkul1 * 0.3);
    double nAkhirMatkul2 = (nilaiUTSMatkul2 * 0.3) + (nilaiUASMatkul2 * 0.4) + (nilaiTugasMatkul2 * 0.3);

    String statusM1;
    String statusM2;
    //cek status lulus
    if (nAkhirMatkul1 >= 60) {
      statusM1 = "Lulus";
    } else {
      statusM1 = "Tidak Lulus";
    }

    if (nAkhirMatkul2 >= 60) {
      statusM2 = "Lulus";
    } else {
      statusM2 = "Tidak Lulus";
    }
    //menghitung nilai rata rata akhir
    double nilaiRataAkhir = (nAkhirMatkul1 + nAkhirMatkul2) / 2;
    //jika keduanya berstatus lulus
    String statusAkhir;
    if (statusM1.equalsIgnoreCase("Lulus") && statusM2.equalsIgnoreCase("Lulus")) {
      if (nilaiRataAkhir >= 70) {
        statusAkhir = "Lulus";
      } else {
        statusAkhir = "Tidak Lulus (Rata-rata < 70)";
      }
    } else {
      statusAkhir = "Tidak Lulus";
    }
    //konversi menjadi nilai huruf dengan memanggil konversi nilai
    String nilaiHuruf1 = konversiNilai(nAkhirMatkul1);
    String nilaiHuruf2 = konversiNilai(nAkhirMatkul2);

    System.out.println("=============== HASIL PENIALAIAN AKADEMIK ===============");
    System.out.println("Nama \t\t: " + nama);
    System.out.println("NIM  \t\t: " + NIM);

    System.out.println("---------------------------------------");
    //output
    System.out.println("Mata kuliah 1 \t: Algoritma dan Pemrograman");
    System.out.println("Nilai Akhir   \t: " + df.format(nAkhirMatkul1));
    System.out.println("Nilai Huruf \t: " + nilaiHuruf1);
    System.out.println("Status \t\t: " + statusM1);
    System.out.println("---------------");
    System.out.println("Mata Kuliah 2 \t: Struktur Data");
    System.out.println("Nilai Akhir   \t: " + df.format(nAkhirMatkul2));
    System.out.println("Nilai Huruf \t: " + nilaiHuruf2);
    System.out.println("Status \t\t: " + statusM2);
    System.out.println("---------------------------------------");

    System.out.println("Nilai Rata-rata Akhir \t: " + df.format(nilaiRataAkhir));
    System.out.println("Status Akhir \t\t: " + statusAkhir);

  }
}