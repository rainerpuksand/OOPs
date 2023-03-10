//===========================================
//https://www.geeksforgeeks.org/static-import-java/
//===========================================
public class StaticVariables {

    public static void main(String[] args) {


        //System.out.println(seats); //error
        //System.out.println(Theatre.seats);
        System.out.println(Theatre.max_seats);

        Theatre operaObj = new Theatre();
        operaObj.seats = 25;
        Theatre balletObj = new Theatre();
        balletObj.seats = 45;

        System.out.println("================");

        System.out.println("Opera Seats: " + operaObj.seats);
        System.out.println("Ballet Seats: " + balletObj.seats);
        System.out.println("Opera MAX Seats: " + operaObj.max_seats);//not recommended
        System.out.println("Ballet MAX Seats: " + balletObj.max_seats);//not recommended




        operaObj.seats = operaObj.seats + 5;
        System.out.println("================ Opera seats +5");

        System.out.println("Opera Seats: " + operaObj.seats);
        System.out.println("Ballet Seats: " + balletObj.seats);

        System.out.println("================ ");
        System.out.println("If static var changed... it is reflected in all its objects");
        Theatre.max_seats=90;//correct way to access static variable
        System.out.println("Opera MAX Seats: " + operaObj.max_seats);
        System.out.println("Ballet MAX Seats: " + balletObj.max_seats);



        balletObj.max_seats = 65;//not recommended.. just for proof
        System.out.println("================ Ballet changes MAX_seats");
        System.out.println("Opera MAX Seats: " + operaObj.max_seats);
        System.out.println("Ballet MAX Seats: " + balletObj.max_seats);
        System.out.println("Theatre Class MAX Seats: " + Theatre.max_seats);//correct way



    }
}





class Theatre{
   int seats = 0;
   public static int max_seats = 50;
}