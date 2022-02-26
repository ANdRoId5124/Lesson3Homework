import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int color = scanner.nextInt();
        switch(color){
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue1");
                break;
            case 6:
                System.out.println("Blue2");
                break;
            case 7:
                System.out.println("Purple");
                break;
        }
    }
}