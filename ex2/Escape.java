package ex2;

public class Escape {
    public static void main(String[] args){
        String header = "\n\tNew-York's weather for 3 days:\n";
        header += "\n\tDay\t\tMax\tMin\tRain\n";
        header += "\t---\t\t----\t---\t----------\n";
        String forecast = "\tSunday\t\t68F\t48F\tSuny\n";
        forecast += "\tMonday\t\t69F\t57F\tSuny\n";
        forecast += "\tThursday\t71F\t50F\tCloudy\n";
        System.out.print(header + forecast);
    }
}
