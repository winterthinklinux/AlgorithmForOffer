package cn.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three2 {
    private static int INF = 1000;
    private static Integer[][] dist;
    private static Integer[][] path;
    private static List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {

        int size = 6;

        int begin = 4;
        Scanner scan = new Scanner(System.in);
//        int end = Integer.parseInt(scan.nextLine()) - 1;
//        int foggy = Integer.parseInt(scan.nextLine()) - 1;
        int end = scan.nextInt()-1;
        int foggy = scan.nextInt()-1;
        
        scan.close();

        int[][] matrix = { { 0, 2, 10, 5, 3, INF },
                           { INF, 0, 12, INF, INF, 10 }, 
                           { INF, INF, 0, INF, 7, INF },
                           { 2, INF, INF, 0, 2, INF }, 
                           { 4, INF, INF, 1, 0, INF },
                           { 3, INF, 1, INF, 2, 0 } };
        path = new Integer[size][size];
        dist = new Integer[size][size];
 //没有雾或者设置雾城市
        if (foggy != -1){
        	 for (int i = 0; i < matrix.length; i++) {
                 matrix[i][foggy] = matrix[foggy][i] = INF;
             }
        	
        }
            
//调用弗洛伊德
        floyd(matrix);

        findPath(begin, end);
        System.out.println(dist[begin][end]);
        for (int i = 0; i < result.size(); i++)
            result.set(i, result.get(i) + 1);
        if (dist[begin][end] == INF)
            result.removeAll(result);
        System.out.println(result);
    }
//在path数组里找路径
    public static void findPath(int i, int j) {
        int ci = i, ccj = j;
        while (path[i][j] != -1) {
            int cj = path[i][j];
            result.add(cj);
            i = cj;
        }
        result.add(0, ci);
        result.add(ccj);
    }

    public static void floyd(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                path[i][j] = -1;
                dist[i][j] = matrix[i][j];
            }
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF
                            && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        path[i][j] = k;
                    }
                }
            }
        }
    }
//初始化两个数组
   
}
