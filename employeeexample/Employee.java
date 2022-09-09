package employeeexample;

import java.util.Scanner;

public abstract class Employee implements EmployeeFunctionalities {
    
    private String employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeLocation;

    public Employee(String employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    //a parameterized constructor that takes 3 arguments
    public Employee(String employeeId, String employeeName, int employeeAge) {
        this(employeeId,employeeName);
        this.employeeAge = employeeAge;
    }

    //a parameterized constructor that takes 4 arguments
    public Employee(String employeeId, String employeeName, int employeeAge, String employeeLocation) {
        this(employeeId, employeeName, employeeAge); //use this class's 3 argument constructor
        this.employeeLocation = employeeLocation;
    }

    //copy constructor
    public Employee(  Employee obj  ){
        //the employee for currently instantiating object is equal to obj's employeeAge data value
        this.employeeAge = obj.employeeAge;
        this.employeeName = obj.employeeName;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new location : ");
        this.employeeLocation = sc.nextLine();
        sc.close();

    }

    abstract void changeName();

    

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return this.employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeLocation() {
        return this.employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", employeeName='" + getEmployeeName() + "'" +
            ", employeeAge='" + getEmployeeAge() + "'" +
            ", employeeLocation='" + getEmployeeLocation() + "'" +
            "}";
    }



}
