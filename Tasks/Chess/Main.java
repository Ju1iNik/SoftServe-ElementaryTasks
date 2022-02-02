package Tasks.Chess;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean wError = true;
        boolean hError = true;
        int x = 0;
        int y = 0;
        System.out.println("Insert width of deck");
        do {
            try {
                x = Integer.parseInt(br.readLine());
                wError = false;
            } catch (NumberFormatException e) {
                System.out.println("Insert Integer or Float values");
            }
        } while (wError);
        System.out.println("Insert height of deck");
        do {
            try {
                y = Integer.parseInt(br.readLine());
                hError = false;
            } catch (NumberFormatException e) {
                System.out.println("Insert Integer or Float values");
            }

        } while (hError);
        Chessdeck(x, y);
    }
    public static void Chessdeck(int x, int y){
        for (int j=0;j<y;j++){
            for(int i=0;i<x;i++){
                if(j%2==0) {
                    System.out.print("*  ");
                }else {
                    System.out.print("  *");
                }
            }
            System.out.println();
        }
    }
}
