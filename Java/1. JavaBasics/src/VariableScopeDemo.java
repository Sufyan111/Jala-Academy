public class VariableScopeDemo {
    int myVariable = 10; // global variable

    public static void main(String[] args) {
        int myVariable = 5; // local variable

        System.out.println("Local variable: " + myVariable);

        VariableScopeDemo obj = new VariableScopeDemo();
        System.out.println("Global variable: " + obj.myVariable);
    }
}
