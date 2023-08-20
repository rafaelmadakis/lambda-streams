import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class JavaRunnable {

  public static void main(String[] args) {


    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Olá Mundo");
      }
    }).run();

    //Funções Lambda
    new Thread(() -> System.out.println("Olá mundo")).run();


  }

}
