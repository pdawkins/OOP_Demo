package oop_test;

public abstract class Person {
    // Data fields
    private String name = "John";
    private int age = 18;
    
    // Constructors and Methods
    public Person(){}
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){return this.name;}
    public void setName(String newName){this.name = newName;}
    
    public int getAge(){return this.age;}
    public void setAge(int newAge){this.age = newAge;}
    
    public void printPerson(){
        System.out.println("Name is : " + this.name);
        System.out.println("Age is  : " + this.age);
    }
}
