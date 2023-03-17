import java.time.LocalDateTime;
import java.util.Date;

public class Patient8 {
    String name;
    private boolean currentlyInHospital = false;
    LocalDateTime arrivalDate;

    public String getName() {
        return name;
    }

    public void setCurrentlyInHospital() {
        currentlyInHospital = !currentlyInHospital;
        if (currentlyInHospital) {
            System.out.println("Patient - " + name + " has arrived at hospital");
        } else {
            System.out.println("Patient - " + name + " has left the hospital");
        }
    }

    public Patient8(String name) {
        this.name = name;
        setCurrentlyInHospital();
        arrivalDate = LocalDateTime.now();
    }
}
