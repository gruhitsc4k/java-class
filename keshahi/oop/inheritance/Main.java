class Person{
    String firstName, lastName;
    int age;

    Person(String fname, String lname, int age){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }

    public void display(){
        System.out.println("Student Name: " + this.firstName + " " + this.lastName);
        System.out.println("Age: " + this.age);
    }
}

class Student extends Person{
    // String firstName, lastName;
    // int age;
    int grade;
    double average;

    Student(String fname, String lname, int age, int grade, double average){
        super(fname, lname, age);
        this.grade = grade;
        this.average = average;

    }

    public void printStudent(){
        // super.display();
        display();
        System.out.println("Grade: " + this.grade);
        System.out.println("Average: " + this.average);
    }
}


public class Main{
    public static void main(String args[]){
        Student s1 = new Student("John", "Doe", 18, 12, 94);
        s1.printStudent();
    }
}