import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        TrueFalse trueFalse = new TrueFalse(); //Create an instance for the class TrueFalse so we can run it
        trueFalse.trueFalse(); //Run TrueFalse

        GuessNumber guessNumber = new GuessNumber(); //Create an instance for the class GuessNUmber so we can run it
        guessNumber.numGame(); //Run Guess Number
    }
}
