package examples;

/**
 * InnerMain
 */
class Student {

    void Display(){
        System.out.println("Student class display method");
    }
    
}

class EngineeringStudent extends Student{
    void Display(){
        System.out.println("Engineering class display method");
    }

    void example(){
        System.out.println("THIS IS EXAMPLE FROM CHILD");
    }
}



public class Main {
    public static void main(String[] args) throws InterruptedException {

        EngineeringStudent  es1 = new EngineeringStudent(); //constructor????????????

        Student     st1 = new Student(); //parent class constuctor

        //store the reference of engineeringstudent object in a Student type variable
        Student est1      = new EngineeringStudent();


        //harshit purchased a new vehicle


        //harshit purchased a car



    }
}
