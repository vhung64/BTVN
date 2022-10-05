package B3;

public class Student {
    public String fullName;
    public int age;
    public int GPA;

    public Student(String fullName, int age, int GPA){
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }
    Student(){
        
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int gPA) {
        GPA = gPA;
    }

    @Override
    public String toString(){
        return "Student{"+
            "fullName='"+ fullName + '\'' + "\t"+
            ", age = " + age + " , \t GPA = " + GPA + "}";
    }
}

