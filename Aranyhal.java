package main;
import java.util.ArrayList;

public class Aranyhal {
    
    private static int KIVANSAGOSZAMA = 3;
    private int kor;
//    private ArrayList<Kivansag> kivansagok;
    private String kifogta;

//    public static void main(String[] args) {
//        
//    }
    
    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public Aranyhal(String kifogta, int kor) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta){
        
        return 0;
    }
    
    public String[] kikkelTalalkozott(){
        
        return null;
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + /*kivansagok +*/ ", kifogta=" + kifogta + '}';
    }
    
    
}
