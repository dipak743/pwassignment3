

class Student
{
    private int age;
    private String name;
    void SetName(String name){
        this.name=name;
    }
    void SetAge(int age){
        this.age=age;
    }
    String GetName()
    {
        return name;
    }
    int GetAge()
    {
        return age;
    }
        
    void display()
    {
        System.out.println(age);
        System.out.println(name);
    }

}
public class SetterGetter {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.SetName("guru");
        obj.SetAge(4);
        obj.GetName();
        obj.GetAge();
        
        obj.display();
    }
}
