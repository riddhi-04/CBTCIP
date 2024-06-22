
import java.util.*;
import javax.swing.*;

public class GTN {
   public static void gt(){
       JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, "The number is greater than that.","Nope!", JOptionPane.ERROR_MESSAGE);
       
       frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(false);
    }
   public static void lt(){
        JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, "The number is lesser than that.","Nope!", JOptionPane.ERROR_MESSAGE);
       
       frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(false);
    }
   public static void hit(){
        JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, "You guessed it.","HURRAY!!", JOptionPane.PLAIN_MESSAGE);
       
       frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(false);
       System.exit(0);
    }

    
   public static void gtn(){
        Scanner sc = new Scanner(System.in);

        
        int number = 1 + (int)(100* Math.random());

        int K = 7;
        

        int i, guess;

        System.out.println("A number is chosen between 1 to 100.\nGuess the number within 7 trials.");

        int j = K;
        for (i = 0; i < K; i++) {
                        
            System.out.println("Guess the number:");

            
            guess = sc.nextInt();
                        j=j-1;
            if (number == guess) {
                hit();
                break;
            }
            else if (number > guess && i != K - 1) {
                gt();
                System.out.println("Guesses left: "+j);
            }
            else if (number < guess && i != K - 1) {
                lt();
                System.out.println("Guesses left: "+j);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted K trials.");

            System.out.println("The number was " + number);
            System.exit(0);
        }
    }

    // Driver Code
    public static void main(String arg[])
    {

        
        gtn();
    }
}
