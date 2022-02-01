package Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        Chessdeck(x,y);
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
