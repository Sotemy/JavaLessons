package ex3;

public class Break {
    public static void main(String[] args){
        for (int i = 1; i < 4; i++){

            for(int j = 1; j < 4; j++){
                System.out.println("Итерация i="+ i +" j="+j);
                if(i == 1 && j == 1){
                    System.out.println("Continue an inside circle with i=" +i+ " j=" +j);
                    continue;
                }
                if (i == 2 && j == 1){
                    System.out.println( "Выход из внутреннего цикла при i=" + i + " j=" +j);
                    break ;
                }
            }
        }
    }
    
}
