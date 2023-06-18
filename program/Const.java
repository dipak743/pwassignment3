class Student
{
    private int age;
    private String name;

    Student()
    {
        this(2,"guru");
        age=16;
        name="deepak";
    }
    Student(String name)
    {
        this.name=name;
        age=14;
    }
    Student(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
    static void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Const {
    public static void main(String[] args) {
        
    
    Student obj=new Student();
    
    Student obj1=new Student("umang");
    Student obj2=new Student(8,"aman");
    
    obj.display();
    obj1.display();
    obj2.display();
    }
    
    
}
