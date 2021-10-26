package praktikum1;

import java.util.Scanner;

public class PROGRAMDISKON_07343 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Data : ");
        int n_07343=input.nextInt();
        
        String nama_07343[]=new String[n_07343];
        int harga_07343[]=new int[n_07343];
        int jumlah_07343[]=new int[n_07343];
        int total_07343[]=new int[n_07343];
        int potongan1_07343,potongan2_07343,potongan3_07343;
        
        System.out.println("### Warung MEKDI ###");
        System.out.println("##########INPUT##########");
        
        System.out.println("================");
        for (int i_07343=0;i_07343<n_07343;i_07343++){
        System.out.println("Braang Ke : "+(i_07343+1));
        System.out.print("Masukkan nama Barang : ");
        nama_07343[i_07343]=input.next();
         
        System.out.print("Masukkan Harga Brang : Rp. ");
        harga_07343[i_07343] = input.nextInt();
        System.out.print("Jumlah Barang : ");
        jumlah_07343[i_07343] = input.nextInt();
        total_07343[i_07343] = harga_07343[i_07343]*jumlah_07343[i_07343];
       } 
         
    System.out.println("##########OUTPUT##########");
    for (int i_07343=0; i_07343<n_07343;i_07343++){
    System.out.println("Braang Ke : "+(i_07343+1));
    System.out.println("Nama Barang : " + nama_07343[i_07343]);
    System.out.println("Harga Barang : " + harga_07343[i_07343]);
    System.out.println("Jumlah Barang : " + jumlah_07343[i_07343]);
    System.out.println("Total Bayar : Rp."+ total_07343[i_07343]);
    potongan1_07343 = (total_07343[i_07343] - ((total_07343[i_07343]*20)/100));
    potongan2_07343 = (total_07343[i_07343] - ((total_07343[i_07343]*25)/100));
    potongan3_07343 = (total_07343[i_07343] - ((total_07343[i_07343]*40)/100));
    if(total_07343[i_07343] >= 500000){
        System.out.println("Total Bayar (Diskon 40%) : Rp.  "+ potongan3_07343);
    }else if(total_07343[i_07343] >= 350000){
        System.out.println("Total Bayar (Diskon 25%) : Rp.  "+ potongan2_07343);
    }else if(total_07343[i_07343] >= 200000){
        System.out.println("Total Bayar (Diskon 20%) : Rp.  "+ potongan1_07343);
    }
    }   
   
            }
        }