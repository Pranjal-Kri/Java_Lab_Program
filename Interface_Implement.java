// declare the interfaces
interface subtraction {
    void sub(int a, int b);
}

interface addition {
    void add(int a, int b);
}

class operate implements subtraction, addition { // implements the interfaces subtraction, addition
    public void sub(int a, int b) {
        int diff = a - b;
        System.out.println("Difference of a & b is " + diff);
    } // sub ends

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a & b is " + sum);
    } // add ends
}

public class Interface_Implement {
    public static void main(String args[]) { // main function
        operate obj = new operate(); // creation of object
        obj.sub(20, 10);
        obj.add(20, 10);
    } // main ends
} // class ends