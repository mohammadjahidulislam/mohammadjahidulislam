// Abstract Parent Class
abstract class UniversityMember {
    protected int memberId;
    protected String name;

    // Constructor
    public UniversityMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Display Basic Information
    public void displayBasicInfo() {
        System.out.println("ID: " + memberId);
        System.out.println("Name: " + name);
    }

    // Abstract Method
    abstract void performDuty();
}