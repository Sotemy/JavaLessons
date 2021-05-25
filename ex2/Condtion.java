package ex2;

public class Condtion {
    public static void main(String[] args){
        int num1 = 1357;
        int num2 = 2468;
        String result;             //правда     //ложь
        result = (num1 % 2 ==0) ? "четное" : "Нечетное";
        System.out.println(num1 + " - " + result);
        result = (num2 % 2 ==0) ? "четное" : "Нечетное";
        System.out.println(num2 + " - " + result);
    }
}
