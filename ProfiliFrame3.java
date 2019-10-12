/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class Argjenda  implements RoliInterface{
    
    private String emri;
    private String mbiemri;
    private int vitiLindjes = 1995;
    private int id=181944122;
    private char gjinia='F';

    public Argjenda() {
        emri = new String("Argjenda");
        mbiemri = new String("Dervisholli");
        this.id=id;
        this.vitiLindjes = vitiLindjes;
        this.gjinia=gjinia;
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

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    @Override
    public String toString() {
        return "Emri: " + emri + "\nMbiemri: " + mbiemri + "\nViti i Lindjes: " + vitiLindjes + "\nMosha: " + id+"\nGjinia: "+gjinia;
    }
    
    public String VString() {
        return ""+vitiLindjes;
    }
    
    public String IString() {
        return ""+id;
    }
    
    public String GString() {
        return ""+gjinia;
    }

    @Override
    public String roli() {
        return "Student / e";
    }
    
    


}



public class ProfiliFrame3 extends JFrame {

    private JLabel labelaE,labelaM,labelaV,labelaA,labelaG,labelaR,labelaP;
    private JTextField fushaE,fushaM,fushaV,fushaA,fushaG,fushaR;
    private JPanel paneli,paneliAnash,paneliNaltEPosht,paneliIcon;
    
    Argjenda a=new Argjenda();
    Korniza k = new Korniza();

    public ProfiliFrame3() {
        setTitle("Welcome to your profile");
        labelaE = new JLabel("Emri: ");
        labelaM = new JLabel("Mbiemri: ");
        labelaV = new JLabel("Viti i Lindjes: ");
        labelaA = new JLabel("Numri i ID: ");
        labelaG = new JLabel("Gjinia: ");
        labelaR = new JLabel("Roli: ");
        labelaP = new JLabel("Profili im");
        Font f = new Font("Calibri", Font.BOLD, 20);
        labelaP.setFont(f);
        Icon ikona = new ImageIcon("njeri.png");
        Icon ikona2 = new ImageIcon("ticklogo.png");
        fushaE = new JTextField(a.getEmri(), 15);
        fushaM = new JTextField(a.getMbiemri(), 15);
        fushaV = new JTextField(a.VString());
        fushaA = new JTextField(a.IString());
        fushaG = new JTextField(a.GString());
        fushaR = new JTextField(a.roli());
        JButton close=new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pergjigja = JOptionPane.showConfirmDialog(ProfiliFrame3.this, "A jeni i sigurte?");

                if (pergjigja == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        close.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getSource()==close){
                   if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                       int pergjigja=JOptionPane.showConfirmDialog(ProfiliFrame3.this, "A jeni i Sigurte?");
                       
                       if(pergjigja==JOptionPane.YES_OPTION){
                          System.exit(0);
                       }
                   }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        JLabel labelaIcon = new JLabel(ikona);
        JLabel labelaIcon2=new JLabel(ikona2);
        paneliIcon=new JPanel();
        paneliIcon.setLayout(new FlowLayout(FlowLayout.RIGHT));
        paneliAnash = new JPanel();
        paneliNaltEPosht = new JPanel();
        paneliNaltEPosht.setLayout(new GridLayout(6, 6));
        paneli = new JPanel(new BorderLayout());
        paneliAnash.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneliAnash.add(labelaIcon);
        paneliAnash.add(labelaP);
        paneliAnash.add(labelaIcon2);
        
        
        paneliNaltEPosht.add(labelaE);
        paneliNaltEPosht.add(fushaE);
        paneliNaltEPosht.add(labelaM);
        paneliNaltEPosht.add(fushaM);
        paneliNaltEPosht.add(labelaA);
        paneliNaltEPosht.add(fushaA);
        paneliNaltEPosht.add(labelaV);
        paneliNaltEPosht.add(fushaV);
        paneliNaltEPosht.add(labelaG);
        paneliNaltEPosht.add(fushaG);
        paneliNaltEPosht.add(labelaR);
        paneliNaltEPosht.add(fushaR);
        paneliNaltEPosht.setBorder(BorderFactory.createTitledBorder("Te dhenat"));
        BorderFactory.createLineBorder(Color.RED);
        
        paneliIcon.add(close);
        
        paneli.add(paneliAnash, BorderLayout.PAGE_START);
        paneli.add(paneliNaltEPosht, BorderLayout.AFTER_LINE_ENDS);
        paneli.add(paneliIcon,BorderLayout.PAGE_END);

        getContentPane().add(paneli);
        setVisible(true);
        setSize(350, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

    }
}
