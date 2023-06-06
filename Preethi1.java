public class Preethi1 {
    int salary = 20000;
}

class Preethi2 extends Preethi1 {
    int bonus = 17000;

    public static void main(String[] args) {
        Preethi2 p = new Preethi2();
        System.out.println("Preethi salary is " + p.salary);
        System.out.println("Preethi Bonus salary is " + p.bonus);
    }
}