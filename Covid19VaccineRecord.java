// Name - Amanjot Singh
// Date - 11 March, 2024
// Description - Created a java console application  that will show the records of the covid19 vaccines and their data.
// Document Name - Covid19VaccineRecord.java

import java.util.Date;

class Vaccine {
    private int vaccineId;
    private String vaccineName;
    private double unitCost;
    private int availableUnits;
    private Date expiryDate;
    private String specialInstructions;

    // Constructor
    public Vaccine() {
        // Choosing the default values
        this.vaccineId = 0;
        this.vaccineName = "Default Vaccine";
        this.unitCost = 0.0;
        this.availableUnits = 0;
        this.expiryDate = new Date();
        this.specialInstructions = "Handle the vaccine with care";
    }

    // Parameters
    public Vaccine(int vaccineId, String vaccineName, double unitCost, int availableUnits, Date expiryDate, String specialInstructions) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.unitCost = unitCost;
        this.availableUnits = availableUnits;
        this.expiryDate = expiryDate;
        this.specialInstructions = specialInstructions;
    }
    
    public int getvaccineId() {
        return vaccineId;
    }

    public void setvaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getvaccineName() {
        return vaccineName;
    }

    public void setvaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public double getunitCost() {
        return unitCost;
    }

    public void setunitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getvailableUnits() {
        return availableUnits;
    }

    public void setavailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public Date getexpiryDate() {
        return expiryDate;
    }

    public void setexpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getspecialInstructions() {
        return specialInstructions;
    }

    public void setspecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Display the Function
    public void display(boolean inTableFormat) {
        if (inTableFormat) {
            // Displaying the function in the table format
            System.out.printf("%-5s| %-15s| %-10s| %-5s| %-10s| %-20s%n", "SKU", "Vaccine Name", "Unit Cost", "Quantity", "Expiry Date", "Special Instructions");
            System.out.printf("%-5s| %-15s| %-10f| %-5d| %-10tF| %-20s%n", vaccineId, vaccineName, unitCost, availableUnits, expiryDate, specialInstructions);
        } else {
            // Displaying the function in non-linear format
            System.out.println("SKU: " + vaccineId);
            System.out.println("Vaccine Name: " + vaccineName);
            System.out.println("Unit Cost: " + unitCost);
            System.out.println("Quantity on hand: " + availableUnits);
            System.out.println("Expiry Date: " + expiryDate);
            System.out.println("Special Instructions: " + specialInstructions);
        }
    }
}

public class Covid19VaccineRecord {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Creating a defualt empty vaccine
        Vaccine emptyVaccine = new Vaccine();

        // Displaying the values of empty vaccine in a non-linear format
        System.out.println("Empty Vaccine Details:");
        emptyVaccine.display(false);

        // Using the setters for adding values in the empty vaccine
        emptyVaccine.setvaccineId(1);
        emptyVaccine.setvaccineName("COVID19 JN.1");
        emptyVaccine.setunitCost(50.0);
        emptyVaccine.setavailableUnits(5000);
        emptyVaccine.setexpiryDate(new Date(2022, 14, 15));
        emptyVaccine.setspecialInstructions("Store in a cool and dry place");

        // Displaying the values of the modified Vaccine in a non-linear format
        System.out.println("\nDetails of the modified vaccine:");
        emptyVaccine.display(false);

        // Creating two vaccines
        Vaccine vaccine1 = new Vaccine(2, "COVID19 JN.19 NovaVax", 44.0, 4000, new Date(2024, 5, 24), "Handle the vaccine with caution");
        Vaccine vaccine2 = new Vaccine(3, "COVID19 JN.1 BioNtech", 56.0, 6000, new Date(2024, 6, 30), "Keep vaccine refrigerated");

        // Creating an array of vaccines
        Vaccine[] vaccinesArray = {emptyVaccine, vaccine1, vaccine2};
        
        // Using the array of the vaccines to display the vaccines in a table format
        System.out.println("\nDetails of all Vaccines in a Table Format :");
        for (Vaccine vaccine : vaccinesArray) {
            vaccine.display(true);
        }
    }
}