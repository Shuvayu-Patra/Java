public class Pattern2 {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j<=i){
                    System.out.print(" " + i + " ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
