package oop_test;

public class Student extends Person{
    // data fields
    private String form;
    private String favouriteSubject;
    
    //Constructors and Methods
    public Student(){}
    
    public Student(String name, int age){
        setName(name);
        setAge(age);
    }
    
    public Student(String name, int age, String form, String favSub){
        setName(name);
        setAge(age);
        this.form = form;
        this.favouriteSubject = favSub;
    }
    
    public String getForm(){return this.form;}
    public void setForm(String newForm){this.form = newForm;}
    
    public String getSubjet(){return this.favouriteSubject;}
    public void setSubject(String newSub){this.favouriteSubject = newSub;}
    
    public void printStudent(){
        System.out.println("Name is    : " + getName());
        System.out.println("Age is     : " + getAge());
        System.out.println("Form is    : " + this.form);
        System.out.println("Fav Sub is : "+ this.favouriteSubject);
    }
}
