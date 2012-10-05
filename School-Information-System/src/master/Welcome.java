package master;

import java.awt.*;
import javax.swing.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class Welcome extends JPanel {
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel jLabel1 = new JLabel();

  public Welcome() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    this.setLayout(borderLayout1);
    jLabel1.setIcon(new ImageIcon(Welcome.class.getResource("TempBqck.PNG")));
    jLabel1.setText("");
    this.add(jLabel1, BorderLayout.NORTH);
  }
}
