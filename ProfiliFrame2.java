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

class Profa implements RoliInterface {

    private String emri;
    private String mbiemri;
    private int vitiLindjes = 1984;
    private int mosha = 2019 - vitiLindjes;
    private char gjinia = 'M';

    public Profa() {
        emri = new String("Berat");
        mbiemri = new String("Perquku");
        this.vitiLindjes = vitiLindjes;
        this.mosha = mosha;
        this.gjinia = gjinia;
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

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

   

    public String VString() {
        return "" + vitiLindjes;
    }

    public String MString() {
        return "" + mosha;
    }

    public String GString() {
        return "" + gjinia;
    }

    @Override
    public String roli() {
        return "Profesor";
    }

}





public class ProfiliFrame2 extends JFrame {

   private JLabel labelaE,labelaM,labelaV,labelaA,labelaG,labelaR,labelaP;
    private JTextField fushaE,fushaM,fushaV,fushaA,fushaG,fushaR;
    private JPanel paneli,paneliAnash,paneliNaltEPosht,paneliIcon;

    Profa p = new Profa();
    Korniza k = new Korniza();

    public ProfiliFrame2() {
        setTitle("Welcome to your profile");
        labelaE = new JLabel("Emri: ");
        labelaM = new JLabel("Mbiemri: ");
        labelaV = new JLabel("Viti i Lindjes: ");
        labelaA = new JLabel("Mosha: ");
        labelaG = new JLabel("Gjinia: ");
        labelaR = new JLabel("Roli: ");
        labelaP = new JLabel("Profili im");
        Font f = new Font("Calibri", Font.BOLD, 20);
        labelaP.setFont(f);
        Icon ikona = new ImageIcon("njeri.png");
        Icon ikona2 = new ImageIcon("ticklogo.png");
        fushaE = new JTextField(p.getEmri(), 15);
        fushaM = new JTextField(p.getMbiemri(), 15);
        fushaV = new JTextField(p.VString());
        fushaA = new JTextField(p.MString());
        fushaG = new JTextField(p.GString());
        fushaR = new JTextField(p.roli());
        JButton close=new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pergjigja = JOptionPane.showConfirmDialog(ProfiliFrame2.this, "A jeni i sigurte?");

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
                       int pergjigja=JOptionPane.showConfirmDialog(ProfiliFrame2.this, "A jeni i Sigurte?");
                       
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
        
        paneliIcon.add(close);
        paneliNaltEPosht.add(labelaE);
        paneliNaltEPosht.add(fushaE);
        paneliNaltEPosht.add(labelaM);
        paneliNaltEPosht.add(fushaM);
        paneliNaltEPosht.add(labelaV);
        paneliNaltEPosht.add(fushaV);
        paneliNaltEPosht.add(labelaA);
        paneliNaltEPosht.add(fushaA);
        paneliNaltEPosht.add(labelaG);
        paneliNaltEPosht.add(fushaG);
        paneliNaltEPosht.add(labelaR);
        paneliNaltEPosht.add(fushaR);
        paneliNaltEPosht.setBorder(BorderFactory.createTitledBorder("Te dhenat"));
        BorderFactory.createLineBorder(Color.RED);
        
        
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
