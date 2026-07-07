// Child Class of Employee
class AcademicStaff extends Employee {
    protected String department;

    // Constructor
    public AcademicStaff(int memberId, String name,
                         double salary, String department) {

        super(memberId, name, salary);
        this.department = department;
    }

    // Method
    public void showDepartment() {
        System.out.println("Department: " + department);
    }

    // Method Overriding
    @Override
    public void performDuty() {
        System.out.println(name + " teaches students.");
    }
}