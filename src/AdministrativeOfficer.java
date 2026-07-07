// Another Child Class of Employee
class AdministrativeOfficer extends Employee {
    private String officeSection;

    // Constructor
    public AdministrativeOfficer(int memberId, String name,
                                 double salary, String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    // Method Overriding
    @Override
    public void performDuty() {
        System.out.println(name +
                " manages university administrative activities.");
    }
}