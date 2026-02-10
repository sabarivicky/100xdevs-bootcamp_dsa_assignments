import java.util.HashSet;
import java.util.Scanner;

public class E_search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            st.add(arr[i]);
        }

        if(st.contains(target)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        


    }
}
