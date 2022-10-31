import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] A = {60,35,81,98,14,47};
        int n = A.length;
        System.out.println(Arrays.toString(doSomething(A, n)));
        System.out.println();

    }

    private static int[] doSomething (int[] A, int n) {
        int[] Z = {0,0,0,0,0,0};
        int[] S = new int[n];
        for(int i = 0; i <= n - 2; i++){
            for(int j = i + 1; j <= n - 1; j++){
                if(A[i] <= A[j]){
                    Z[j]++;
                }else{
                    Z[i]++;
                }
            }
            System.out.println(i + ". "+Arrays.toString(Z));
        }

        System.out.println();
        for(int i = 0; i <= n - 1; i++){
            S[Z[i]] = A[i];
            System.out.println(i + ". "+Arrays.toString(Z) + " inside");
        }
        System.out.println();
        System.out.println(Arrays.toString(Z) + " outside");
        return S;
    }
}

