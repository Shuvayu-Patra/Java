public class Prime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int flag = 0 ;
        for(int i=2; i<n; i++){
            if(n%i == 0) {System.out.println("not Prime");
            flag=1;
            break;}
        }
        if(flag == 0 ) System.out.println("prime");
    }
}
