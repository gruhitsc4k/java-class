public class Student{
    // Member Variables
    String name;
    int age;
    double grade;

    // Member methods
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }


    public static void main(String[] args){
        Student student1 = new Student(); // A new student is created.
        
        // object_name.variable_name

        // Setting the values for variables
        student1.name = "John Doe";
        student1.age = 14;
        student1.grade = 94.5;

        student1.printInfo();

        Student student2 = new Student();

        student2.name = "Patrik Adam";
        student2.age = 15;
        student2.grade = 99;

        student2.printInfo();
    }
}