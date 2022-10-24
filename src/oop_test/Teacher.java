package oop_test;

public class Teacher extends Person {
    // data fields
    private String contactNumber;
    private String department;
    
    // Constructors and Methods
    public Teacher(){}
    
    public Teacher(String name, int age){
        setName(name);
        setAge(age);
    }
    
    public Teacher(String name, int age, String contactNumber, 
            String department){
        setName(name);
        setAge(age);
        this.contactNumber = contactNumber;
        this.department = department;
    }
    
    public String getContactNumber(){return this.contactNumber;}
    public void setContactNumber(String newContact){
        this.contactNumber = newContact;
    }
    
    public String getDepartment(){return this.department;}
    public void setDepartment(String newDept){this.department = newDept;}
    
    public void printTeacher(){
        System.out.println("Name is            : " + getName());
        System.out.println("Age is             : " + getAge());
        System.out.println("Contact Number is  : " + this.contactNumber);
        System.out.println("Department is      : " + this.department);
    }
}
