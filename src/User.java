public class User {

    private String name;//make pvt .. then add GetterSetters
    int x;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}


class Program2Run{

    public static void main(String[] args) {

        User obj = new User();
        /*System.out.println(obj.name + " | " + obj.x);

        obj.name = "YOhan";
        System.out.println(obj.name);
        obj.x = 100;
        System.out.println(obj.x);*/



        obj.setName("YOhanZZZ");
        System.out.println(obj.getName());
        //similarly get and set int x values


    }
}





