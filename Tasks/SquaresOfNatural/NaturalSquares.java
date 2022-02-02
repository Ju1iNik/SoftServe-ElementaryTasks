package Tasks.SquaresOfNatural;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaturalSquares {
    static int n;

    public static int setN() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean wError=true;
        do {
            try {
                System.out.println("Input integer number n(less than 46341):");
                n = Integer.parseInt(br.readLine());
                wError=false;
            } catch (NumberFormatException e) {
                System.out.println("Insert Integer value");
            }
        }while (wError);
        return n;
    }

    public static void printSquares(int n) {
        for (int i=1; i<n; i++) {
            if (i * i < n) {
                if (i%10==0) {
                    System.out.println((i * i) + " ");
                }else{
                    System.out.print((i * i) + " ");
                }
            }
        }
    }
}
