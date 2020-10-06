import java.util.Arrays; 
  
class CoinChange 
{ 
    static int countWays(int S[], int m, int n) 
    { 
        int[] table = new int[n+1]; 
  
        Arrays.fill(table, 0);   
  
        table[0] = 1; 
  
        for (int i=0; i<m; i++) 
            for (int j=S[i]; j<=n; j++) 
                table[j] += table[j-S[i]]; 
  
        return table[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of coins: ");
        int c = sc.nextInt();

        int[] arr = new int[c];
        System.out.print("Enter value of coins");
        for(int i=0;i<c;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countWays(arr, c, n)); 
    } 
} 