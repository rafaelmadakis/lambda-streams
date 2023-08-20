import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LambdaRunnable {

  public static void main(String[] args) {

    JButton jButton = new JButton();
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Olá mundo");
      }
    });


    JButton jButton1 = new JButton();
    jButton1.addActionListener(e -> System.out.println("Olá mundo"));

    //SAM - Single abstract Method
    //Qualquer interface que tenha apenas apenas um método abstrato


  }

}
