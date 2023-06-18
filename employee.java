package cO2;
import java.util.Scanner;
public class employee {
    int eNo;
    String eName;
    double eSalary;
    public employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    public int getENo() {
        return eNo;
    }
    public String getEName() {
        return eName;
    }
    public double getESalary() {
        return eSalary;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();
        employee[] emp = new employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("------------ Enter information for employee "+(i + 1)+"-----------");
            System.out.print("Employee number: ");
            int eNo = in.nextInt();
            System.out.print("Employee name: ");
            String eName = in.next();
            System.out.print("Employee salary: ");
            double eSalary = in.nextDouble();
            employee employee = new employee(eNo, eName, eSalary);
            emp[i] = employee;
        }
        System.out.println("-----------------------------------------");
        System.out.print("Enter employee number of the employee to search: ");
        int empNo = in.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            employee employee = emp[i];
            if (employee.getENo() == empNo) {
                System.out.println("Employee number: " + employee.getENo());
                System.out.println("Employee name: " + employee.getEName());
                System.out.println("Employee salary: " + employee.getESalary());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }
}