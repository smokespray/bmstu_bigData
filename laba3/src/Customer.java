import java.time.LocalDate;

public class Customer {
    String surname, name, fatherName;
    int creditNumber, bankNumber;

    public Customer(String surname, String name, String fatherName, int creditNumber, int bankNumber) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.creditNumber = creditNumber;
        this.bankNumber = bankNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", creditNumber=" + creditNumber +
                ", bankNumber=" + bankNumber +
                '}';
    }
}
