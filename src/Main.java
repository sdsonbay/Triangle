import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int spaceCount = 0;
        int starCount = (2 * n) - 1;

        for(int i = n; i > 0 ; i--){
            for(int j = 0; j < spaceCount; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < starCount; k++){
                System.out.print("*");
            }
            starCount -= 2;
            spaceCount += 1;
            System.out.println(" ");
        }
    }
}
