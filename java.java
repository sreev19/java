// Basic Java Program to Calculate the Average of an Array and Check if It's Above a Threshold

public class BasicJavaProgram {

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    // Method to check if the average is above a threshold
    public static void checkThreshold(double average, double threshold) {
        if (average > threshold) {
            System.out.println("The average is above the threshold.");
        } else if (average < threshold) {
            System.out.println("The average is below the threshold.");
        } else {
            System.out.println("The average is equal to the threshold.");
        }
    }

    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the average
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);

        // Define a threshold
        double threshold = 30.0;

        // Check if the average is above the threshold
        checkThreshold(average, threshold);
    }
}
