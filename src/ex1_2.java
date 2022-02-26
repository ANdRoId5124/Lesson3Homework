import java.util.Scanner;
public class ex1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numMon = scanner.nextInt();

        if(numMon >= 1 && numMon <= 2 || numMon ==12){
            System.out.println("Winter");
        }else if(numMon >= 3 && numMon <= 5){
            System.out.println("Spring");
        }else if(numMon >= 6 && numMon <= 8){
            System.out.println("Summer");
        }else if(numMon >= 9 && numMon <= 11){
            System.out.println("Autumn");
        }
    }
}
