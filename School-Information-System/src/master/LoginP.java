package master;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class LoginP extends JPanel {
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JPanel Welcome=new JPanel();
  JTextField jTextField1 = new JTextField();
  JPasswordField jPasswordField1 = new JPasswordField();
  JToggleButton jToggleButton1 = new JToggleButton();
  MasterFrame m;
  JLabel jLabel3 = new JLabel();

  public LoginP(MasterFrame m) {
    this.m=m;

    m.jTabbedPane1.remove(m.jTabbedPane1.getComponentAt(0));
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
    jLabel1.setForeground(SystemColor.activeCaptionText);
    jLabel1.setToolTipText("");
    jLabel1.setText("Nom d\'utilisateur :");
    jLabel1.setBounds(new Rectangle(31, 69, 179, 31));
    this.setLayout(null);
    jLabel2.setBounds(new Rectangle(31, 115, 179, 31));
    jLabel2.setText("Mot de passe       :");
    jLabel2.setForeground(SystemColor.activeCaptionText);
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18));
    jTextField1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18));
    jTextField1.setText("");
    jTextField1.setBounds(new Rectangle(221, 69, 156, 37));
    jPasswordField1.setFont(new java.awt.Font("Monospaced", 1, 19));
    jPasswordField1.setText("");
    jPasswordField1.setBounds(new Rectangle(221, 111, 156, 37));
    jToggleButton1.setBorderPainted(false);
    jToggleButton1.setContentAreaFilled(false);
    jToggleButton1.setIcon(new ImageIcon(LoginP.class.getResource("Login.png")));
    jToggleButton1.setRolloverEnabled(true);
    jToggleButton1.setRolloverIcon(new ImageIcon(LoginP.class.getResource("LoginLum.png")));
    jToggleButton1.setText("");
    jToggleButton1.setBounds(new Rectangle(220, 175, 157, 55));
    jToggleButton1.addActionListener(new LoginP_jToggleButton1_actionAdapter(this));
    jLabel3.setRequestFocusEnabled(true);
    jLabel3.setToolTipText("");
    jLabel3.setIcon(new ImageIcon(LoginP.class.getResource("Back.PNG")));
    jLabel3.setText("");
    jLabel3.setBounds(new Rectangle(-25, 0, 672, 487));
    this.add(jTextField1, null);
    this.add(jLabel1, null);
    this.add(jLabel2, null);
    this.add(jPasswordField1, null);
    this.add(jToggleButton1, null);
    this.add(jLabel3, null);
  }

  void jToggleButton1_actionPerformed(ActionEvent e) {
    //m.jTabbedPane1.add("MenuPrincipal",new JPanel());
    if(this.jTextField1.getText().compareToIgnoreCase("admin")==0 && this.jPasswordField1.getText().compareTo("1234")==0){
      m.acces = true;
      m.isOpened[0] = true;
      m.jTabbedPane1.remove(this);

      m.jTabbedPane1.add("Bienvenue", new Welcome());
      this.setVisible(false);
    }else JOptionPane.showMessageDialog(this,"Le nom d'utilisateur ou le mot de passe est incorrect","Identification Echou�e" ,JOptionPane.ERROR_MESSAGE);
    }
}

class LoginP_jToggleButton1_actionAdapter implements java.awt.event.ActionListener {
  LoginP adaptee;

  LoginP_jToggleButton1_actionAdapter(LoginP adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jToggleButton1_actionPerformed(e);
  }
}
