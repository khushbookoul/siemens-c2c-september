package basics;
public class Student {
    //id,name,age,gender,course

    private String studentId;
    private String studentName;
    private int studentAge;
    private Gender studentGender;
    private String studentCourseName;


    public Student(String studentId, String studentName, int studentAge, Gender studentGender, String studentCourseName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentCourseName = studentCourseName;
    }


    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Gender getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(Gender studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentCourseName() {
        return this.studentCourseName;
    }

    public void setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
    }


    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", studentName='" + getStudentName() + "'" +
            ", studentAge='" + getStudentAge() + "'" +
            ", studentGender='" + getStudentGender() + "'" +
            ", studentCourseName='" + getStudentCourseName() + "'" +
            "}";
    }

}
