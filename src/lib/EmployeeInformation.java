package lib;

public class EmployeeInformation {
    private String employeeId;
    private PersonalInformation personalInformation;
    private boolean isForeigner;
    private Gender gender;

    public EmployeeInformation(String employeeId, PersonalInformation personalInformation,
            boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.personalInformation = personalInformation;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public Gender getGender() {
        return gender;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }
}
