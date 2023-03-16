/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: KeyStrokeSample
 *Purpose: Prompt the user for input using a window, when that input is entered output the prompt to the terminal.
 */

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
public class KeyStrokeSample {
  public static void main(String[] a) {
    String ACTION_KEY = "theAction";
    JFrame frame = new JFrame("KeyStroke Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton buttonA = new JButton("Press 'W'");
    Action actionListener = new AbstractAction() {
      public void actionPerformed(ActionEvent actionEvent) {
        JButton source = (JButton) actionEvent.getSource();
        System.out.println(source.getText());
        
      }
    };
    KeyStroke W = KeyStroke.getKeyStroke("W");
    InputMap inputMap = buttonA.getInputMap();
    inputMap.put(W, ACTION_KEY);
    ActionMap actionMap = buttonA.getActionMap();
    actionMap.put(ACTION_KEY, actionListener);
    frame.add(buttonA);
    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}


