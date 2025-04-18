package lib;

public class EmployeeInformation {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;
    private boolean isForeigner;
    private Gender gender;

    public EmployeeInformation(String employeeId, String firstName, String lastName, String idNumber, String address,
            boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    public String getEmployeeId() {
        return employeeId;
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

    public boolean isForeigner() {
        return isForeigner;
    }

    public Gender getGender() {
        return gender;
    }
}
