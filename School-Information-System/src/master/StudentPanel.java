package master;


import database.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import database.Student;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentPanel extends JFrame implements Interactiv{
  public Vector listOfStudents = new Vector();
  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JTable jTable1 = new JTable();
  JScrollPane js = new JScrollPane();
  JLabel jLabel4 = new JLabel();
  JTextField firstNameField = new JTextField();
  JTextField phoneTextField = new JTextField();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JTextField yearTextField = new JTextField();
  JLabel jLabel2 = new JLabel();
  JTextField addressTextField = new JTextField();
  JTextField monthTextField = new JTextField();
  JTextField lastNameField = new JTextField();
  JLabel jLabel6 = new JLabel();
  JTextField dayTextField = new JTextField();
  JComboBox jComboBox1 = new JComboBox();
  JLabel jLabel5 = new JLabel();
  JPanel jPanel4 = new JPanel();
  JLabel jLabel8 = new JLabel();
  JLabel jLabel9 = new JLabel();
  public StudentPanel() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
    this.getContentPane().setLayout(null);
    jPanel1.setBackground(Color.white);
    jPanel1.setForeground(Color.black);
    jPanel1.setDebugGraphicsOptions(0);
    jPanel1.setToolTipText("");
    jPanel1.setBounds(new Rectangle(0, 1, 517, 532));
    jPanel1.setLayout(null);
    this.setContentPane(jPanel1);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocale(java.util.Locale.getDefault());
    this.setResizable(true);
    this.setState(Frame.NORMAL);
    this.setTitle("Student Panel");
    jPanel2.setBackground(Color.white);
    jPanel2.setAlignmentY((float) 0.5);
    jPanel2.setBounds(new Rectangle(-1, 376, 516, 218));
    jPanel2.setLayout(null);
    jTable1.setAlignmentY((float) 0.5);
    jTable1.setBorder(BorderFactory.createLineBorder(Color.black));
    jTable1.setAutoCreateColumnsFromModel(true);
    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    jTable1.setCellSelectionEnabled(true);
    js.getViewport().setBackground(SystemColor.activeCaptionText);
    js.setBounds(new Rectangle(0, 0, 518, 293));
    jLabel4.setToolTipText("");
    jLabel4.setText("Date de Naissance (*)");
    jLabel4.setBounds(new Rectangle(35, 147, 131, 15));
    firstNameField.setBounds(new Rectangle(33, 79, 138, 22));
    firstNameField.setText("");
    phoneTextField.setText("");
    phoneTextField.setBounds(new Rectangle(211, 162, 177, 22));
    jLabel1.setBounds(new Rectangle(33, 57, 77, 21));
    jLabel1.setText("Prenom (*)");
    jLabel3.setBounds(new Rectangle(34, 103, 81, 15));
    jLabel3.setText("Adresse (*)");
    jLabel3.setToolTipText("");
    jLabel7.setBounds(new Rectangle(26, 241, 159, 18));
    jLabel7.setText("(*) These fileds are required");
    jLabel7.setVerifyInputWhenFocusTarget(true);
    yearTextField.setText("");
    yearTextField.setBounds(new Rectangle(140, 162, 66, 22));
    yearTextField.addKeyListener(new StudentPanel_yearTextField_keyAdapter(this));
    jLabel2.setBounds(new Rectangle(177, 58, 99, 21));
    jLabel2.setRequestFocusEnabled(true);
    jLabel2.setText("Nom de Famille (*)");
    addressTextField.setText("");
    addressTextField.setBounds(new Rectangle(32, 118, 274, 23));
    monthTextField.setText("");
    monthTextField.setBounds(new Rectangle(87, 162, 44, 22));
    monthTextField.addKeyListener(new StudentPanel_monthTextField_keyAdapter(this));
    lastNameField.setBounds(new Rectangle(177, 79, 138, 22));
    lastNameField.setText("");
    jLabel6.setText("Sexe (*)");
    jLabel6.setBounds(new Rectangle(330, 63, 55, 15));
    dayTextField.setBounds(new Rectangle(34, 162, 42, 22));
    dayTextField.addActionListener(new StudentPanel_dayTextField_actionAdapter(this));
    dayTextField.addKeyListener(new StudentPanel_dayTextField_keyAdapter(this));
    dayTextField.setText("");
    jComboBox1.setBackground(Color.white);
    jComboBox1.setBorder(BorderFactory.createLineBorder(Color.black));
    jComboBox1.setDebugGraphicsOptions(0);
    jComboBox1.setRequestFocusEnabled(true);
    jComboBox1.setToolTipText("");
    jComboBox1.setBounds(new Rectangle(330, 79, 72, 22));
    jLabel5.setToolTipText("");
    jLabel5.setText("Telephone");
    jLabel5.setBounds(new Rectangle(211, 146, 78, 15));
    jPanel4.setLayout(null);
    //jPanel4.setPreferredSize(new Dimension(500, 400));
    jPanel4.setBounds(new Rectangle(0, 52, 519, 201));
    jPanel4.setMaximumSize(new Dimension(500, 500));
    jPanel4.setBackground(Color.white);
    //jPanel4.setSize(new java.awt.Dimension(200, 200));
    jLabel8.setIcon(new ImageIcon(StudentPanel.class.getResource("ajouter.png")));
    jLabel8.setText("");
    jLabel8.setBounds(new Rectangle(-4, 0, 520, 124));
    jLabel9.setIcon(new ImageIcon(StudentPanel.class.getResource("afficher.png")));
    jLabel9.setText("");
    jLabel9.setBounds(new Rectangle(-2, 265, 519, 116));
    jPanel4.add(jLabel1, null);
    jPanel4.add(jLabel4, null);
    jPanel4.add(lastNameField, null);
    jPanel4.add(firstNameField, null);
    jPanel4.add(yearTextField, null);
    jPanel4.add(jComboBox1, null);
    jPanel4.add(addressTextField, null);
    jPanel4.add(jLabel3, null);
    jPanel4.add(jLabel2, null);
    jPanel4.add(monthTextField, null);
    jPanel4.add(dayTextField, null);
    jPanel4.add(jLabel6, null);
    jPanel4.add(phoneTextField, null);
    jPanel4.add(jLabel5, null);
    jPanel4.add(jLabel7, null);
    jPanel1.add(jPanel2, null);
    jPanel2.add(js, null);
    jPanel1.add(jLabel9, null);
    jPanel1.add(jLabel8, null);
    jPanel1.add(jPanel4, null);
    js.getViewport().add(jTable1, null);
    js.add(jTable1, null);
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
    },
    new String [] {
        "Nom", "Id", "Date de naissance", "Telephone", "Sexe", "adresse"}) {
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
  });

    js.setViewportView(jTable1);
    jComboBox1.addItem("Male");
    jComboBox1.addItem("Female");
  }

  void updateTable(){
      Object data[][] = new Object[listOfStudents.size()][6];
      String titles[] = { "Nom", "Id", "Date de naissance", "Telephone", "Sexe", "adresse"};
      for (int i = listOfStudents.size() - 1; i  >= 0; i--){
        Student temp = (Student) listOfStudents.get(i);
        data[listOfStudents.size() - 1 - i][0] = new String(temp.getLastName() + " " +  temp.getFirstName());
        data[listOfStudents.size() - 1 - i][1] = String.valueOf(temp.getId()) ;
        String temp2 = new String(temp.getBirthdate().get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                                  temp.getBirthdate().get(GregorianCalendar.MONTH) + "/" +
                                  temp.getBirthdate().get(GregorianCalendar.YEAR)
                                  );
        data[listOfStudents.size() - 1 - i][2] = temp2 ;
        data[listOfStudents.size() - 1 - i][3] = temp.getPhoneNumber() ;
        data[listOfStudents.size() - 1 - i][4] = temp.getSexe() ;
        data[listOfStudents.size() - 1 - i][5] = temp.getAddress() ;
            }
            mymodel ml = new mymodel (data, titles);
            jTable1.setModel(ml);
    }

  /**
   * Add
   */
  public void Add() {
    if ( firstNameField.getText().equals("") || lastNameField.getText().equals("") ||
         addressTextField.getText().equals("") || dayTextField.getText().equals("") ||
         monthTextField.getText().equals("") || yearTextField.getText().equals("")){
      JOptionPane.showMessageDialog(this, "veuillez remplir tous les champs requis !!!");
    }
    else{
      Student student = new Student(listOfStudents.size() + 1,
                                    firstNameField.getText(),
                                    lastNameField.getText(),
                                    addressTextField.getText(),
                                    new
                                    GregorianCalendar(Integer.parseInt(yearTextField.
          getText()), Integer.parseInt(monthTextField.getText()),
          Integer.parseInt(dayTextField.getText())),
                                    phoneTextField.getText());
      if (jComboBox1.getSelectedIndex() == 0)
        student.setSexe(true);
      else
        student.setSexe(false);
      listOfStudents.add(student);
      updateTable();
    }

  }

  /**
   * Delete
   */
  public void Delete() {
    if (listOfStudents.size() != 0 && jTable1.getSelectedRow() < listOfStudents.size()){
      if(jTable1.getSelectedRow()==-1)
       JOptionPane.showMessageDialog(this, "veuillez selectionner un champs !!!");
     else
      listOfStudents.removeElementAt(jTable1.getSelectedRow());
      updateTable();
    }
    else
      JOptionPane.showMessageDialog(this, "Veuillez selectionner une case");

  }




  public void save() throws FileNotFoundException, IOException {
String path = "data.txt";


   FileOutputStream fis = new FileOutputStream(path);
   ObjectOutputStream out = new ObjectOutputStream(fis);
   for(int i = 0; i<listOfStudents.size();i++){
     out.writeObject(listOfStudents.get(i));
   }



}

public void load() throws FileNotFoundException, IOException,
 ClassNotFoundException, IOException {

String path = "data.txt";
FileInputStream fis = new FileInputStream(path);
 ObjectInputStream in = new ObjectInputStream(fis);
 while(fis.available() > 0)
   listOfStudents.add((Student) in.readObject());



}


  /**
   * Edit
   */
  public void Edit() {
  }

  void dayTextField_keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    if (!Character.isDigit(c)  && c != 010)
      e.consume();
  }

  void monthTextField_keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    if (!Character.isDigit(c)  && c != 010)
      e.consume();
  }

  void yearTextField_keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    if (!Character.isDigit(c) && c != 010)
      e.consume();
  }

  void dayTextField_actionPerformed(ActionEvent e) {

  }

}

class StudentPanel_dayTextField_keyAdapter extends java.awt.event.KeyAdapter {
  StudentPanel adaptee;

  StudentPanel_dayTextField_keyAdapter(StudentPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyTyped(KeyEvent e) {
    adaptee.dayTextField_keyTyped(e);
  }
}

class StudentPanel_monthTextField_keyAdapter extends java.awt.event.KeyAdapter {
  StudentPanel adaptee;

  StudentPanel_monthTextField_keyAdapter(StudentPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyTyped(KeyEvent e) {
    adaptee.monthTextField_keyTyped(e);
  }
}

class StudentPanel_yearTextField_keyAdapter extends java.awt.event.KeyAdapter {
  StudentPanel adaptee;

  StudentPanel_yearTextField_keyAdapter(StudentPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void keyTyped(KeyEvent e) {
    adaptee.yearTextField_keyTyped(e);
  }
}

class StudentPanel_dayTextField_actionAdapter implements java.awt.event.ActionListener {
  StudentPanel adaptee;

  StudentPanel_dayTextField_actionAdapter(StudentPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.dayTextField_actionPerformed(e);
  }
}
