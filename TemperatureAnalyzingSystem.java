// Name : Amanjot Singh
// Date : February 18, 2024
// Description : This program will calculate the average temperature of the number of days that are being prompted-
// -by the user and in end will display that on which day was the highest and lowest temperature respectively.


import java.util.Scanner;
// Creating a main class for the program

public class TemperatureAnalyzingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        // Defining the 
        double[] highTemperatures = new double[365];
        double[] lowTemperatures = new double[365];
        double highestTemperature = -45;
        double lowestTemperature = 45;
        int highestDay = 0;
        int lowestDay = 0;
        double overallAverage = 0;
        int count = 0;


           // Prompting the user to enter the number of days.
        System.out.print("Enter number of days: ");
        while (true) {
            try {
                days = scanner.nextInt();
                // Displaying error message if the number of days doesn't lies between 1 and 365.
                if (days < 1 || days > 365) {
                    System.out.println("Error: Number of Days should be between 1 and 365.");
                } else {
                    break;
                }
                // If the input is not a number then an error message will be displayed.
            } catch (Exception e) {
                System.out.println("Error: Input should be a number");
            }
        }
// Prompting the user to enter the lowest temperature for the day.
        for (int i = 0; i < days; i++) {
            System.out.print("Enter the lowest temperature for day " + (i + 1) + ": ");
            while (true) {
                try {
                    lowTemperatures[i] = scanner.nextDouble();
                    // Display error message if the temperature entered isn't between -45 and 45.
                    if (lowTemperatures[i] < -45 || lowTemperatures[i] > 45) {
                        System.out.println("Error: Lowest temperature must be between -45 and 45.");
                    } else {
                        break;
                    }
                    // Displaying error if the input is not a number.
                } catch (Exception e) {
                    System.out.println("Error: Input should be a number.");
                }
            }
// Prompting the user to enter the hihest temperature of the day.
            System.out.print("Enter the highest temperature for day " + (i + 1) + ": ");
            while (true) {
                try {
                    highTemperatures[i] = scanner.nextDouble();
                    // Displaying error message if the highest temperature shouldn't lies between -45 and 45.
                    if (highTemperatures[i] < -45 || highTemperatures[i] > 45) {
                        System.out.println("Error: Highest temperature should lies between -45 and 45.");
                    } else {
                        break;
                    }
                    // Displaying the error message if the input is not a number.
                } catch (Exception e) {
                    System.out.println("Error: Input should be a number.");
                }
            }
// Displaying error message if the lowest temperature exceeds the higest temperature.
            if (lowTemperatures[i] > highTemperatures[i]) {
                System.out.println("Error: Lowest temperature cannot exceed the high temperature.");
                i--;
                
            }
        // Displaying the average temperature of the day.    
            double averageTemperature = (lowTemperatures[i] + highTemperatures[i]) / 2;
            System.out.println("The average temperature for day " + (i + 1) + " is " + String.format("%.2f", averageTemperature));

            if (lowTemperatures[i] < lowestTemperature) {
                lowestTemperature = lowTemperatures[i];
                lowestDay = i + 1;
            }

            if (highTemperatures[i] > highestTemperature) {
                highestTemperature = highTemperatures[i];
                highestDay = i + 1;
            }

            overallAverage += averageTemperature;
            count++;
        }
        // Displaying the overall average temperaute of all the days.
        System.out.println("The overall average temperature is " +  overallAverage / count);
        // Displaying the day having the lowest temperature.
        System.out.println("The day having the lowest temperature is " + lowestDay);
        // Displaying the day having the highest temperature.
        System.out.println("The day having the highest temperature is " + highestDay);
    }
}