package homeWork5;
public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }
    public void showStudentInfo () {

        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The person is male: " + isMan);
        System.out.println("The score is: " + score);

    }
}
