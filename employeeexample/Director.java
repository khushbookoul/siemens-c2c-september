package employeeexample;

import java.util.Scanner;

public class Director extends Employee{
    private Department[] directorDepartments;

    //for id, name & array of departments
    public Director(String employeeId, String employeeName, Department[] directorDepartments) {
        
        super(employeeId, employeeName);
        this.directorDepartments = directorDepartments;
    }


    //id,name,age & array of departments
    public Director(String employeeId, String employeeName, int employeeAge,  Department[] directorDepartments){
        super(employeeId, employeeName, employeeAge);    
        this.directorDepartments = directorDepartments;
    }


    //for id,name,age,location & array of departments
    public Director(String employeeId, String employeeName, int employeeAge, String employeeLocation, Department[] directorDepartments) {
        super(employeeId, employeeName, employeeAge, employeeLocation);

        this.directorDepartments = directorDepartments;
    }


    public Department[] getDirectorDepartments() {
        return this.directorDepartments;
    }

    public void setDirectorDepartments(Department[] directorDepartments) {
        this.directorDepartments = directorDepartments;
    }



    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeeLocation='" + getEmployeeLocation() + "'" +
            " directorDepartments='" + getDirectorDepartments() + "'" +
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
        // TODO Auto-generated method stub
        
    }

}
