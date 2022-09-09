package employeeexample;

import java.util.Scanner;

public class Manager extends Employee {
    

    private int managerTeamSize;



    public Manager(String employeeId, String employeeName,int managerTeamSize) {    
        super(employeeId, employeeName);
        
        this.managerTeamSize = managerTeamSize;
    }

    public Manager(String employeeId, String employeeName, int employeeAge, int managerTeamSize){
        super(employeeId, employeeName, employeeAge);
        
        this.managerTeamSize = managerTeamSize;
    }

    public Manager(String employeeId, String employeeName, int employeeAge, String employeeLocation, int managerTeamSize) {
        super(employeeId, employeeName, employeeAge, employeeLocation);

        this.managerTeamSize = managerTeamSize;
    }



    public int getManagerTeamSize() {
        return this.managerTeamSize;
    }

    public void setManagerTeamSize(int managerTeamSize) {
        this.managerTeamSize = managerTeamSize;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeeLocation='" + getEmployeeLocation() + "'" +
            " managerTeamSize='" + getManagerTeamSize() + "'" +
            "}";
    }

    @Override
    void changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new Name: ");
        this.setEmployeeName(sc.nextLine());
        sc.close();
        
    }

    @Override
    public void checkAttendance() {
        System.out.println("Check attendance for you & your team");
        
    }

    @Override
    public void applyForLeaves() {
        System.out.println("Your leave will be granted by you only!");
        
    }

    
}
