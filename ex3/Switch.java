package ex3;

public class Switch {
    public static void main(String[] args){
        int month = 2, year = 2001, num = 31;
        switch (month){
            case 4 : case 6 : case 9 : case 11 : num = 30; break;
            case 2 : num = (year % 4 == 0) ? 29:28; break;
        }
        System.out.println( month+"/"+year+": "+num+"дней" );
        int ptn = 1;
        String ptnvr = "Ptnvr";
        switch(year){
            case 2000 : case 2010 : case 2020 : case 2222 : System.out.println(ptnvr); break;
            case 2021 : ptn = (year - 2000); System.out.println(ptn); break; 
        }
    }
}
