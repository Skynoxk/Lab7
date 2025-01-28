package Ex2;
abstract class Person {
    int age;
    String name;
    Person (int age , String name){
        this.age = age;
        this.name = name;
    }
    abstract void displayDetail();
}
class Student extends Person{
    int yearStudy;
    Student (String name, int age, int yearStudy){
        super(age, name);
        this.yearStudy = yearStudy;
    }
    @Override 
    void displayDetail (){
        System.out.println("Name : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Year of studying : " + yearStudy);
        System.out.println("=====================");
    }
}
class Teacher extends Person{
    double salary;
    Teacher (String name, int age, double salary){
        super(age, name);
        this.salary = salary;
    }
    @Override 
    void displayDetail (){
        System.out.println("Name : " + name);
        System.out.println("Age is : " + age);
        System.out.println("The salary is : " + salary + "$");
        System.out.println("=====================");
    }
}
public class Exercis2{
    public static void main(String[] args) {
        Student M = new Student("bopha", 23,3);
        Teacher T = new Teacher("Sun", 56,450);

        M.displayDetail();
        T.displayDetail();
    }
}

