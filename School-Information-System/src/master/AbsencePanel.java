package master;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import database.Absence;
import java.util.GregorianCalendar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AbsencePanel extends JFrame {
  Vector listOfAbsences = new Vector();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JTextField firstNameField = new JTextField();
  JPanel jPanel4 = new JPanel();
  JScrollPane js = new JScrollPane();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JTextField yearTextField = new JTextField();
  JPanel jPanel1 = new JPanel();
  JLabel jLabel2 = new JLabel();
  JTextField addressTextField = new JTextField();
  JTextField monthTextField = new JTextField();
  JTextField lastNameField = new JTextField();
  JTextField dayTextField = new JTextField();
  JPanel jPanel2 = new JPanel();
  JLabel jLabel9 = new JLabel();
  JTable jTable1 = new JTable();
  FlowLayout flowLayout1 = new FlowLayout();
  public AbsencePanel() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
    jPanel4.setBackground(SystemColor.activeCaptionText);
    jPanel4.setMaximumSize(new Dimension(500, 500));
    jPanel4.setBounds(new Rectangle(0, 52, 483, 201));
    jPanel4.setLayout(null);
    firstNameField.setText("");
    firstNameField.setBounds(new Rectangle(33, 79, 131, 22));
    jLabel8.setBounds(new Rectangle(-4, 0, 520, 124));
    jLabel8.setText("");
    jLabel8.setIcon(new ImageIcon(AbsencePanel.class.getResource("AbsenceShow.png")));
    jLabel4.setBounds(new Rectangle(35, 147, 131, 15));
    jLabel4.setText("Date de Naissance (*)");
    jLabel4.setToolTipText("");
    this.getContentPane().setBackground(UIManager.getColor("Button.highlight"));
    this.getContentPane().setLayout(null);
    js.getViewport().setBackground(SystemColor.activeCaptionText);
    jLabel1.setBounds(new Rectangle(33, 57, 77, 21));
    jLabel1.setText("Prenom (*)");
    jLabel3.setBounds(new Rectangle(34, 103, 81, 15));
    jLabel3.setText("Classe (*)");
    jLabel3.setToolTipText("");
    jLabel7.setBounds(new Rectangle(26, 241, 159, 18));
    jLabel7.setText("(*) These fileds are required");
    jLabel7.setVerifyInputWhenFocusTarget(true);
    yearTextField.setText("");
    yearTextField.setBounds(new Rectangle(140, 162, 66, 22));
    yearTextField.addKeyListener(new AbsencePanel_yearTextField_keyAdapter(this));
    jPanel1.setBackground(SystemColor.activeCaptionText);
    jPanel1.setDebugGraphicsOptions(0);
    jPanel1.setToolTipText("");
    jPanel1.setBounds(new Rectangle(0, 10, 495, 532));
    jPanel1.setLayout(null);
    jLabel2.setBounds(new Rectangle(177, 58, 105, 21));
    jLabel2.setRequestFocusEnabled(true);
    jLabel2.setText("Nom de Famille (*)");
    addressTextField.setText("");
    addressTextField.setBounds(new Rectangle(32, 118, 290, 23));
    monthTextField.setText("");
    monthTextField.setBounds(new Rectangle(87, 162, 44, 22));
    monthTextField.addActionListener(new AbsencePanel_monthTextField_actionAdapter(this));
    monthTextField.addKeyListener(new AbsencePanel_monthTextField_keyAdapter(this));
    lastNameField.setBounds(new Rectangle(173, 79, 150, 22));
    lastNameField.addActionListener(new AbsencePanel_lastNameField_actionAdapter(this));
    lastNameField.setText("");
    dayTextField.setBounds(new Rectangle(31, 162, 45, 22));
    dayTextField.addKeyListener(new AbsencePanel_dayTextField_keyAdapter(this));
    dayTextField.setText("");
    jPanel2.setBackground(Color.white);
    jPanel2.setAlignmentY((float) 0.5);
    jPanel2.setBounds(new Rectangle(-12, 349, 493, 218));
    jPanel2.setLayout(flowLayout1);
    jLabel9.setIcon(new ImageIcon(AbsencePanel.class.getResource("AbsenceView.png")));
    jLabel9.setIconTextGap(4);
    jLabel9.setText("");
    jLabel9.setBounds(new Rectangle(-2, 265, 519, 116));
    jTable1.setAlignmentY((float) 0.5);
    jTable1.setBorder(BorderFactory.createLineBorder(Color.black));
    jTable1.setAutoCreateColumnsFromModel(true);
    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    jTable1.setCellSelectionEnabled(true);
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null},
        {null, null, null},
        {null, null, null}
    },
    new String [] {
        "Nom et Prenom", "Class", "Date d'absence"}) {
    boolean[] canEdit = new boolean [] {
        false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
  });
    js.add(jTable1, null);
    jPanel1.add(jLabel9, null);
    jPanel1.add(jLabel8, null);
    jPanel1.add(jPanel4, null);
    js.add(jTable1, null);
    jPanel4.add(jLabel1, null);
    jPanel4.add(jLabel4, null);
    jPanel4.add(firstNameField, null);
    jPanel4.add(yearTextField, null);
    jPanel4.add(addressTextField, null);
    jPanel4.add(jLabel3, null);
    jPanel4.add(jLabel2, null);
    jPanel4.add(monthTextField, null);
    jPanel4.add(dayTextField, null);
    jPanel4.add(jLabel7, null);
    jPanel4.add(lastNameField, null);
    jPanel1.add(jPanel2, null);
    jPanel2.add(js, null);
    js.setViewportView(jTable1);
    this.getContentPane().add(jPanel1, null);






  }

  void dayTextField_keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
        if (!Character.isDigit(c)  && c != 010)
          e.consume();

  }

  void monthTextField_keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
        if (!Character.isDigit(c)  && c != 010)
          e.consume();

  }

  void yearTextField_keyPressed(KeyEvent e) {
    char c = e.getKeyChar();
        if (!Character.isDigit(c)  && c != 010)
          e.consume();

  }

  public void save() throws FileNotFoundException, IOException {
  String path = "data.txt";


      FileOutputStream fis = new FileOutputStream(path);
      ObjectOutputStream out = new ObjectOutputStream(fis);
      for(int i = 0; i<listOfAbsences.size();i++){
        out.writeObject(listOfAbsences.get(i));
      }



}

public void load() throws FileNotFoundException, IOException,
    ClassNotFoundException, IOException {

  String path = "data.txt";
  FileInputStream fis = new FileInputStream(path);
    ObjectInputStream in = new ObjectInputStream(fis);
    while(fis.available() > 0)
      listOfAbsences.add((Absence) in.readObject());



}





  void updateTable(){
    Object data[][] = new Object[listOfAbsences.size()][3];
    String titles[] = { "Nom et Prenom ", "Class", "Date d'absence"};
    for (int i = listOfAbsences.size() - 1; i  >= 0; i--){
      Absence temp = (Absence) listOfAbsences.get(i);
      data[listOfAbsences.size() - 1 - i][0] = new String(temp.fullName);
      String temp2 = new String(temp.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                                temp.date.get(GregorianCalendar.MONTH) + "/" +
                                temp.date.get(GregorianCalendar.YEAR)
                                );
      data[listOfAbsences.size() - 1 - i][2] = temp2 ;
      data[listOfAbsences.size() - 1 - i][1] = temp.className ;
          }
          mymodel ml = new mymodel (data, titles);
          jTable1.setModel(ml);
  }



  void delete (){
    if (listOfAbsences.size() != 0 && jTable1.getSelectedRow() < listOfAbsences.size()){
      listOfAbsences.removeElementAt(jTable1.getSelectedRow());
      updateTable();
    }
    else
      JOptionPane.showMessageDialog(this, "Veuillez selectionner une case");
  }


  void add() {
      if ( firstNameField.getText().equals("") || lastNameField.getText().equals("") ||
             dayTextField.getText().equals("") || addressTextField.getText().equals("") ||
            monthTextField.getText().equals("") || yearTextField.getText().equals("")){
         JOptionPane.showMessageDialog(this, "veuillez remplir tous les champs requis !!!");
       }
       else{
         Absence ab = new Absence();
         ab.fullName = new String(firstNameField.getText() + " " + lastNameField.getText());
         ab.date = new GregorianCalendar(Integer.parseInt(yearTextField.
         getText()), Integer.parseInt(monthTextField.getText()),
          Integer.parseInt(dayTextField.getText()));
         ab.className = addressTextField.getText();
         listOfAbsences.add(ab);
         updateTable();
       }



}

  void lastNameField_actionPerformed(ActionEvent e) {

  }

  void monthTextField_actionPerformed(ActionEvent e) {

  }
}

class AbsencePanel_dayTextField_keyAdapter extends java.awt.event.KeyAdapter {
  AbsencePanel adaptee;

  AbsencePanel_dayTextField_keyAdapter(AbsencePanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyTyped(KeyEvent e) {
    adaptee.dayTextField_keyTyped(e);
  }
}

class AbsencePanel_monthTextField_keyAdapter extends java.awt.event.KeyAdapter {
  AbsencePanel adaptee;

  AbsencePanel_monthTextField_keyAdapter(AbsencePanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyPressed(KeyEvent e) {
    adaptee.monthTextField_keyPressed(e);
  }
}

class AbsencePanel_yearTextField_keyAdapter extends java.awt.event.KeyAdapter {
  AbsencePanel adaptee;

  AbsencePanel_yearTextField_keyAdapter(AbsencePanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyPressed(KeyEvent e) {
    adaptee.yearTextField_keyPressed(e);
  }
}

class AbsencePanel_lastNameField_actionAdapter implements java.awt.event.ActionListener {
  AbsencePanel adaptee;

  AbsencePanel_lastNameField_actionAdapter(AbsencePanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.lastNameField_actionPerformed(e);
  }
}

class AbsencePanel_monthTextField_actionAdapter implements java.awt.event.ActionListener {
  AbsencePanel adaptee;

  AbsencePanel_monthTextField_actionAdapter(AbsencePanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.monthTextField_actionPerformed(e);
  }



}
