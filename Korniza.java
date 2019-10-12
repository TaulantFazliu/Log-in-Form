/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogIn;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author taula
 */
public class Korniza extends JFrame {

    private JPanel paneli, top, botom;
    private JLabel labela1, labela2;
    private JTextField fusha1;
    private JPasswordField fusha2;
    private JButton butoni1, butoni2;
    protected JComboBox<String> cbRolet;

    public Korniza() {
        paneli = new JPanel();
        top = new JPanel();
        botom = new JPanel();
        labela1 = new JLabel("Username");
        labela2 = new JLabel("Password");
        fusha1 = new JTextField(15);
        ActionListener al = new LoginFrameListener();
        KeyListener kl = new EnterListener();
        fusha2 = new JPasswordField(15);
        fusha2.addKeyListener(kl);
        fusha1.addKeyListener(kl);
        butoni1 = new JButton("Kyqu");
        butoni1.addActionListener(al);
        

//        butoni1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (fusha1.getText().equals("Taulant") && fusha2.getText().equals("Taulantfaz123")) {
//                    JOptionPane.showMessageDialog(null, "Jeni Kyqur me sukses \n Emri i perdoruesit:  " + fusha1.getText());
//                } else {
//                    JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });
        butoni2 = new JButton("Cancel");
        butoni2.addActionListener(al);
//        butoni2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
        String[] rolet = {"Rektor", "Profesor", "Student / e"};
        cbRolet = new JComboBox<String>(rolet);
        paneli.setLayout(new BoxLayout(paneli, BoxLayout.Y_AXIS));
        top.add(labela1);
        top.add(fusha1);
        top.add(labela2);
        top.add(fusha2);
        botom.add(cbRolet);
        botom.add(butoni1);
        botom.add(butoni2);
        paneli.add(top);
        paneli.add(botom);
        getContentPane().add(paneli);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public JComboBox getCbRolet() {
        return cbRolet;
    }

    class LoginFrameListener implements ActionListener {

        Taulanti tf = new Taulanti();
        Profa p = new Profa();
        Argjenda a = new Argjenda();

        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == butoni1) {

                switch (fusha1.getText()) {
                    case " Burim":
                        if (fusha2.getText().equals("Tick")) {
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                TabelaStudentav tbl = new TabelaStudentav();
                                tbl.setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(null, "Nuk keni zgjedhur rolin e duhur", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Taulant":
                        if (fusha2.getText().equals("123")) {
//                            JOptionPane.showMessageDialog(null, tf.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Profesor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame1 pf = new ProfiliFrame1();
                                pf.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Berat":
                        if (fusha2.getText().equals("234")) {
//                            JOptionPane.showMessageDialog(null, p.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Student / e") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Student/e", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame2 pf2 = new ProfiliFrame2();
                                pf2.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Graniti":
                        if (fusha2.getText().equals("Granit")) {
//                            JOptionPane.showMessageDialog(null, p.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Student / e") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Student/e", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame6 pf6 = new ProfiliFrame6();
                                pf6.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Argjenda":
                        if (fusha2.getText().equals("000")) {
//                            JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Profesor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame3 pf3 = new ProfiliFrame3();
                                pf3.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Leart":
                        if (fusha2.getText().equals("007")) {
//                            JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Profesor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame4 pf4 = new ProfiliFrame4();
                                pf4.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "Njomza":
                        if (fusha2.getText().equals("111")) {
//                            JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                            if (cbRolet.getSelectedItem() == "Rektor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else if (cbRolet.getSelectedItem() == "Profesor") {
                                JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                ProfiliFrame5 pf5 = new ProfiliFrame5();
                                pf5.setVisible(true);
                                Korniza.this.setVisible(false);
                                Korniza.this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;

                    default:
                        if (fusha1.getText().isEmpty() || fusha2.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Username dhe paswordi nuk ben te lihen zbraset", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                }
//                if (fusha1.getText().equalsIgnoreCase("Taulant") && fusha2.getText().equals("123")) {
//                    JOptionPane.showMessageDialog(null, tf.toString()+ "\nRoli: "+ cbRolet.getSelectedItem());
//                     Korniza.this.dispose();
//                } else if (fusha1.getText().isEmpty() || fusha2.getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(null,"Username dhe paswordi nuk ben te lihen zbraset", "Error", JOptionPane.ERROR_MESSAGE);
//                }else{
//                    JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
//                }

            } else if (ae.getSource() == butoni2) {
                int pergjigja = JOptionPane.showConfirmDialog(Korniza.this, "A jeni i sigurte?");

                if (pergjigja == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        }
    }

    class EnterListener implements KeyListener {

        Taulanti tf = new Taulanti();
        Profa p = new Profa();
        Argjenda a = new Argjenda();

        @Override
        public void keyTyped(KeyEvent e) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getSource() == fusha2) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    switch (fusha1.getText()) {
                        case "Burim":
                            if (fusha2.getText().equals("Tick")) {
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    TabelaStudentav tbl = new TabelaStudentav();
                                    tbl.setVisible(true);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nuk keni zgjedhur rolin e duhur", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case "Taulant":
                            if (fusha2.getText().equals("123")) {
//                                JOptionPane.showMessageDialog(null, tf.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                                Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Profesor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame1 pf = new ProfiliFrame1();
                                    pf.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            break;
                        case "Berat":
                            if (fusha2.getText().equals("234")) {
//                                JOptionPane.showMessageDialog(null, p.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                                Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Student / e") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Student/e", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame2 pf2 = new ProfiliFrame2();
                                    pf2.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case "Graniti":
                            if (fusha2.getText().equals("Granit")) {
//                            JOptionPane.showMessageDialog(null, p.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Student / e") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Student/e", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame6 pf6 = new ProfiliFrame6();
                                    pf6.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case "Argjenda":
                            if (fusha2.getText().equals("000")) {
//                                JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                                Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Profesor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame3 pf3 = new ProfiliFrame3();
                                    pf3.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case "Leart":
                            if (fusha2.getText().equals("007")) {
//                            JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Profesor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame4 pf4 = new ProfiliFrame4();
                                    pf4.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case "Njomza":
                            if (fusha2.getText().equals("111")) {
//                            JOptionPane.showMessageDialog(null, a.toString() + "\nRoli: " + cbRolet.getSelectedItem());
//                            Korniza.this.dispose();
                                if (cbRolet.getSelectedItem() == "Rektor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni Rektor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else if (cbRolet.getSelectedItem() == "Profesor") {
                                    JOptionPane.showMessageDialog(null, "Ju nuk jeni nje Profesor", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    ProfiliFrame5 pf5 = new ProfiliFrame5();
                                    pf5.setVisible(true);
                                    Korniza.this.setVisible(false);
                                    Korniza.this.dispose();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;

                        default:
                            if (fusha1.getText().isEmpty() || fusha2.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Username dhe paswordi nuk ben te lihen zbraset", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Username or password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                    }
                }
//          
            } else if (e.getSource() == fusha1) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (fusha1.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Username dhe paswordi nuk ben te lihen zbraset", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            //To change body of generated methods, choose Tools | Templates.
        }

    }

    public void close() {
//        WindowEvent winClosingEvent=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        this.setVisible(false);
        this.dispose();
    }

    public static void main(String[] args) {
        Korniza k = new Korniza();

    }

}
