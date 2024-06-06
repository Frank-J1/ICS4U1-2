import javax.swing.JOptionPane;

public class GuessNumber {
    public void numGame() {
        int targetNum = (int) (Math.random() * 100) + 1; // Set a variable to be equal to a number between 1 and 100. Since we are using match.random make sure to add + 1
        int guess = 0; // Create a variable that will be used to store the users inputed value

        while (guess != targetNum) { // Create a while loop so that the user must keep guessing until they get the correct number
            String input = JOptionPane.showInputDialog("GUESS A NUMBER FROM 1 TO 100 RIGHT NOW!!!!!!:"); // Creat a string input that will let the user input a number

            try {
                guess = Integer.parseInt(input); // Convert the string variable to be a integer. set the "guess" variable to be equal to the inputted number

                if (guess > targetNum) { // See if the inputted number is greater then the generated number, if so put out a statement
                    JOptionPane.showMessageDialog(null, "LMAO you stink, try again (you number is too high)");
                } else if (guess < targetNum) { //See if the number is less then the genereated number, if soo put out a number
                    JOptionPane.showMessageDialog(null, "Wow you really are terrible at this, try again (you number is too low)");
                } else { //ANything else means that the number is correct, put out a statement
                    JOptionPane.showMessageDialog(null, "Good shit gang you got it!");
                }

            } catch (NumberFormatException e) { //Check for invalid inputs, use the built in "NumberFormatException". This will see if the user inputted a string while the inputted value should be a int
                JOptionPane.showMessageDialog(null, "Aww hell naw dawg you ass geekin, please enter a valid number big dawg"); //Put out a statement for invalid input
            }
        }
    }
}
