package oop_test;

public class OOP_Test {

    public static void main(String[] args) {
        
        // Creating two students
        Student student1 = new Student();
        Student student2 = new Student("Benjamin",17,"12T","Computer Science");
        
        System.out.println("Printing student2 info with printStudent() ");
        student2.printStudent();
        
        System.out.println("");
        System.out.println("Printing student2 info with printPerson() ");
        student2.printPerson();
        
        // Creating two teachers
        Teacher teacher1 = new 
        Teacher("Mr Bate", 30, "07984738923", "Mathematics");
        
        Teacher teacher2 = new Teacher();
        
        System.out.println("");
        System.out.println("Invoking printPeron() on teacher2");
        teacher2.printPerson();
        
        System.out.println("");
        Course course1 = new Course("Computer Science", teacher1);
        System.out.println("Invoking the printCourse() method");
        course1.printCourse();
        
    }
    
}
