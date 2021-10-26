package praktikum1;

import java.util.Scanner;

public class PROGRAMDISKON_07343 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        do{
        System.out.print("Masukan Jumlah Data : ");
        int n=input.nextInt();
        
        String nama[]=new String[n];
        int harga[]=new int[n];
        int jumlah[]=new int[n];
        int total[]=new int[n];
        int potongan1,potongan2,potongan3;
        int pilih;
        
        System.out.println("### Warung MEKDI ###");
        System.out.println("##########INPUT##########");
        
        System.out.println("1. Masukan data : ");
        System.out.println("2. Keluar ");
        pilih = input.nextInt();
        
        System.out.println("================");
        switch(pilih){
            case 1:
        for (int i=0;i<n;i++){
        System.out.println("Braang Ke : "+(i+1));
        System.out.print("Masukkan nama Barang : ");
        nama[i]=input.next();
         
        System.out.print("Masukkan Harga Brang : Rp. ");
        harga[i] = input.nextInt();
        System.out.print("Jumlah Barang : ");
        jumlah[i] = input.nextInt();
        total[i] = harga[i]*jumlah[i];
       } 
         
    System.out.println("##########OUTPUT##########");
    for (int i=0; i<n;i++){
    System.out.println("Braang Ke : "+(i+1));
    System.out.println("Nama Barang : " + nama[i]);
    System.out.println("Harga Barang : " + harga[i]);
    System.out.println("Jumlah Barang : " + jumlah[i]);
    System.out.println("Total Bayar : Rp."+ total[i]);
    potongan1 = (total[i] - ((total[i]*20)/100));
    potongan2 = (total[i] - ((total[i]*25)/100));
    potongan3 = (total[i] - ((total[i]*40)/100));
    if(total[i] >= 500000){
        System.out.println("Total Bayar (Diskon 40%) : Rp.  "+ potongan3);
    }else if(total[i] >= 350000){
        System.out.println("Total Bayar (Diskon 25%) : Rp.  "+ potongan2);
    }else if(total[i] >= 200000){
        System.out.println("Total Bayar (Diskon 20%) : Rp.  "+ potongan1);
    }
    }   
    break;
    
            case 2:
                System.exit(0);
                default:
                System.out.println("Keluar");
                break;
            }
        }while(true);
    }
}