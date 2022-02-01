package Tasks.Wraps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Envelop {
    float WIDTH;
    float HEIGHT;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Envelop() throws IOException {
        boolean wError = true;
        boolean hError = true;
        System.out.println("Insert WIDTH of envelop");
        do {
            try {
                WIDTH = Float.parseFloat(br.readLine());
                wError = false;
            } catch (NumberFormatException e) {
                System.out.println("Insert Integer or Float values");
            }
        } while (wError);
        System.out.println("Insert HEIGHT of envelop");
        do {
            try {
                HEIGHT = Float.parseFloat(br.readLine());
                hError = false;
            } catch (NumberFormatException e) {
                System.out.println("Insert Integer or Float values");
            }
        } while (hError);
    }
}
