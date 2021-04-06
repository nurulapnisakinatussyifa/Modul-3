
package tugas3;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
    System.out.println("***** SEQUENTIAL SEARCH *****"+"\n" );
       String data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nurul Apni","Tesla"};
       String key;
       
       //fitur scanner
       Scanner scan = new Scanner(System.in);
       System.out.print("masukkan data yang dicari: ");
       key = scan.nextLine();
       
       //menampilkan data array
       System.out.print("isi data adalah: ");
       for (int i = 0; i < data.length; i++) {
           
           System.out.print(data[i] + " ");
       }
       System.out.println("");
       
       for (int i = 0; i <= data.length; i++) {
           if (key.equalsIgnoreCase(data[i])) {
               System.out.print("data "+key+" berada pada index ke - " + i);
               break; //stop perulangan
           }
       }
       System.out.println("\n");
       System.out.println();
       System.out.println(" ***** Terima Kasih ***** ");
       System.out.println("NURUL APNI SAKINATUS SYIFA");
       
    
        
    }
    } 
    

