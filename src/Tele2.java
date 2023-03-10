public class Tele2 {
    public static void main(String[] args) {

        Clients obj1 = new Clients("Yohan", 1);
        Clients obj2 = new Clients("Kristjan", 2);
        Clients obj3 = new Clients("Liisu", 3);

        //create single para constructor
       // Clients objX = new Clients("Indrek");
        //Clients obj = new Clients(); // error with default constructor

    }
}


class Clients{
    String cust_name;
    int mobile_num;

    public Clients(String cust_name, int mobile_num) {
        this.cust_name = cust_name;
        this.mobile_num = mobile_num;
    }
}