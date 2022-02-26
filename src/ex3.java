import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if(digit % 2 == 0) {
            System.out.println("четное");
        }else {
            System.out.println("нечетное");
        }
    }
}
