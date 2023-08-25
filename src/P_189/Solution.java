package P_189;

import java.io.*;
import java.util.*;

public class Solution {
    static String[][] map;
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, K;
    static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new String[N][N];
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = st.nextToken();
            }
        }

        //input
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            if (!map[x][y].equals("#")) {
                if (map[x][y].equals("@")) {
                    arr[x][y] += 2;
                } else {
                    arr[x][y]++;
                }
            }
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !map[nx][ny].equals("#")) {
                    System.out.println(map[nx][ny]);
                    if (map[nx][ny].equals("@")) {
                        arr[nx][ny] += 2;
                    } else {
                        arr[nx][ny]++;
                    }
                }
            }
        }
        max =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] >max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}