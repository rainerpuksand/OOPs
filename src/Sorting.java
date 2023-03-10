public class Sorting {


    public void getLargerNum(int num1, int num2) {

        if(num1>num2){
            System.out.println(num1 + " is the larger num.");
        }
        else if(num2>num1){
            System.out.println(num2 + " is the larger num.");
        }
        else if (num1==num2){
            System.out.println("Both are equal");
        }


        //return ans;
       // int a = 5;//...error
    }
}

class mainMethod{
    public static void main(String[] args) {

        Sorting obj = new Sorting();
        obj.getLargerNum(10,5);


    }
}
//===================================



