public class TaxPayer {
    String name;
    int age;
    int salary;
    String residence;

    public TaxPayer(String name, int age, int salary, String residence) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.residence = residence;

    }



    public int Calc_Tax() {
        int tax = 0;

        if (salary > 1000) {
            tax += 100;
        }
        if (age < 60) {
            tax += 50;
        }
        if (residence.equals("house")) {
            tax += 25;
        }
        return tax;
    }

    @Override
    public String toString() {
        return name + " / " + salary;
    }
}

class Ex{
    public static void main(String[] args) {
        TaxPayer t = new TaxPayer("Yo",68,100,"house");

        int taxPayable = t.Calc_Tax();
        System.out.println("Tax payable is: "+ taxPayable);

        System.out.println(t.toString());
    }
}