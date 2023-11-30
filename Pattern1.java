import java.lang.*;

public class Pattern1 {
    public static void main(String args[]) {
        int flag = 1;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0)
                flag = 0;
            else
                flag = 1;
            for (int j = 1; j <= 4; j++) {
                if (j >= 1 && j <= i) {
                    System.out.print(" " + flag + " ");
                    if (flag == 1)
                        flag = 0;
                    else
                        flag = 1;
                } else {
                    System.out.print("    ");
                }
            }
            System.err.print("\n");
        }
    }
}