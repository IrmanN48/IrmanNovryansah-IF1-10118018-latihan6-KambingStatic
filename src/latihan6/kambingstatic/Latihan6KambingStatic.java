/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.kambingstatic;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * KELAS    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program untuk menjadi konstanta atau subclass
 */
public class Latihan6KambingStatic {
    //Variable jumlahKambing dideklariasikan sebagai statik
    public static int jumlahKambing;
    
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Latihan6KambingStatic.jumlahKambing = 485000;
    System.out.println(NAMA_KAMBING +" memiliki kambing sebanyak  " +Latihan6KambingStatic.jumlahKambing);
        

    }
    
}
