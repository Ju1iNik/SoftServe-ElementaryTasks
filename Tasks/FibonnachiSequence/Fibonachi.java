package Tasks.FibonnachiSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Fibonachi {
    long nums[];
    static int lastElem;


    Fibonachi(int lastElem) {
        nums=new long[lastElem+3];
        nums[0]=1;
        nums[1]=1;
        for (int i=2; i<(lastElem+2);i++){
        nums[i]=nums[i-1]+nums[i-2];
            }
        }

    public static long[] countrArr(int lastElem) {
        long[] nums=new long[lastElem+3];
        nums[0]=1;
        nums[1]=1;
        for (int i=2; i<(lastElem+2);i++){
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums;
    }
    public static int getlastElem() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Finish verge of sequence(less than 92)");
        lastElem = parseInt(br.readLine());
        return lastElem;
    }
}

