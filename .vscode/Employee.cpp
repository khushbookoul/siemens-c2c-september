#include<iostream>

class Employee {
    private:
        std::string employeeId;
        std::string employeeName;
        int employeeAge;
        std::string employeeLocation;


    public:
        //a parameterized constructor that takes 4 arguments
        Employee(std::string employeeId, std::string employeeName, int employeeAge, std::string employeeLocation)
        : employeeId(employeeId), employeeAge(employeeAge), employeeName(employeeName) {}


        //a parameterized constructor that takes 3 arguments
        Employee(std::string employeeId, std::string employeeName, int employeeAge) {
            this->employeeId = employeeId;
            this->employeeName = employeeName;
            this->employeeAge = employeeAge;
        }

 
        //diabling copy constructor
        Employee(const Employee& obj) = delete;


        //zero argument constructor

        //defaulted default constructor 
        Employee()=default;

        //move constructor
        Employee(Employee&&  obj ) = default;



};
