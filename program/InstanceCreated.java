public class InstanceCreated {
   static int count=0;
    InstanceCreated()
    {
      count++;
    }
    static int display()
    {
        return count;
    }
    public static void main(String[] args) {
        InstanceCreated obj=new InstanceCreated();
        InstanceCreated obj1=new InstanceCreated();
        InstanceCreated obj2=new InstanceCreated();
        System.out.println(InstanceCreated.display());
    }
}
