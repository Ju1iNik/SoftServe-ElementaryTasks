package Tasks.FibonnachiSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Start verge of sequence");
        int firstElem= parseInt(br.readLine());
        System.out.println("Enter the Finish verge of sequence(less than 92)");
        int lastElem= parseInt(br.readLine());
        Fibonachi fib=new Fibonachi(lastElem);
        for (int i=firstElem;i<=lastElem;i++) {
            System.out.println(fib.nums[i]);
        }
    long[] arr=Fibonachi.countrArr(Fibonachi.getlastElem());
        for (int i=firstElem;i<=Fibonachi.lastElem;i++) {
            System.out.println(arr[i]);
        }
    }
}
