/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;
import Tabelat.ProfesorTabel;
import Tabelat.Studenti;
import Tabelat.StudentiTabela;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class TabelaStudentav extends JFrame {
    private int currentRecord;
    private JButton shtobuton;
    private JTable tblStudents;
    private JTable tbl2;
    private JPanel pnlComponents;
    private ArrayList<Studenti>studList;
    private ArrayList<Profesor>profat;
    private JScrollPane scrollPane;
    private JScrollPane scrPane;
    

    public TabelaStudentav() {
        super("Lista e Profesorve dhe Studentve");
        ArrayList<Studenti> studList = new ArrayList<>();
        studList.add(new Studenti(1, "Taulant", "Fazliu"));
        studList.add(new Studenti(2, "Argjenda", "Dervisholli"));
        studList.add(new Studenti(3, "Leart", "Berisha"));
        studList.add(new Studenti(4, "Njomza", "Ismaili"));
        
        
        StudentiTabela model = new StudentiTabela(studList);
        JTable tblStudents = new JTable(model);
        JPanel pnlComponents = new JPanel();
        pnlComponents.setLayout(new BoxLayout(pnlComponents, BoxLayout.Y_AXIS));
        
        
        JScrollPane scrollPane = new JScrollPane(tblStudents);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Studentet"));
        BorderFactory.createLineBorder(Color.BLACK);
        tblStudents.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        ArrayList<Profesor>profat=new ArrayList<>();
        profat.add(new Profesor(1, "Berat","Perquku"));
        profat.add(new Profesor(2, "Granit","Berisha"));
        ProfesorTabel model1=new ProfesorTabel(profat);
        JTable tbl2=new JTable(model1);
        JScrollPane scrPane=new JScrollPane(tbl2);
        scrPane.setBorder(BorderFactory.createTitledBorder("Profesoret"));
        BorderFactory.createLineBorder(Color.BLACK);
        tbl2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        JPanel bottom=new JPanel();
        shtobuton=new JButton("Hap profilin");
        ActionListener a=new ProfiliListener();
        shtobuton.addActionListener(a);
//        shtobuton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Studenti st1=new Studenti(++currentRecord,"Taulant "+currentRecord,"Fazliu "+currentRecord);
//                model.addRow(st1);
//            }
//        });
        bottom.add(shtobuton);
        JButton largo=new JButton("Mbyll Faqen");
        largo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pergjigja = JOptionPane.showConfirmDialog(TabelaStudentav.this, "A jeni i sigurte?");

                if (pergjigja == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
       
       bottom.add(largo);
       
        
        
        
        pnlComponents.add(scrollPane, BorderLayout.NORTH);
        pnlComponents.add(scrPane,BorderLayout.CENTER);
        
        getContentPane().add(pnlComponents);
        getContentPane().add(bottom,BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    class ProfiliListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==shtobuton){
                try{
               switch(tblStudents.getSelectedRow()){
                   case 0:
                       ProfiliFrame1 pf = new ProfiliFrame1();
                                pf.setVisible(true);
                                break;
                   case 1:
                       ProfiliFrame3 pf3 = new ProfiliFrame3();
                                pf3.setVisible(true);
                                break;
                   case 2:
                       ProfiliFrame4 pf4 = new ProfiliFrame4();
                                pf4.setVisible(true);
                                break;
                   case 3:
                       ProfiliFrame5 pf5 = new ProfiliFrame5();
                                pf5.setVisible(true);
                                break;
               }
                }catch(NullPointerException ei){
                ei.printStackTrace();
                }
               switch(tbl2.getSelectedRow()){
                   case 0:
                        ProfiliFrame2 pf2 = new ProfiliFrame2();
                                pf2.setVisible(true);
                                break;
                   case 1:
                       ProfiliFrame6 pf6 = new ProfiliFrame6();
                                pf6.setVisible(true);
                                break;
               }
               
            }
        }
       
    }

    public static void main(String args[]) {
        new TabelaStudentav();
    }
}