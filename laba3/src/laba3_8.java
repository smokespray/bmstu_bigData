
public class laba3_8 {
    public static void main(String[] args) {
        Patient8 patient1 = new Patient8("Alex");
        Patient8 patient2 = new Patient8("Anton");
        Doctor doctor1 = new Doctor("doctor1");
        Doctor doctor2 = new Doctor("doctor2");

        Doctor.Drug arbidol = new Doctor.Drug("arbidol");
        Doctor.Operation reanimation = new Doctor.Operation("reanimation");

        doctor1.writePrescriptionDrug(arbidol, patient1);
        patient1.setCurrentlyInHospital();

        doctor2.doOperation(reanimation, patient2);
        patient2.setCurrentlyInHospital();

    }
}
