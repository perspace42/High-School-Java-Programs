/*Author: Scott Field
 *Date: 2017
 *Version: 1.0
 *Name: KeyStrokeSampleTwo
 *Purpose: Prompt the user for input using a window, when each input is clicked output to the terminal which key has been pressed.
 If a key is held output how many keystrokes have occured until the key has been released
 */

//imports necessary for key input
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

//Setting up the window
public class KeyStrokeSampletwo {
  public static void main(String[] args) {
    String W_ACTION_KEY = "W";
    String A_ACTION_KEY = "A";
    String S_ACTION_KEY = "S";
    String D_ACTION_KEY = "D";
    JFrame frame = new JFrame("KeyStroke Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton buttonA = new JButton("Press 'WASD'");
    
    //What actually happens when the key is pressed.
    Action W_actionListener = new AbstractAction() {
      int u_int=0;
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("W is pressed");
        System.out.println(u_int);
        u_int=u_int+1;
      }
    };
        
     Action A_actionListener = new AbstractAction() {
      int u_int=0;
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("A is pressed");
        System.out.println(u_int);
        u_int=u_int+1;
      }
     };
    
     Action S_actionListener = new AbstractAction() {
      int u_int=0;
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("S is pressed");
        System.out.println(u_int);
        u_int=u_int+1;
      }
     };
        
     Action D_actionListener = new AbstractAction() {
      int u_int=0;
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("D is pressed");
        System.out.println(u_int);
        u_int=u_int+1;
        
        
      }
    };
    //Defining the Keys.
    KeyStroke W = KeyStroke.getKeyStroke("W");
    InputMap Wpressed = buttonA.getInputMap();
    Wpressed.put(W, W_ACTION_KEY);
    
    KeyStroke A = KeyStroke.getKeyStroke("A");
    InputMap Apressed = buttonA.getInputMap();
    Apressed.put(A, A_ACTION_KEY);
    
    KeyStroke S = KeyStroke.getKeyStroke("S");
    InputMap Spressed = buttonA.getInputMap(); 
    Spressed.put(S, S_ACTION_KEY);
    
    KeyStroke D = KeyStroke.getKeyStroke("D");
    InputMap Dpressed = buttonA.getInputMap();
    Dpressed.put(D, D_ACTION_KEY);
    
    //Telling it to listen for the keys.
    ActionMap W_actionMap = buttonA.getActionMap();
    W_actionMap.put(W_ACTION_KEY, W_actionListener);
    
    ActionMap A_actionMap = buttonA.getActionMap();
    A_actionMap.put(A_ACTION_KEY, A_actionListener);
    
    ActionMap S_actionMap = buttonA.getActionMap();
    S_actionMap.put(S_ACTION_KEY, S_actionListener);
    
    ActionMap D_actionMap = buttonA.getActionMap();
    D_actionMap.put(D_ACTION_KEY, D_actionListener);
    
    //Setting up the button in the window.
    frame.add(buttonA);
    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}


