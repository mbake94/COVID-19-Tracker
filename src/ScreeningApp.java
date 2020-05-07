import java.util.ArrayList;
import java.util.Scanner;

public class ScreeningApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Contacted contacted = new Contacted();
        int numSymptoms = 0;
        ArrayList<String> symptom = new ArrayList<>();
        String enterSymptom;

// Prompt the patient for information
        System.out.print("Please enter your name: ");
        patient.setName(sc.nextLine());

        System.out.print("Please enter your Email Address: ");
        patient.setEmail(sc.nextLine());

        System.out.print("Please enter your phone number? ");
        patient.setPhone(sc.nextLine());

        System.out.print("Please enter your Address (City, State): ");
        patient.setAddress(sc.nextLine());

        System.out.print("What is is your current temperature? ");
        patient.setTempurature(sc.nextInt());

// Check patients temperature. Too high, too low, or normal temperature.
        if (patient.getTempurature() <= 95) {
            System.out.print("You're temperature is too low. \nHow many symptoms have you noticed? ");
            numSymptoms = sc.nextInt();
            for(int i = 0; i <= numSymptoms; i++){
                System.out.printf("Please enter symptom number %d: ", (i+1));
                enterSymptom = sc.nextLine();
                symptom.add(enterSymptom);
            }
        } else if (patient.getTempurature() >= 99) {
            System.out.print("You're temperature is too high. \nHow many symptoms have you noticed? ");
            numSymptoms = sc.nextInt();
                for(int i = 0; i <= numSymptoms; i++) {
                    System.out.printf("Please enter symptom number %d: ", (i + 1));
                    enterSymptom = sc.nextLine();
                    symptom.add(enterSymptom);
                }
        } else {
            System.out.println("\nThank you! Your temperature seems to be normal, please stay quarantined a home for at least 14 days. If you develop any symptoms, please come back immediately.\nHere is your updated information for future references.\n");
        }
//Print patient information template from Patient.java
        System.out.println(patient.toString());
    }
}
