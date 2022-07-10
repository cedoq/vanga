import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        byte bool = 0;
        System.out.println("угадай число от 1 до 10 и получи 100 рублей))) ");
        while (bool == 0) {
            int r = (int) ((Math.random()) * 10);
            String k = bR.readLine();
            if (Integer.parseInt(k)==r){
                System.out.println("фига... ну держи 100 рублей((( ");
                bool = 1;
            }
            else {
                System.out.println("ха, не угадал)");
            }
        }
    }


    }