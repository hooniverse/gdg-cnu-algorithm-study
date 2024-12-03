package week1.sunghoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] result = new boolean[n + 1];


        result[0] = true;
        result[1] = true;

        for(int i = 2; i * i <= n; i++) {

            if(!result[i]) {
                for(int j = i * i; j <= n; j += i) {
                    result[j] = true;
                }
            }
        }

        for(int i = m; i <= n; i++) {
            if(!result[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
