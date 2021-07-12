package ex3;

public class Else {
    public static void main(String[] args){
        int hrs = 7;
        if (hrs<12){
            System.out.println("Good morning "+ hrs);
        }

        else if (hrs==12){
            System.out.println("Midday "+ hrs);
        }

        else System.out.println("Good evening "+ hrs);

    }
}
