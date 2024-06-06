import javax.swing.JOptionPane;

public class TrueFalse {
    static int playAgain = 0; // Create a static variable called playagain that will be used to see if the user wants to play again
    public void trueFalse(){
    
    while (playAgain == 0) //WHile loop for if the user wants to play again
    {
        int answer = JOptionPane.showConfirmDialog(null, "Are grapes the best fruit?");
            if (answer == 0){ //Ask the user a question, if the user inputs "yes" output a messaged (yess = 0)
                JOptionPane.showMessageDialog(null, "You have good a good opinion!");
                }
            if (answer == 1){ // If the user inputs no output a statement (no = 1)
            JOptionPane.showMessageDialog(null, "WRONG! Grapes ARE the best fruit!");
            }
            if (answer == 2){ // Cancel = 2,
            JOptionPane.showMessageDialog(null, "Thanks for playing, have a great day!");
            }

        int replay = JOptionPane.showConfirmDialog(null, "Would you like to play again?"); //ask the user if they would like to play again

        if (replay == 0){// check if the user inputted yes, if so do not change the value of playagain
            playAgain = 0;
        }
        else{ //anything else means the use does not want to playa agina
            playAgain = 1;
            JOptionPane.showMessageDialog(null, "Thank you for playing!"); //OUtput a thank you message
        }
    }
}

}