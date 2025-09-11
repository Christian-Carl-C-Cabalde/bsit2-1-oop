public class Main {
    public static void main (String[]args){
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===\n");

        Manager manager = new Manager ("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);

        System.out.println("\n=== EMPLOYEE DETAILS ===");
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly salary: $" + manager.calculateSalary());


        System.out.println("\n=== EMPLOYEE DETAILS ===");
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly salary: $" + developer.calculateSalary());



        System.out.println("\n=== EMPLOYEE DETAILS ===");
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly salary: $" + intern.calculateSalary());

    }
}
