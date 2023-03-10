package homeWork5;

import java.util.ArrayList;

public class Main {


    public static void main (String[] args) {
        Person p1 = new Person("Bob", 11, true);
        Person p2 = new Person("Smith", 12, true);
        Student st1 = new Student("Jane", 23, false, 5.4);
        Student st2 = new Student("Sarah", 24, false, 5.5);
        Employee em1 = new Employee("John", 20, true, 100);
        Employee em2 = new Employee("Peter", 17, true, 100);


        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(st1);
        list.add(st2);
        list.add(em1);
        list.add(em2);
        if (list.contains(p1)) {
            p1.showPersonInfo();
        }
        if (list.contains(p2)) {
            p2.showPersonInfo();
        }
        if (list.contains(st1)) {
            st1.showStudentInfo();
        }
        if (list.contains(st2)) {
            st2.showStudentInfo();
        }
        if (list.contains(em1)) {
            em1.showEmployeeInfo();
            em1.calculateOvertime(2);
        }
        if (list.contains(em1)) {
            em2.showEmployeeInfo();
            em2.calculateOvertime(2);
        }


        /*Person[] persons = new Person [10]; /OPTION TWO!!!/
            persons [0] = new Person (p1.name, p1.age, p1.isMan);
            persons [1] = new Person(p2.name, p2.age, p2.isMan);
            persons [2] = new Student(st1.name, st1.age, st1.isMan, st1.score);
            persons [3] = new Student(st2.name, st2.age, st2.isMan, st2.score);
            persons [4] = new Employee(em1.name, em1.age, em1.isMan, em1.daySalary);
            persons [5] = new Employee(em2.name, em2.age, em2.isMan, em2.daySalary);
            //Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= persons.length-1; i++){
            persons [i] = p1;

            //System.out.println(p1.showPersonInfo());
            persons[i] = p2;
            //p2.showPersonInfo();

            persons[i] = st1;
            //st1.showStudentInfo();

            persons[i] = st2;
            //st2.showStudentInfo();

            persons[i] = em1;
            //em1.showEmployeeInfo();
            //em1.calculateOvertime(1);

            persons[i] = st2;
            //em2.showEmployeeInfo();
            //em2.calculateOvertime(1);
            //break;

        }
       /* p1.showPersonInfo();
        p2.showPersonInfo();
        st1.showStudentInfo();
        st2.showStudentInfo();
        em1.showEmployeeInfo();
        em1.calculateOvertime(1);
        em2.showEmployeeInfo();
        em2.calculateOvertime(1);*/

    }
}









