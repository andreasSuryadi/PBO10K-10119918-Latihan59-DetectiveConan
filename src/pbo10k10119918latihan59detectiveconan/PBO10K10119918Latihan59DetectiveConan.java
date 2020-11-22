/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan59detectiveconan;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari serial
 * anime detective conan
 * 
 */

public class PBO10K10119918Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShinichiKudo shinichiKudo = new ShinichiKudo("Shinichi Kudo", 
                "Ucapan khas 'Ah-re-re?!'", "Laki-laki", "Jimmy Kudo", 
                "Minami Takayama", "Kappei Yamaguchi");
        System.out.println("Nama \t\t\t : " + shinichiKudo.getNama());
        System.out.println("Ciri Khas \t\t : " + shinichiKudo.getCiriKhas());
        System.out.println("Gender \t\t\t : " + shinichiKudo.getGender());
        System.out.println("Nama Versi Inggris \t : " + shinichiKudo.getNamaVersiInggris());
        System.out.println("Pengisi Suara (Conan) \t : " + shinichiKudo.getPengisiSuaraConan());
        System.out.println("Pengisi Suara (Shinichi) : " + shinichiKudo.getPengisiSuaraShinichi());
        System.out.println("Keterangan karakter \t : ");
        shinichiKudo.tampilKeterangan();
        
        System.out.println();
        
        RanMouri ranMouri = new RanMouri("Ran Mouri", 
                "Ahli karate namun takut hantu", "Perempuan", "Rachel Moore", 
                "Wakana Yamazaki");
        System.out.println("Nama \t\t\t : " + ranMouri.getNama());
        System.out.println("Ciri Khas \t\t : " + ranMouri.getCiriKhas());
        System.out.println("Gender \t\t\t : " + ranMouri.getGender());
        System.out.println("Nama Versi Inggris \t : " + ranMouri.getNamaVersiInggris());
        System.out.println("Pengisi Suara \t\t : " + ranMouri.getPengisiSuara());
        System.out.println("Keterangan karakter \t : ");
        ranMouri.tampilKeterangan();
        
        System.out.println();
        
        KogoroMouri kogoroMouri = new KogoroMouri("Kogoro Mouri", 
                "Sebutan Kogoro Tidur", "Laki-laki", "Richard Moore", 
                "Akira Kamiya & Rkiya Koyama");
        System.out.println("Nama \t\t\t : " + kogoroMouri.getNama());
        System.out.println("Ciri Khas \t\t : " + kogoroMouri.getCiriKhas());
        System.out.println("Gender \t\t\t : " + kogoroMouri.getGender());
        System.out.println("Nama Versi Inggris \t : " + kogoroMouri.getNamaVersiInggris());
        System.out.println("Pengisi Suara \t\t : " + kogoroMouri.getPengisiSuara());
        System.out.println("Keterangan karakter \t : ");
        kogoroMouri.tampilKeterangan();
    }
    
}
