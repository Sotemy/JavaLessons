package ex2;

public class Bitwise {
    public static void main(String[] args){
        int bin = 53; // Двоичное представление 00110101
        System.out.println("Флаг 1: "+ (( (bin&1)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 2: "+ (( (bin&2)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 3: "+ (( (bin&3)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 4: "+ (( (bin&4)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 5: "+ (( (bin&5)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 6: "+ (( (bin&6)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 7: "+ (( (bin&7)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 8: "+ (( (bin&8)>0) ? "Вкл":"Выкл"));

        System.out.println("Флаг 1: "+ (( (bin&1)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 2: "+ (( (bin&2)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 3: "+ (( (bin&3)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 4: "+ (( (bin&4)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 5: "+ (( (bin&5)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 6: "+ (( (bin&6)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 7: "+ (( (bin&7)>0) ? "Вкл":"Выкл"));
        System.out.println("Флаг 8: "+ (( (bin&8)>0) ? "Вкл":"Выкл"));
    }
}
