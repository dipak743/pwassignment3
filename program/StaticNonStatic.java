class Demo
{
static int a;
static int b;
int m;
int n;
static{
    a=10;
    b=20;
}

{
m=15;
n=25;
}
static void  display()
{
    System.out.println(a);
    System.out.println(b);
}
void display1()
{
    System.out.println(m);
    System.out.println(n);
}
}
public class StaticNonStatic {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.display1();
        Demo.display();
    }
}
