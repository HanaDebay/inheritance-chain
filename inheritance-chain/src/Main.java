import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person man = new Man("Abel", 36);
        Person workerMan = new WorkerMan("Daniel",27,2000,8);
        Person workerWoman = new WorkerWoman("Sara", 22,3000,10);
        Person woman = new Woman("Saron",36);
        workerMan.work();
        workerWoman.work();
        List<Person> personList = new ArrayList<>();
        personList.add(man);
        personList.add(workerMan);
        personList.add(workerWoman);
        personList.add(woman);
        for(Person person: personList){
            System.out.println(person);
        }
    }
}
//2- Create inheritance chain.
//Create abstract Person Class and inherit that by Man class then inherit that Man by WorkerMan.
//Inherit Person by Woman then inherit Women by WomanWorker.
//Each class should have function: printNameAndType
//Create main function, in the main function create 6-7-8
// people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)
//3 - Add working hours to worker classes and add a work() function.
// when we run work function we should see: "Name worked .. hours"
//All the objects will define by Person(Person objName = new Man();)
// somehow try to run work functions from the object that you created from Worker classes.
abstract class Person{
    String name;
    int age;
    String gender;
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void printNameAndType(){
        System.out.println("Name: "+name + " Type"+ this.getClass().getTypeName());
    }
    void work(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
class Man extends Person{
    public Man(String name, int age){
        super(name,age,"Male");

    }
    @Override
    void printNameAndType(){
        System.out.println("Man: "+name + " Type"+ this.getClass().getTypeName());
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                "} ";
    }
}
class WorkerMan extends Man{
    double salary;
    int workHours;
    public WorkerMan(String name, int age, double salary, int workHours){
        super(name,age);
        this.salary = salary;
        this.workHours = workHours;

    }
    public void work(){
        System.out.println(name + " Works: "+ workHours + " Hours");
    }
    @Override
    void printNameAndType(){
        System.out.println("WorkerMan: "+name + " Type"+ this.getClass().getTypeName());
    }

    @Override
    public String toString() {
        return "WorkerMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                "} " ;
    }
}
class Woman extends Person{
    public Woman(String name, int age){
        super(name,age,"Female");
    }
    @Override
    void printNameAndType(){
        System.out.println("Woman: "+name + " Type"+ this.getClass().getTypeName());
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                "} ";
    }
}
class WorkerWoman extends Woman{
    double salary;
    int workHours;
    public WorkerWoman(String name, int age, double salary, int workHours){
        super(name, age);
        this.salary = salary;
        this.workHours = workHours;
    }
    void work(){
        System.out.println(name + " Works: "+ workHours + " Hours");
    }
    @Override
    void printNameAndType(){
        System.out.println("WorkerWoman: "+name + " Type"+ this.getClass().getTypeName());
    }

    @Override
    public String toString() {
        return "WorkerWoman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                "} ";
    }
}