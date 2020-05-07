import java.util.ArrayList;
import java.util.Scanner;

public class ScreeningApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Symptoms symptoms = new Symptoms();
        Contacted contacted = new Contacted();
        int numSymptoms = 0;
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

// Check patients temperature. Too high, too low, or normal temperature. Check for symptoms
        ArrayList<Symptoms> symptom = new ArrayList<>();

        if (patient.getTempurature() <= 95) {
            System.out.print("You're temperature is too low. \nHow many symptoms have you noticed? ");
            numSymptoms = sc.nextInt();
            for(int i = 1; i <= numSymptoms; i++){
                symptoms = new Symptoms();
                System.out.printf("Please enter symptom number %d: ", (i));
                enterSymptom = sc.nextLine();
                sc.next();

                symptoms.setSymptom(enterSymptom);
                symptom.add(symptoms);
            }
            patient.setSymptoms(symptom);
        } else if (patient.getTempurature() > 99) {
            System.out.print("You're temperature is too high. \nHow many symptoms have you noticed? ");
            numSymptoms = sc.nextInt();
                for(int i = 1; i <= numSymptoms; i++) {
                    symptoms = new Symptoms();
                    System.out.printf("Please enter symptom number %d: ", (i));
                    enterSymptom = sc.nextLine();
                    sc.next();

                    symptoms.setSymptom(enterSymptom);
                    symptom.add(symptoms);
                }
            patient.setSymptoms(symptom);
        } else {
            System.out.println("\nThank you! Your temperature seems to be normal, please stay quarantined at home for a minimum of 14 days. If you develop any symptoms, return immediately.\nHere are your updated documents. Please present this information at your next visit.\n");
        }
        patient.setSymptoms(symptom);

//Print patient information template from Patient.java
        System.out.println(patient.toString());
        System.out.println(symptoms.getSymptom());
    }
}
