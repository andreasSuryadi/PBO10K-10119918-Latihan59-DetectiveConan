/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan59detectiveconan;

/**
 *
 * @author andreas
 */
public class RanMouri extends Karakter {
    private String namaVersiInggris, pengisiSuara;
    
    public RanMouri(String nama, String ciriKhas, String gender, 
            String namaVersiInggris, String pengisiSuara) {
        super(nama, ciriKhas, gender);
        this.namaVersiInggris = namaVersiInggris;
        this.pengisiSuara = pengisiSuara;
    }

    public String getNamaVersiInggris() {
        return namaVersiInggris;
    }

    public String getPengisiSuara() {
        return pengisiSuara;
    }
    
    @Override
    public void tampilKeterangan() {
        System.out.println("Karakter ini merupakan seorang yang ahli dalam \n"
                + "karate dan juga merupakan teman masa kecil sekaligus cinta \n"
                + "pertama Shinichi Kudo");
    }
}
