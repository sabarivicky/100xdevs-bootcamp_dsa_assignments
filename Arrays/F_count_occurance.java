import java.util.HashMap;
import java.util.Scanner;

public class F_count_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = new int[n];

        for(int i = 0 ; i<n ;i++){
            arr[i] = sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(mp.get(target));
    }
}
