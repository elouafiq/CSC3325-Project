package master;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class MasterApp {
  public static void main(String []args ) throws UnsupportedLookAndFeelException,
      IllegalAccessException, InstantiationException, ClassNotFoundException {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    MasterFrame master = new MasterFrame();

    master.setSize(805, 626);
    master.setVisible(true);
  }


}
