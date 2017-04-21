package cn.huawei;
//Flod算法
import java.util.*;

public class Three {
    private static int INF = 1000;

    private static Integer[][] dist;
    private static Integer[][] path;

    private static List<Integer> result = new ArrayList<Integer>();
//调试
    public static void printMatrix(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
//设置雾城市
    private static void setFog(int[][] matrix, int city) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][city] = matrix[city][i] = INF;
        }
    }

    public static void main(String[] args) {

        int size = 6;

        int begin = 4;
        Scanner scan = new Scanner(System.in);
        int end = Integer.parseInt(scan.nextLine()) - 1;
        int foggy = Integer.parseInt(scan.nextLine()) - 1;
        scan.close();

        int[][] matrix = { { 0, 2, 10, 5, 3, INF },
                           { INF, 0, 12, INF, INF, 10 }, 
                           { INF, INF, 0, INF, 7, INF },
                           { 2, INF, INF, 0, 2, INF }, 
                           { 4, INF, INF, 1, 0, INF },
                           { 3, INF, 1, INF, 2, 0 } };
        init(size);
        //没有雾
        if (foggy != -1)
            setFog(matrix, foggy);
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
    public static void init(int size) {
        path = new Integer[size][size];
        dist = new Integer[size][size];
    }
}
