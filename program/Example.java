
    public class Example {
    private static int staticVariable;

    // Static block
    static {
        staticVariable = 10;
        System.out.println("Static block executed. Value of staticVariable: " + staticVariable);
    }

    // Constructor with no parameters
    public Example() {
        System.out.println("Constructor without parameters called.");
    }

    // Constructor with a parameter
    public Example(int value) {
        staticVariable = value;
        System.out.println("Constructor with parameter called. Value of staticVariable: " + staticVariable);
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example(20);
    }
}


