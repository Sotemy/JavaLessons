package ex3;

public class Try {
    public static void main(String[] args){
        int num = 20;
        for (int i = 1; i < 100; i++){
            System.out.println("i is ( "+i+" )");
            if (i == num){
                System.out.println("Num * i is ( "+num * i+" )");
                break;
            }
        }
        int bin = 53; // Двоичное представление 00110101
        for (int j=1; j<9; j++){
            System.out.println("Флаг "+j+": "+ (( (bin&j)>0) ? "Вкл":"Выкл"));
            if (j == 8){
                System.out.println("\n");
            }
        }
        for (int j=1; j<9; j++){
            System.out.println("Флаг "+j+": "+ (( (bin&j)>0) ? "1":"0"));
        }
    }
}
