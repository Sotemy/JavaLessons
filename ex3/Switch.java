package ex3;

public class Switch {
    public static void main(String[] args){
        int month = 2, year = 2016, days = 31;
        switch (month){
            case 4 : case 6 : case 9 : case 11 : days = 30; break; // if month = {4, 6, 9, 11} : days = 30
            case 2 : days = (year % 4 == 0) ? 29:28; break; // if month = 2 :  days /(module) == 0 => 29 or 28 days
        
        }
        System.out.println(month+"/"+year+": "+days+" дней");   
    }
}
