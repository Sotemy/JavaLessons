package ex1;

public class Constants {
    public static void main(String[] args){

        final int TOUCHDOWN = 6;    //константы для подсчета очков
        final int CONVERSION = 1;
        final int FIELDGOAL = 3; 
        int td, pat, fg, total;     //создание переменных
        td = 4 * TOUCHDOWN;         //подсчет очков
        pat = 3 * CONVERSION;
        fg = 2 * FIELDGOAL;
        total = (td + pat + fg);
                                    //Вывод
        System.out.println("Всего очков: " + total);

    }
}