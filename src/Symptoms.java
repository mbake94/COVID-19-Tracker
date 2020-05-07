import java.util.ArrayList;

public class Symptoms {
    private String symptom;

    public Symptoms(){

    }
    public Symptoms(String symptom){
        this.symptom = symptom;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }


    public String toString(){
        String returnValue = getSymptom();
        return returnValue;
    }
}


