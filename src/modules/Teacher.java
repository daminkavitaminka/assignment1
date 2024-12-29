package modules;

public class Teacher extends Person {
    private String course;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, boolean gender, String course, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.course = course;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void giveRaise(int per){
        this.salary *= ((double) (per + 100) / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + this.getCourse() + " with salary: " + this.getSalary();
    }
}

