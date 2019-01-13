package bitwise;

import java.util.Scanner;

public class day29 {
    
   static int day29(int N, int K){
        
        int max = 0;
    
        for(int A = 1; A < N; A++){
            for(int B = A+1; B <=N; B++){
                int C = A & B;
                
                if((C > max) && (C < K)){
                    max = C;
                }
                    
                }
            }
        return max;
        }
        
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while(T<1 || T>Math.pow(10,3)){
            T = sc.nextInt();
        }
        
        for (int i  = 0; i < T; i++){
        
        int N = sc.nextInt();
        while(N<2 || N>Math.pow(10,3)){
            N = sc.nextInt();
        }
         
        int K = sc.nextInt();
        while(K<2 || K>N){
            K = sc.nextInt();
        }
        
            System.out.println(day29(N,K));
        
    }
       
    }
    
}
