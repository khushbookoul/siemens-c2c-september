package employeeexample;

public class ManagerWithHours extends Manager {
    int managerAverageHours;


    public ManagerWithHours(String employeeId, String employeeName,int managerTeamSize, int managerAverageHours) {    

        super(employeeId, employeeName, managerTeamSize);        
        this.managerAverageHours = managerAverageHours;
    }

    public ManagerWithHours(String employeeId, String employeeName, int employeeAge, int managerTeamSize, int managerAverageHours){
        super(employeeId, employeeName, employeeAge, managerTeamSize);        
        this.managerAverageHours = managerAverageHours;
    }

    public ManagerWithHours(String employeeId, String employeeName, int employeeAge, String employeeLocation, int managerTeamSize, int managerAverageHours) {
        super(employeeId, employeeName, employeeAge, employeeLocation, managerTeamSize);
        this.managerAverageHours = managerAverageHours;
    }

}
