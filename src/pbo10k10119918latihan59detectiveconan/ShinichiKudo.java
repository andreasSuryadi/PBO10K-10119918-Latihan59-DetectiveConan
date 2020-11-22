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
public class ShinichiKudo extends Karakter {
    private String namaVersiInggris, pengisiSuaraConan, pengisiSuaraShinichi;
    
    public ShinichiKudo(String nama, String ciriKhas, String gender, 
            String namaVersiInggris, String pengisiSuaraConan, 
            String pengisiSuaraShinichi) {
        super(nama, ciriKhas, gender);
        this.namaVersiInggris = namaVersiInggris;
        this.pengisiSuaraConan = pengisiSuaraConan;
        this.pengisiSuaraShinichi = pengisiSuaraShinichi;
    }

    public String getNamaVersiInggris() {
        return namaVersiInggris;
    }

    public String getPengisiSuaraConan() {
        return pengisiSuaraConan;
    }

    public String getPengisiSuaraShinichi() {
        return pengisiSuaraShinichi;
    }

    @Override
    public void tampilKeterangan() {
        System.out.println("Karakter ini berubah jadi anak kelsa 1 SD karena \n"
                + "diberi minum racun saat sedang menjalankan misi sebagai \n"
                + "detektif");
    }
}
