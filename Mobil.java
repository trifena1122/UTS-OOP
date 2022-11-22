/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mobil;

/**
 *
 * @author Trfena
 */
public class Mobil {
String merek;
String Warna;
String TahunKeluar;
String BK;
    public static void main(String[] args) {
        Mobil mobilsaya= new Mobil ();
        mobilsaya. merek= " Pajero Sport ";
        mobilsaya.Warna= " Silver ";
        mobilsaya.TahunKeluar=" 2021 ";
        mobilsaya.BK=" 21090093 TRF";
        
        System.out.println( "merek" + mobilsaya.merek);
        System.out.println( "Warna" + mobilsaya.Warna);
        System.out.println( "TahunKeluar" + mobilsaya.TahunKeluar);
        System.out.println( "BK" + mobilsaya.BK);
        
    }
}
    }
}
