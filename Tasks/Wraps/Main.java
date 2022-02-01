package Tasks.Wraps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        boolean ans=true;
        while (ans==true) {
            Envelop first_envelop = new Envelop();
            Envelop second_envelop = new Envelop();
            Wrapchecking(first_envelop,second_envelop);
            System.out.println("Do you want to try again?");
            String string_ans= mr.readLine();
            if(string_ans.equalsIgnoreCase("y")||string_ans.equalsIgnoreCase("yes")){
                ans=true;
            }else{
                ans=false;
            }
        }
    }
    public static void Wrapchecking(Envelop a,Envelop b){

        if ((a.HEIGHT>=b.HEIGHT&&a.WIDTH>= b.WIDTH)||(a.HEIGHT>=b.WIDTH&&a.WIDTH>= b.HEIGHT)){
            System.out.println("It would be a perfect fit");
        }else{
            System.out.println("it won't fit");
        }
    }

}
