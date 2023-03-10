
public class MyOOPs {
    public static void main(String[] args) {

        System.out.println("STARTED!!");
        int x;
        Studentz obj1 = new Studentz();
        obj1.name = "Rainer";
        obj1.lastname = "Puksand";
        obj1.age =44;
        obj1.sayName();
        obj1.sayAge();

        Studentz obj2 = new Studentz();
        obj2.name = "Hulk";
        obj2.age = 22;

        System.out.println("============");
        obj1.checkForDiscount();

        System.out.println("============");
        obj2.checkForDiscount();






    }//xxxxxx
}//xxxxxxx



class Studentz{
    String name, lastname,displayName;
    int age;



    public void setDisplayName(){
        System.out.println("My Displayname is: " + name);
    }

    public void sayName(){
        System.out.println("My name is: " + name);
    }

    public void sayAge(){
        System.out.println("My age is: " + age);
    }

     public void checkForDiscount(){

             System.out.println(name + " " + lastname);









        if(age>18){
            System.out.println(name + ", sorry no Discount");
        }
        else{
            System.out.println(name + ", You got a Discount!!!");
        }

    }


}
