public class Max_Conjunto {
    
    public static int max(int v[],int n){
        int max = v[0];
        for (int i = 1; i < n; i++) {
            if(max < v[i])
                max = v[i];
        }
        return max;
    }
    
    public static void main(String[] args) throws Exception {
        int vetor[] = { 11, 24, 2, 9, 30 };
        int n = 5;
        System.out.println(max(vetor, n));
    }
}
