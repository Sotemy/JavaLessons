package ex3;

public class ifi {
    public static void main(String[] args){
        if (5>1) System.out.println("5>1");
        if (2<4){
            System.out.println("2<4");
            System.out.println("Проверка пройдена успешно!");
        }
        int num = 13;
        if (((num > 5) && (num <10)) || (num ==12)){
            System.out.println("Number is in the range from 6 to 9 includietly or the same to 12");
        }
        if (((num<5) || (num>10)) && (num != 12)){
            System.out.println("Number ist out of range");
        }
    }
}
