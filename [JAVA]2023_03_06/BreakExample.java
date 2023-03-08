import java.util.Scanner;

public class BreakExample {
// exit 가 입력되면 while 문을 벗어나도록 break 문을 활용하라
    
    public static void main(String[] args) {
        
        // 내가 작성한 코드

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("exit를 입력하면 종료합니다.");
        
        while (true) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            
            if (text.equals("exit")) break;
        }

        System.out.println("종료합니다...");
        */
        
        
        // 강사님 ver
        
        System.out.println("exit를 입력하면 종료합니다.");
        
        while(true) {
            System.out.print(">> ");    
            String text = scanner.next();
            if (text.equals("exit")) break;

        }
        
        System.out.println("종료합니다...");
        scanner.close();
    }
}