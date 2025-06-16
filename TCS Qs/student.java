public class student {
    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student{
    public static void main(String[] args) {
        student s1 = new student("Alice", 20);
        student s2 = new student("Bob", 22);

        System.out.println("Student 1: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + ", Age: " + s2.getAge());
    }
}