import java.util.ArrayList;

// Main Class
public class Main {
    public static void main(String[] args) {

        // ArrayList of Parent Type
        ArrayList<UniversityMember> members = new ArrayList<>();

        // Upcasting
        members.add(new Professor(
                101,
                "Dr. Rahman",
                90000,
                "Computer Science",
                "Artificial Intelligence",
                25
        ));

        // Upcasting
        members.add(new AdministrativeOfficer(
                102,
                "Mr. Karim",
                50000,
                "Accounts"
        ));

        // Upcasting
        members.add(new Employee(
                103,
                "Sabbir",
                35000
        ));

        // Dynamic Binding
        System.out.println("=== Dynamic Binding ===");

        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty();
            System.out.println();
        }

        // Safe Downcasting
        System.out.println("=== Downcasting ===");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                // Downcasting
                Professor p = (Professor) member;

                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}