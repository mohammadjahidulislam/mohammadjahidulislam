// Child Class
class Employee extends UniversityMember {
    protected double salary;

    // Constructor
    public Employee(int memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }

    // Method
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method Overriding
    @Override
    public void performDuty() {
        System.out.println(name + " performs general employee duties.");
    }
}