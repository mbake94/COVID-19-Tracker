import java.util.ArrayList;
import java.util.Random;

public class Patient {
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean test;
    private double tempurature;
    private ArrayList<Patient> symptoms;


    public Patient(String name, String email, String phone, String address, double tempurature, boolean test, ArrayList<Patient> symptoms) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.tempurature = tempurature;
        this.test = test;
        this.symptoms = symptoms;
    }

    public Patient() {

    }

    public Patient(String name, String email, String phone, String address, boolean test, ArrayList<String> symptoms) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTempurature() {
        return tempurature;
    }

    public void setTempurature(double tempurature) {
        this.tempurature = tempurature;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public ArrayList<Patient> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Patient> symptoms) {
        this.symptoms = symptoms;
    }

    public String toString(){
        String retval = "--- Patient Information ---\n" + "\nName: " + getName() + "\nEmail Address: " + getEmail() +
                "\nPhone Number: " + getPhone() + "\nAddress: " + getAddress() + "\nTempurature: " + getTempurature() + "\n" +
                "\n--- Patients Symptoms ---\n" + getSymptoms() ;
        return retval;
    }
}

