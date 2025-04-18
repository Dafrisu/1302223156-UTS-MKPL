package lib;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    public PersonalInformation(String firstName, String lastName, String idNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }
}
