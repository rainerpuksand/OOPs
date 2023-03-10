public class Overloading {

        public void hi(){}
        //public void hi(){}
        //public int hi(){return 4;}//return type doesnt matter




        public int add(int x, int y){
            return (x + y);
        }

        public int add(int x, int y, int z){
            return (x + y + z);
        }

        public double add(double x, double y){
            return (x + y);
        }

        public String add(String x, String y){
            return (x + y);
        }

        public String add(char x){
            return "abcd..." + x;
        }



    //when paras are from 2 diff classes ... SEQUENCE matters
    public void makeStudent(String name, int age){}
    public void makeStudent(int age, String name){}
    //=======================================================

        public static void main(String args[])
        {
            Overloading obj = new Overloading();
            System.out.println(obj.add(10, 20));
            System.out.println(obj.add(10, 20, 30));
            System.out.println(obj.add(10.5, 20.5));
            System.out.println(obj.add("YO, ", "Its me!"));
            System.out.println(obj.add('z'));
        }
}

    //=== now for overriding

class Dad{
    String car="chevy";

    public void Shout(){
        System.out.println("Do your Studies.");
    }
}

class Child extends Dad{
    String bike="yamaha";

    //First run it without overiding just child.shout()
    @Override
    public void Shout() {
        //super.Shout();
        System.out.println("I hate Studying!");
    }
}

class OverridingEx{
    public static void main(String[] args) {
        Child c = new Child();
        c.Shout();
    }
}