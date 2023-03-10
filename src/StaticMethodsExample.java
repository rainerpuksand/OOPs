//===========================================
//Static key word can be applied to
//>> class (inner class)
//>> variable
//>> method
//>> import
//>> Block: is a block of statement inside a Java class
// that will be executed when a class is first loaded into the JVM.
//A static block helps to initialize the static data members,
//just like constructors help to initialize instance members
//===========================================
public class StaticMethodsExample {
    int x =5;
    static int y = 5;


    public static void doPrint(){
        int a = 5;//able to access if declared inside the static method
        System.out.println("Wooohoooo");
        //x=4;//error cant access Reg variables from Static
        y=9;
    }
}

class Runnn{
    public static void main(String[] args) {
        StaticMethodsExample.doPrint();
    }
}