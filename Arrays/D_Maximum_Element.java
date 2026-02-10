import java.util.Scanner;
public class D_Maximum_Element {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for(int i = 0 ; i<n ;i++){
            if(arr[i]>max){
                max = arr[i];
                ind = i+1;
            }
        }
        System.out.println(max+" "+ind);
        scan.close();
    }
}
