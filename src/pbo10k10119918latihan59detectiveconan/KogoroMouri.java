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
public class KogoroMouri extends Karakter {
    private String namaVersiInggris, pengisiSuara;
    
    public KogoroMouri (String nama, String ciriKhas, String gender, 
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
        System.out.println("Karakter ini merupakan seorang detektif swasta yang \n"
                + "terkenal dengan sebutan Kogoro Tidur karena kebiasaannya \n"
                + "yang selalu tidur saat memecahkana kasus, meskipun yang \n"
                + "sebenarnya memecahkan kasusnya adalah Conan");
    }
}
