package ex4;

public class Array {
    public static void main(String[] args){
        String[] str = {"java ", "good ", "language"};
        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;
        str[1] = "Best ";
        System.out.println("Length of str massive is " + str.length);
        System.out.println("Length of int massive is " + num.length);
        System.out.println(num[0]+", "+num[1]+", "+num[2]);
        System.out.println(str[0] + str[1] + str[2]);
    }
}
