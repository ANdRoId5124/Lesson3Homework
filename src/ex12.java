import java.util.Scanner;
public class ex12 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        float deposit = scanner.nextFloat();
        for(int i = 1; i <= month;i++){
            float percent = deposit/100*7;
            deposit = deposit + percent;
        }
        System.out.println(deposit);
    }
}
