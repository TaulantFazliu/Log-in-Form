/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

/**
 *
 * @author taula
 */
public class Profesor {
    private int numriRendor;
    private String emri;
    private String mbiemri;
    
    public Profesor(int nrR,String e,String m){
       numriRendor=nrR;
       emri=e;
       mbiemri=m;
    }

    public int getNumriRendor() {
        return numriRendor;
    }

    public void setNumriRendor(int numriRendor) {
        this.numriRendor = numriRendor;
    }
    
    

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }
    
}
