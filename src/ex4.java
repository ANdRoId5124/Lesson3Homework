import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t > -5){
            System.out.println("тепло");
        }
            if(t <= -5 && t > -20){
                System.out.println("Нормально");
            }
                if(t <=- 20){
                    System.out.println("холодно");
                }



    }
}