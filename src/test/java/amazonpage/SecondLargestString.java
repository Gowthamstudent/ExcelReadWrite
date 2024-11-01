package amazonpage;

public class SecondLargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I Love Leelavathy LeelaGowtham";

        // Step 1: Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Variables to track the largest and second largest words
        String largest = "";
        String secondLargest = "";

        // Step 2: Loop through the words to find the largest and second largest
        for (String word : words) {
            if (word.length() > largest.length()) {
                // Update secondLargest and largest
                secondLargest = largest;
                largest = word;
            } else if (word.length() > secondLargest.length() && !word.equals(largest)) {
                // Update secondLargest
                secondLargest = word;
            }
        }

        // Step 3: Output the result
        if (secondLargest.isEmpty()) {
            System.out.println("There is no second largest word.");
        } else {
            System.out.println("The second largest word is: " + secondLargest);
        }
    }
}
