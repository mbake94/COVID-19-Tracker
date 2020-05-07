import java.util.ArrayList;

public class Contacted extends Patient {
    public Contacted() {

    }
    public Contacted(String name, String email, String phone, String address, boolean test, ArrayList<String> symptoms) {
        super(name, email, phone, address, test, symptoms);
    }


}
