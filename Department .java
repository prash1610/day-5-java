public class Department {
    static String departmentName = "HR";
    String employeeName;

    public static void main(String[] args) {
        Department emp1 = new Department();
        emp1.employeeName = "John";

        Department emp2 = new Department();
        emp2.employeeName = "Alice";

        System.out.println("Department: " + Department.departmentName);
        System.out.println("Employee 1: " + emp1.employeeName);
        System.out.println("Employee 2: " + emp2.employeeName);

  
        Department.departmentName = "Marketing";

        System.out.println("\nAfter modification:");
        System.out.println("Department: " + Department.departmentName);
        System.out.println("Employee 1: " + emp1.employeeName);
        System.out.println("Employee 2: " + emp2.employeeName);
    }
}