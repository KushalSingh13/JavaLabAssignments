ProgrammingAssigments1.java
2022BIT062 

import java.util.HashSet;
import java.util.Set;

public class ValidRegistrationCount {
    public static int countValidRegistrationNumbers(String[] registrationNumbers) {
        Set<String> validDepartments = new HashSet<>();
        validDepartments.add("CSE");
        validDepartments.add("INFT");
        validDepartments.add("CHE");
        validDepartments.add("MECH");

        int validCount = 0;

        for (String regNumber : registrationNumbers) {
            // Extract year, department ID, and sequence number from the registration number
            String year = regNumber.substring(0, 4);
            String department = regNumber.substring(4, 7);
            String sequence = regNumber.substring(7);

            // Check if department ID is valid
            if (validDepartments.contains(department)) {
                validCount++;  // Increment count if valid
            }
        }

        return validCount;
    }

    public static void main(String[] args) {
        String[] registrationNumbers = {"2023CSE001", "2024INFT002", "2022CHE003", "2021MECH004", "2025EC001"};
        int validCount = countValidRegistrationNumbers(registrationNumbers);
        System.out.println("Count of valid registration numbers: " + validCount);  // Output: 4
    }
}