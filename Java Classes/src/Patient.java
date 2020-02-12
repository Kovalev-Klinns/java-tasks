public class Patient {
    private int id;
    private String surname;
    private String firstName;
    private String secondName;
    private String address;
    private int phoneNumber;
    private int medCardNumber;
    private String diagnosis;

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + surname + ". Персональный id: " + id + ". Адрес: " + address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedCardNumber() {
        return medCardNumber;
    }

    public void setMedCardNumber(int medCardNumber) {
        this.medCardNumber = medCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}


