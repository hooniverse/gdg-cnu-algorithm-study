package week1.sunghoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10974 {
    static int n;
    static int[] result;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        result = new int[n];
        visited = new boolean[n];

        back(0);
    }

    public static void back(int depth){
        if(depth == n){
            for(int i:result){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = i+1;
                back(depth+1);
                visited[i] = false;
            }
        }

    }
}
