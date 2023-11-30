import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // char [] arr = new char[5];
        // for(int i=0; i<5; i++){
        //     arr[i] = sc.next().charAt(i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        int i=0, j = str.length()-1, flag=0;
        while( i<j ){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a Palindrome");
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if(flag == 0) System.out.println("Yes, Palindrome");
        sc.close();
    }
}
