import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.ArrayList;

public class Patient {
    private String name;
    private String email;
    private String phone;
    private String address;
    private double tempurature;
    private ArrayList<Symptoms> symptoms;
//
//    public Patient(String name, String email, String phone, String address, double tempurature, ArrayList<String> symptoms) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//        this.tempurature = tempurature;
//        this.symptoms = new ArrayList<>();
//    }

    public Patient() {

    }

//    public Patient(String name, String email, String phone, String address, ArrayList<Symptoms> symptoms) {
//
//    }

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

    public ArrayList<Symptoms> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptoms> symptoms) {
        this.symptoms = symptoms;
    }

//    public void addSymptom(Symptoms symptoms){
//        if(this.symptoms.size() <=0){
//            this.symptoms = new ArrayList<>();
//        }
//        this.symptoms.add(symptoms);
//    }

    public String toString(){
        String retval = "--- Patient Information ---\n" + "\nName: " + this.getName() + "\nEmail Address: " + getEmail() +
                "\nPhone Number: " + getPhone() + "\nAddress: " + getAddress() + "\nTempurature: " + getTempurature() + "\n" +
                "\n--- Patients Symptoms ---\n" + this.getSymptoms();

            for (Symptoms symptoms: getSymptoms()){
                retval += symptoms.toString();
            }
        return retval;

    }
}

