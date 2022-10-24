package oop_test;

public class Course {
    // Data fields
    private String name;
    private Teacher teacher;
    
    // Constructors and Methods
    public Course(){}
    public Course(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }
    
    public String getName(){return this.name;}
    public void setName(String newName){this.name = newName;}
    
    public Teacher getTeacher(){return this.teacher;}
    public void setTeacher(Teacher newTeach){this.teacher = newTeach;}
    
    public void printCourse(){
        System.out.println("Name is    : " + this.name);
        System.out.println("Teacher of the course info : ");
        this.teacher.printTeacher();
    }
}
