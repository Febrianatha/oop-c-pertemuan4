package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author Fabrianatha
 * TGL: 12 April 2025
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA[0]="jake";
        NMA[1]="jay";
        NMA[2]="Sunghoon";
        NMA[3]="Jungwon";
        NMA[4]="Sunoo";
       
        Scanner inp = new Scanner(System.in);
        System.out.println("~~~~~Input Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ){
            System.out.printf("Data Nama Pengunjung ke-%d: ", idx+1);
             NMA[idx] = inp.nextLine();
             
        }
        System.out.println("~~~~~Output Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+NMA[idx]);    
        }
        
        //forcech
        System.out.println("~~~~~Output2 Data Ke Array~~~~~");
        int no=1;
        for(String isi : NMA){
            System.out.println(no+". "+isi);
            no++;
        }     
    }
    
}
