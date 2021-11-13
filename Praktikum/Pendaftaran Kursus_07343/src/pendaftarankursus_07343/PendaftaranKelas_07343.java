package pendaftarankursus_07343;

import java.util.Date;
import java.util.Scanner;

public class PendaftaranKelas_07343 {

 private static Scanner input = new Scanner(System.in);
 private static PendaftaKelasEntity_07343[] pendaftarEntity = new PendaftaKelasEntity_07343[100];
 private static PegawaiEntity_07343[] pegawaiEntity = new PegawaiEntity_07343[100];
 private static PendaftarTerdaftarEntity_07343[] terdaftarEntity = new PendaftarTerdaftarEntity_07343[100];
 private static int pilKelas;
 private static int jumPendaftar = 0;
 private static int cekPegawai;
 
    public static void main(String[]args){
     dataPegawai();
     int pil;
     do{
        System.out.println("Julah Peserta : "+jumPendaftar);
           System.out.println("1. Login Pegawai");
           System.out.println("2. Lihat Pendaftar Terdaftar");
           System.out.println("3. Biodata Pegawai");
           System.out.println("0. Log Out");
           System.out.print("Pilih Menu : ");
           pil = input.nextInt();
           switch (pil){
               case 1:
                   loginPegawai();
                   break;
               case 2:
                   viewPendaftar();
                   break;
               case 3:
                   viewPegawai();
                    break;
           }
     }while (pil !=0);
 }
 static int dataPegawai(){
     String namaPegawai[] = {"Rudi", "Slamet", "Angga", "Babon", "Rahmad",};
     String passPegawai[] = {"001", "002", "003", "004", "005"};
     String noTelpPegawai[] = {"091", "092", "093i", "094", "095"};
     String alamatPegawai[] = {"Jl", "Jl", "Jl", "Jl", "Jl"};
     for (int i = 0; i < namaPegawai.length; i++){
         pegawaiEntity[i] = new PegawaiEntity_07343(passPegawai[i], namaPegawai[i], noTelpPegawai[i],
                 alamatPegawai[i]);
     }
     return namaPegawai.length;
 }
 
    static void loginPegawai(){
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
        System.out.print("NoTelp : ");
        String noTelp = input.next();
        cekPegawai = login(nama, password, noTelp);
        System.out.println("Selamat Datang " + pegawaiEntity[cekPegawai].getNama_07343());
        int pil;
        do{
            System.out.println("Jumlah Peserta : " + jumPendaftar);
            System.out.println("1. Daftarkan Pendaftar ");
            System.out.println("2. Ubah Data Pendaftar ");
            System.out.println("3. Lihat Pendaftar Terdaftar ");
            System.out.println("4. Hapus Pendaftar");
            System.out.println("0. Log Out");
            System.out.print("Pilih Menu : ");
            pil = input.nextInt();
            switch (pil){
                case 1:
                    insertPendaftar();
                    break;
                case 2:
                    updatePendaftar();    
                    break;
                case 3:
                    viewPendaftar();
                    break;
                case 4:
                    deletePendaftar();
                    break;
            }
        }while (pil !=0);
    }
    static int login(String nama, String password, String noTelp){
        int loop = 0;
        for (int i = 0; i <= dataPegawai(); i++){
        if (pegawaiEntity[i].getNama_07343().equals(nama) && pegawaiEntity[i].getpassword_07343().equals(password)
            && pegawaiEntity[i].getNoTelp_07343().equals(noTelp)){
            break;
        }else{
            loop++;
        }
    }
        return loop;
    }
    static void insertPendaftar(){
        System.out.print("Input Nama : ");
        String nama = input.next();
        System.out.print("Input Umur : ");
        String umur = input.next();
        System.out.print("Input Alamt : ");
        String alamat = input.next();
        System.out.print("Input NoTelp: ");
        String noTelp = input.next();
        
       pendaftarEntity[jumPendaftar] = new PendaftaKelasEntity_07343(umur, nama, noTelp, alamat);
       insertKelas();
    }
    static void insertKelas(){
        System.out.println("Kelas : ");
        for (int i = 0; i < KelasEntity_07343.kelas.length; i++){
            System.out.println(i + ". " + KelasEntity_07343.kelas[i]);
        }
        System.out.print("Pilih Kelas : ");
        pilKelas = input.nextInt();
        System.out.print("Masukan Kode Pendaftar : ");
        String kodePendaftar = input.next();
        terdaftarEntity[jumPendaftar] = new PendaftarTerdaftarEntity_07343(pendaftarEntity[jumPendaftar], pilKelas,
        kodePendaftar);
        jumPendaftar = jumPendaftar + 1;
    }
    static void updatePendaftar(){
        System.out.print("Masukan Kode Pendaftar yang di Rubah : ");
        String search = input.next();
        int cari = 0;
        do{
            if (cari == jumPendaftar){
                System.out.println("Tidak Ada Data");
                break;
            }else if (terdaftarEntity[cari].getKodePendaftar().equals(search)){
                int pilEdit;
                do{
                  System.out.println("Pilih Data Yang ingin Diubah : ");
                  System.out.println("1. Lihat Biodata : ");
                  System.out.println("2. Nama");
                  System.out.println("3. Alamat");
                  System.out.println("4. NoTelp");
                  System.out.println("5. Umur");
                  System.out.println("6. Lomba");
                  System.out.println("0. Exit");
                  pilEdit = input.nextInt();
                  input.nextLine();
                  if (pilEdit == 1){
                      System.out.println("===================================");
                      System.out.println("Kode Peserta : " + terdaftarEntity[cari].getKodePendaftar());
                      System.out.println("===================================");
                      System.out.println("Nama : " + pendaftarEntity[cari].getNama_07343()
                              + "\n Umur : " + pendaftarEntity[cari].getumur_07343()
                              + "\n Alamat : " + pendaftarEntity[cari].getAlamat_07343()
                              + "\n NoTelp : " + pendaftarEntity[cari].getNoTelp_07343()
                              + "\n Lomba : " + KelasEntity_07343.kelas[terdaftarEntity[cari].getIndexKelas()]);
                      System.out.println("===================================");
                  }else if (pilEdit == 2){
                 System.out.print("Ubah Nama : ");
                      String editNama = input.nextLine();
                      pendaftarEntity[cari].setNama_07343(editNama);
                  }else if (pilEdit == 3){
                      System.out.print("Ubah Alamat : ");
                      String editAlamat = input.nextLine();
                      pendaftarEntity[cari].setalamat_07343(editAlamat);
                  }else if (pilEdit == 4){
                      System.out.print("Ubah No, Telp : ");
                      String editNoTelp = input.nextLine();
                      pendaftarEntity[cari].setNoTelp_07343(editNoTelp);
                  }else if (pilEdit == 5){
                      System.out.print("Ubah Umur : ");
                      String editUmur = input.nextLine();
                      pendaftarEntity[cari].setUmur_07343(editUmur);
                  }else if (pilEdit == 6){
                      System.out.println("Pilih Kelas");
                      for (int i = 0; i < KelasEntity_07343.kelas.length; i++){
                          System.out.println(i + ". " + KelasEntity_07343.kelas[i]);
                      }
                          int editKelas = input.nextInt();
                          terdaftarEntity[cari].setIndexKelas(editKelas);
                      }
                  }while (pilEdit !=0);
                break;
            }else{
                cari = cari +1;
            }
        }while (true);
    }
    static void viewPendaftar(){
        if (jumPendaftar == 0){
            System.out.println("Belum Ada Pendaftar Terdaftar");
        }else{
            for (int i = 0; i < jumPendaftar; i++){
                System.out.println("=========================================");
                System.out.println("kode Peserta : " + terdaftarEntity[i].getKodePendaftar());
                System.out.println("=========================================");
                System.out.println("Nama : " + pendaftarEntity[i].getNama_07343()
                        + "\n Umur : " + pendaftarEntity[i].getumur_07343()
                        + "\n Alamat : " + pendaftarEntity[i].getAlamat_07343()
                        + "\n No. Telp : " + pendaftarEntity[i].getNoTelp_07343()
                        + "\n Lomba : " + KelasEntity_07343.kelas[terdaftarEntity[i].getIndexKelas()]);
                System.out.println("=========================================");
            }
        }
    }
    static void viewPegawai(){
        for (int i = 0; i < dataPegawai(); i++){
            System.out.println("=============================================");
            System.out.println("Nama : " + pegawaiEntity[i].getNama_07343()
                    + "\n No. Telp : " + pegawaiEntity[i].getAlamat_07343()
                    + "\n Alamat : " + pegawaiEntity[i].getAlamat_07343());
            System.out.println("=============================================");
        }
    }
     static void deletePendaftar(){
        System.out.print("Masukan Kode Peserta yang Akan di HAPUS : ");
        String search = input.next();
        input.nextLine();
        int cari = 0;
        do{
            if (cari == jumPendaftar){
                System.out.println("Tidak Ada Data!");
                break;
            }else if (terdaftarEntity[cari].getKodePendaftar().equals(search)){
                if (cari == jumPendaftar - 1){
                    jumPendaftar = jumPendaftar - 1;
                }else{
                    for (int i = cari; i < jumPendaftar; i++){
                        terdaftarEntity[i] = terdaftarEntity[i + 1];
                        pendaftarEntity[i] = pendaftarEntity[i + 1];
                    }
                    jumPendaftar = jumPendaftar - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        }while (true);
    }
}