import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number < 0){
                System.out.println("Выберите положтельное число");
                continue;
            }
            sum = sum + i;

        }
        System.out.println(sum);
    }
}