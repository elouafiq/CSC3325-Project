package master;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class MasterFrame extends JFrame {
  boolean isOpened[]=new boolean[7];
  boolean acces;
  boolean flag;
  boolean welcomeEnabled;
  StudentPanel StudentPanels=new StudentPanel();
  addTeacher TeacherPanels=new addTeacher();
  EmployeePanel EmployeePanels= new EmployeePanel();
  TransportPanel TransportPanels=new TransportPanel();
  AbsencePanel AbsencesPanels=new AbsencePanel();
  ClassPanel ClassPanels= new ClassPanel();


  JButton View = new JButton();
  JButton Add = new JButton();
  JButton Edit = new JButton();
  JButton Delete = new JButton();
  JButton Stud = new JButton();
  JButton Employ = new JButton();
  JButton Classes = new JButton();
  JButton Trans = new JButton();
  JButton absence = new JButton();
  JButton MainMenu = new JButton();
  JButton Proff = new JButton();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JLabel jLabel2 = new JLabel();
  JLabel Main = new JLabel();
  JLabel jLabel1 = new JLabel();
  public static void main(String []args ) throws UnsupportedLookAndFeelException,
      IllegalAccessException, InstantiationException, ClassNotFoundException {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());


     MasterFrame master = new MasterFrame();
     master.jTabbedPane1.add("Identification",new LoginP(master));
     master.acces=false;
     master.setSize(775, 655);
     master.setVisible(true);

   }

  public MasterFrame() {
    welcomeEnabled=flag=true;
    this.setTitle("School Information System");
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {

   if(welcomeEnabled==false && flag==true){


   }
    this.getContentPane().setLayout(null);

    View.setBounds(new Rectangle(521, 0, 194, 81));
    View.setFont(new java.awt.Font("Times New Roman", 1, 14));
    View.setForeground(SystemColor.activeCaptionText);
    View.setBorderPainted(false);
    View.setContentAreaFilled(false);
    View.setIcon(new ImageIcon(MasterFrame.class.getResource("Button-Info-icon.png")));
    View.setText("Voir Infos");
    Add.setBounds(new Rectangle(193, 3, 146, 81));
    Add.setFont(new java.awt.Font("Times New Roman", 1, 16));
    Add.setForeground(SystemColor.activeCaptionText);
    Add.setDebugGraphicsOptions(0);
    Add.setBorderPainted(false);
    Add.setContentAreaFilled(false);
    Add.setHorizontalTextPosition(SwingConstants.TRAILING);
    Add.setIcon(new ImageIcon(MasterFrame.class.getResource("Button-Add-icon.png")));
    Add.setText("Ajouter");
    Add.addActionListener(new MasterFrame_Add_actionAdapter(this));
    Edit.setBounds(new Rectangle(427, 2, 146, 81));
    Edit.setFont(new java.awt.Font("Times New Roman", 1, 14));
    Edit.setForeground(SystemColor.activeCaptionText);
    Edit.setBorderPainted(false);
    Edit.setContentAreaFilled(false);
    Edit.setFocusPainted(true);
    Edit.setIcon(new ImageIcon(MasterFrame.class.getResource("Button-Refresh-icon.png")));
    Edit.setText("Editer");
    Edit.addActionListener(new MasterFrame_Edit_actionAdapter(this));
    Delete.setBounds(new Rectangle(304, 1, 165, 81));
    Delete.setFont(new java.awt.Font("Times New Roman", 1, 14));
    Delete.setForeground(SystemColor.activeCaptionText);
    Delete.setBorderPainted(false);
    Delete.setContentAreaFilled(false);
    Delete.setHorizontalTextPosition(SwingConstants.TRAILING);
    Delete.setIcon(new ImageIcon(MasterFrame.class.getResource("Button-Close-icon.png")));
    Delete.setText("Supprimer");
    Delete.addActionListener(new MasterFrame_Delete_actionAdapter(this));
    Stud.setText("");
    Stud.addActionListener(new MasterFrame_Stud_actionAdapter(this));
    Stud.addActionListener(new MasterFrame_Stud_actionAdapter(this));
    Stud.setContentAreaFilled(false);
    Stud.setIcon(new ImageIcon(MasterFrame.class.getResource("stud.png")));
    Stud.setMnemonic('0');
    Stud.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("StudLum.png")));
    Stud.setBorderPainted(false);
    Stud.setActionCommand("");
    Stud.setBounds(new Rectangle(23, 486, 155, 47));
    Stud.setBackground(SystemColor.activeCaptionBorder);
    Employ.setText("");
    Employ.addActionListener(new MasterFrame_Employ_actionAdapter(this));
    Employ.addActionListener(new MasterFrame_Employ_actionAdapter(this));
    Employ.setContentAreaFilled(false);
    Employ.setIcon(new ImageIcon(MasterFrame.class.getResource("Employes.png")));
    Employ.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("EmpLum.png")));
    Employ.setBorderPainted(false);
    Employ.setActionCommand("");
    Employ.setBounds(new Rectangle(24, 311, 155, 47));
    Employ.setBackground(SystemColor.activeCaptionBorder);
    Classes.setBackground(SystemColor.activeCaptionBorder);
    Classes.setBounds(new Rectangle(24, 252, 154, 47));
    Classes.setActionCommand("");
    Classes.setBorderPainted(false);
    Classes.setContentAreaFilled(false);
    Classes.setIcon(new ImageIcon(MasterFrame.class.getResource("Classes.png")));
    Classes.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("ClassesLUm.png")));
    Classes.setText("");
    Classes.addActionListener(new MasterFrame_Classes_actionAdapter(this));
    Classes.addActionListener(new MasterFrame_Classes_actionAdapter(this));
    Trans.setBackground(SystemColor.activeCaptionBorder);
    Trans.setBounds(new Rectangle(23, 371, 157, 47));
    Trans.setOpaque(false);
    Trans.setActionCommand("");
    Trans.setBorderPainted(false);
    Trans.setContentAreaFilled(false);
    Trans.setIcon(new ImageIcon(MasterFrame.class.getResource("Transport.png")));
    Trans.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("TransLum.png")));
    Trans.setText("");
    Trans.addActionListener(new MasterFrame_Trans_actionAdapter(this));
    Trans.addActionListener(new MasterFrame_Trans_actionAdapter(this));
    absence.setText("");
    absence.addActionListener(new MasterFrame_absence_actionAdapter(this));
    absence.addActionListener(new MasterFrame_absence_actionAdapter(this));
    absence.setContentAreaFilled(false);
    absence.setHorizontalTextPosition(SwingConstants.TRAILING);
    absence.setIcon(new ImageIcon(MasterFrame.class.getResource("Abs.png")));
    absence.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("Abslum.png")));
    absence.setBorderPainted(false);
    absence.setActionCommand("");
    absence.setBounds(new Rectangle(23, 426, 156, 47));
    absence.setDebugGraphicsOptions(0);
    absence.setBackground(SystemColor.activeCaptionBorder);
    MainMenu.setBackground(SystemColor.activeCaptionBorder);
    MainMenu.setBounds(new Rectangle(23, 144, 155, 47));
    MainMenu.setMaximumSize(new Dimension(33, 9));
    MainMenu.setActionCommand("");
    MainMenu.setBorderPainted(false);
    MainMenu.setContentAreaFilled(false);
    MainMenu.setIcon(new ImageIcon(MasterFrame.class.getResource("Menu.png")));
    MainMenu.setRolloverEnabled(true);
    MainMenu.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("MenuLum.png")));
    MainMenu.setText("");
    MainMenu.addActionListener(new MasterFrame_MainMenu_actionAdapter(this));
    MainMenu.addActionListener(new MasterFrame_MainMenu_actionAdapter(this));
    Proff.setText("");
    Proff.addActionListener(new MasterFrame_Proff_actionAdapter(this));
    Proff.addActionListener(new MasterFrame_Proff_actionAdapter(this));
    Proff.setContentAreaFilled(false);
    Proff.setIcon(new ImageIcon(MasterFrame.class.getResource("Pro.png")));
    Proff.setRolloverIcon(new ImageIcon(MasterFrame.class.getResource("ProfLum.png")));
    Proff.setBorderPainted(false);
    Proff.setActionCommand("");
    Proff.setBounds(new Rectangle(24, 197, 154, 47));
    Proff.setBackground(SystemColor.activeCaptionBorder);
    jTabbedPane1.setTabPlacement(JTabbedPane.TOP);
    jTabbedPane1.setBorder(null);
    jTabbedPane1.setDebugGraphicsOptions(0);
    jTabbedPane1.setOpaque(false);
    jTabbedPane1.setToolTipText("");
    jTabbedPane1.setBounds(new Rectangle(208, 95, 534, 517));
    jLabel2.setIcon(new ImageIcon(MasterFrame.class.getResource("SIS.png")));
    jLabel2.setText("");
    jLabel2.setBounds(new Rectangle(53, 21, 100, 92));
    Main.setIcon(new ImageIcon(MasterFrame.class.getResource("TempBqck.PNG")));
    Main.setText("");
    jLabel1.setRequestFocusEnabled(true);
    jLabel1.setIcon(new ImageIcon(MasterFrame.class.getResource("green-windows-7-wallpapers_11839_1024x768.jpg")));
    jLabel1.setText("");
    jLabel1.setBounds(new Rectangle(0, 0, 768, 621));
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(MainMenu, null);
    this.getContentPane().add(Stud, null);
    this.getContentPane().add(Proff, null);
    this.getContentPane().add(Classes, null);
    this.getContentPane().add(Employ, null);
    this.getContentPane().add(Trans, null);
    this.getContentPane().add(absence, null);
    this.getContentPane().add(Add, null);
    this.getContentPane().add(Delete, null);
    this.getContentPane().add(Edit, null);
    this.getContentPane().add(View, null);
    this.getContentPane().add(jTabbedPane1, null);
    this.getContentPane().add(jLabel1, null);
    jTabbedPane1.add(Main,  "Main");
  }

  void MainMenu_actionPerformed(ActionEvent e) {
    if(isOpened[0]==false && acces==true){
      jTabbedPane1.add("MenuPricipal",new JPanel());
      if(flag==true){
            this.jTabbedPane1.remove(0);
         flag=false;
          }


      isOpened[0]=true;
    }jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("MenuPricipal"));
  }

  void Proff_actionPerformed(ActionEvent e) throws ClassNotFoundException,
      FileNotFoundException, IOException {
    if(isOpened[1]==false && acces==true){

      if(flag==true){
        this.jTabbedPane1.remove(0);
     flag=false;
      }


      jTabbedPane1.add("Professeurs",TeacherPanels.getContentPane());
      TeacherPanels.load();
      TeacherPanels.updateTable();
      isOpened[1]=true;
    }
     jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Professeurs"));
  }

  void Classes_actionPerformed(ActionEvent e) {
    if(isOpened[2]==false && acces==true){

      if(flag==true){
        this.jTabbedPane1.remove(0);
     flag=false;
      }

      jTabbedPane1.add("Classes",ClassPanels.getContentPane());
          isOpened[2]=true;
        }jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Classes"));

  }

  void Employ_actionPerformed(ActionEvent e) {
    if(isOpened[3]==false && acces==true){
     // EmployeePanel EmployeePanels= new EmployeePanel();
      if(flag==true){//jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Employee"));
            this.jTabbedPane1.remove(0);
         flag=false;
          }
    jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Employee"));

           jTabbedPane1.add("Employees",EmployeePanels.getContentPane());
           isOpened[3]=true;
           jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Employee"));

         }
       jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Employee"));



  }

  void Trans_actionPerformed(ActionEvent e) {
    if(isOpened[4]==false && acces==true){
      TransportPanel TransportPanels=new TransportPanel();
      if(flag==true){
      this.jTabbedPane1.remove(0);
   flag=false;
    }


           jTabbedPane1.add("Transport",TransportPanels.getContentPane());
           isOpened[4]=true;
         }jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Transport"));

  }

  void absence_actionPerformed(ActionEvent e) {
    if(isOpened[5]==false && acces==true){

      if(flag==true){
      this.jTabbedPane1.remove(0);
   flag=false;
    }


           jTabbedPane1.add("Absences",AbsencesPanels.getContentPane());
           isOpened[5]=true;
         }jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Absences"));

  }

  void Stud_actionPerformed(ActionEvent e) {


    if(isOpened[6]==false && acces==true){
      if(flag==true){jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Eleves"));
      this.jTabbedPane1.remove(0);
   flag=false;
    }


           jTabbedPane1.add("Eleves",StudentPanels.getContentPane());
           isOpened[6]=true;
         }jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Eleves"));

  }

  void Add_actionPerformed(ActionEvent e) {

  String Str=jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());

    if(Str.compareTo( "Eleves")==0){
      StudentPanels.Add();
     }else if (Str.compareTo( "Classes")==0){
       ClassPanels.Add();
     }else if (Str.compareTo( "Transport")==0){
       TransportPanels.Add();
     }else if (Str.compareTo( "Absences")==0){
       AbsencesPanels.add();
     }else if (Str.compareTo( "Employees")==0){
       EmployeePanels.add();
     }else if (Str.compareTo( "Professeurs")==0){
       TeacherPanels.Add();
     }




  }

  void Delete_actionPerformed(ActionEvent e) {
     String Str=jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());

       if(Str.compareTo( "Eleves")==0){
         StudentPanels.Delete();
     }else if (Str.compareTo( "Classes")==0){
       ClassPanels.Delete();
     }else if (Str.compareTo( "Transport")==0){
 TransportPanels.Delete();
     }else if (Str.compareTo( "Absences")==0){
        AbsencesPanels.delete();
     }else if (Str.compareTo( "Employees")==0){
       EmployeePanels.delete();
     }else if (Str.compareTo( "Professeurs")==0){
       TeacherPanels.Delete();
     }




  }

  void Edit_actionPerformed(ActionEvent e) {

  }
}

class MasterFrame_Proff_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Proff_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    try {
      adaptee.Proff_actionPerformed(e);
    }
    catch (FileNotFoundException ex) {
    }
    catch (IOException ex) {
    }
    catch (ClassNotFoundException ex) {
    }
  }
}

class MasterFrame_MainMenu_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_MainMenu_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.MainMenu_actionPerformed(e);
  }
}

class MasterFrame_Trans_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Trans_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Trans_actionPerformed(e);
  }
}

class MasterFrame_Classes_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Classes_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Classes_actionPerformed(e);
  }
}

class MasterFrame_Employ_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Employ_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Employ_actionPerformed(e);
  }
}

class MasterFrame_absence_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_absence_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.absence_actionPerformed(e);
  }
}

class MasterFrame_Stud_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Stud_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Stud_actionPerformed(e);
  }
}

class MasterFrame_Add_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Add_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Add_actionPerformed(e);
  }
}

class MasterFrame_Delete_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Delete_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Delete_actionPerformed(e);
  }
}

class MasterFrame_Edit_actionAdapter implements java.awt.event.ActionListener {
  MasterFrame adaptee;

  MasterFrame_Edit_actionAdapter(MasterFrame adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.Edit_actionPerformed(e);
  }
}
