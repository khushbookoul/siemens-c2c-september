abstract class Employee{
    private float employeeSalary;

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    abstract float  calculateBonus();
    abstract float calculateBonus(float performanceFactor);

}


class Manager extends Employee{

    @Override
    float calculateBonus() {
        return 0.1f * this.getEmployeeSalary();
    }


    @Override
    float calculateBonus(float performanceFactor){
        return (0.1f + performanceFactor) * this.getEmployeeSalary();
    }
    

}

public class polymorphism {
    public static void main(String[] args) {
        Employee obj;


        obj = new Manager();

        obj.calculateBonus();

        obj.calculateBonus(0.2f);
    }
}
