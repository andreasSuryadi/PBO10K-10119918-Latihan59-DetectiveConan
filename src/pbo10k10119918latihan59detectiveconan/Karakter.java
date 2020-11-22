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
public class Karakter {
    private String nama, ciriKhas, gender;
    
    public Karakter(String nama, String ciriKhas, String gender) {
        this.nama = nama;
        this.ciriKhas = ciriKhas;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }

    public String getGender() {
        return gender;
    }
    
    public void tampilKeterangan() {
        System.out.println("Keterangan Karakter");
    }
}
