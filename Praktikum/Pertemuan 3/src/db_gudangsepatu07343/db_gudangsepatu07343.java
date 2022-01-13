package db_gudangsepatu07343;
import Controller.GudangController;
import java.util.Scanner;

public class db_gudangsepatu07343 {
    
    static Scanner input = new Scanner (System.in);
    static GudangController gudang = new GudangController();
    public static void main(String[] args) throws Exception {    
    gudang.Singkrone();
    int pil;
    do{
        System.out.println("1. Input  data sepatu     ");
        System.out.println("2. View   data sepatu     ");
        System.out.println("3. Update data sepatu     ");
        System.out.println("4. Delete data sepatu     ");
        System.out.println("5. Exit                   ");
        System.out.print("Masukkan pilihan : ");
        pil = input.nextInt();
        
        switch(pil){
            case 1 : {
                System.out.println("Create");
                Create();
                break;
            }
            case 2 : {
                System.out.println("Read");
                Read();
                break;
            }
            case 3 : {
                System.out.println("Update");
                Update();
                break;
            }
            case 4 : {
                System.out.println("Delete");
                Delete();
                break;
            }
        }
    }while (pil != 5);
}

        static void Create(){
            System.out.print("Id : ");
            String id = input.next();
            System.out.print("Merek : ");
            String merek = input.next();
            System.out.print("Size : ");
            String size = input.next();
            System.out.print("warna : ");
            String warna = input.next();
            gudang.insert(id, merek, size, warna);
        }
        
        static void Read(){
            gudang.display();
        }
        
        static void Update(){
            System.out.print("Input id yang ingin dirubah : ");
            String id = input.next();
            System.out.print("Merek : ");
            String merek = input.next();
            System.out.print("Size : ");
            String size = input.next();
            System.out.print("warna : ");
            String warna = input.next();
            gudang.update(id, merek, size, warna);
        }
        
        static void Delete(){
            System.out.print("Input id yang ingin dihapus : ");
            String id = input.next();
            gudang.delete(id);
        }
}
