package week1.sunghoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {

    static boolean[] prime;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        prime = new boolean[246913];

        get_prime();

        while(true){
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int count = 0;

            for (int i = n+1; i <= 2*n ; i++) {
                if(!prime[i]) count++;
            }
            System.out.println(count);
        }

    }

    public static void get_prime(){
        prime[0] = true;
        prime[1] = true;

        for (int i =2; i*i < prime.length; i++){
            if(!prime[i]){
                for (int j = i*i; j < prime.length; j+=i){
                    prime[j] = true;
                }
            }

        }
    }
}
