
package pertemuan703;

/**
 *
 * @author Ardina Jandrilia
 * TGL: 8 MEI 2025
 */
public class segiTiga {
    private int alas, tinggi;
    private int luas;
    
    public void hitungLuas() {
        this.luas = this.alas*this.tinggi/2;
        
    }
    
    public void setAlas(int nilai){
        this.alas = nilai;
        
    }
    public void setTinggi(int nilai){
        this.tinggi = nilai;
    }
    public void cetakLuas(){
        System.out.printf("Luas Segitiga dengan nilai alas= %d dan Tinggi= %d adalah %.2f",this.alas,this.tinggi, this.luas);
        
    }
}
