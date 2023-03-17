public class Patient {
    String surname, name, secondName, address;
    int telephoneNumber, medicalCardNumber;
    Diagnosis diagnosis;

    public Patient(String surname, String name, String secondName, String address, int telephoneNumber, int medicalCardNumber, Diagnosis diagnosis) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis=" + diagnosis +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
}
