class Student {
    int roll;
    String name;
    static String college = "VTU";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    static void changeCollege() {
        college = "IIT";
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "Aish");
        Student s2 = new Student(2, "Anu");

        s1.display();
        s2.display();
    }
}