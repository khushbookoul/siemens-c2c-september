class Student:
    def __init__(self):
        print("Student initialized")

    def display(self):
        print("Student display method")

class EngineeringStudent(Student):
    def __init__(self):
        super().__init__()
        print("Engineering student class ready!")

    def display(self):
        print("Engineering student display")

    def example(self):
        print("Example from child class")


if __name__ == "__main__":
    obj = EngineeringStudent()

    obj.example()

    obj.display()