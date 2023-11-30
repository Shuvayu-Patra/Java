public class ascendingorder {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i=0;
        for(String s : args){
            arr[i++] = Integer.parseInt(s);
        }

        for(i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}
