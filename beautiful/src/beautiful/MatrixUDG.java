package beautiful;


/**
 * Java: �ڽӾ����ʾ��"����ͼ(Matrix Undirected Graph)"
 *
 * @author winter
 * @date 2017/04/19
 */

import java.io.IOException;
import java.util.Scanner;

public class MatrixUDG {

    private char[] mVexs;       // ���㼯��
    private int[][] mMatrix;    // �ڽӾ���

    /* 
     * ����ͼ(�Լ���������)
     */
    public MatrixUDG() {

        // ����"������"��"����"
        System.out.printf("input vertex number: ");
        int vlen = readInt();
        System.out.printf("input edge number: ");
        int elen = readInt();
        if ( vlen < 1 || elen < 1 || (elen > (vlen*(vlen - 1)))) {
            System.out.printf("input error: invalid parameters!\n");
            return ;
        }
        
        // ��ʼ��"����"
        mVexs = new char[vlen];
        for (int i = 0; i < mVexs.length; i++) {
            System.out.printf("vertex(%d): ", i);
            mVexs[i] = readChar();
        }

        // ��ʼ��"��"
        mMatrix = new int[vlen][vlen];
        for (int i = 0; i < elen; i++) {
            // ��ȡ�ߵ���ʼ����ͽ�������
            System.out.printf("edge(%d):", i);
            char c1 = readChar();
            char c2 = readChar();
            int p1 = getPosition(c1);
            int p2 = getPosition(c2);

            if (p1==-1 || p2==-1) {
                System.out.printf("input error: invalid edge!\n");
                return ;
            }

            mMatrix[p1][p2] = 1;
            mMatrix[p2][p1] = 1;
        }
    }

    /*
     * ����ͼ(�����ṩ�ľ���)
     *
     * ����˵����
     *     vexs  -- ��������
     *     edges -- ������
     */
    public MatrixUDG(char[] vexs, char[][] edges) {
        
        // ��ʼ��"������"��"����"
        int vlen = vexs.length;
        int elen = edges.length;

        // ��ʼ��"����"
        mVexs = new char[vlen];
        for (int i = 0; i < mVexs.length; i++)
            mVexs[i] = vexs[i];

        // ��ʼ��"��"
        mMatrix = new int[vlen][vlen];
        for (int i = 0; i < elen; i++) {
            // ��ȡ�ߵ���ʼ����ͽ�������
            int p1 = getPosition(edges[i][0]);
            int p2 = getPosition(edges[i][1]);

            mMatrix[p1][p2] = 1;
            mMatrix[p2][p1] = 1;
        }
    }

    /*
     * ����chλ��
     */
    private int getPosition(char ch) {
        for(int i=0; i<mVexs.length; i++)
            if(mVexs[i]==ch)
                return i;
        return -1;
    }

    /*
     * ��ȡһ�������ַ�
     */
    private char readChar() {
        char ch='0';

        do {
            try {
                ch = (char)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while(!((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')));

        return ch;
    }

    /*
     * ��ȡһ�������ַ�
     */
    private int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /*
     * ���ض���v�ĵ�һ���ڽӶ����������ʧ���򷵻�-1
     */
    private int firstVertex(int v) {

        if (v<0 || v>(mVexs.length-1))
            return -1;

        for (int i = 0; i < mVexs.length; i++)
            if (mMatrix[v][i] == 1)
                return i;

        return -1;
    }

    /*
     * ���ض���v�����w����һ���ڽӶ����������ʧ���򷵻�-1
     */
    private int nextVertex(int v, int w) {

        if (v<0 || v>(mVexs.length-1) || w<0 || w>(mVexs.length-1))
            return -1;

        for (int i = w + 1; i < mVexs.length; i++)
            if (mMatrix[v][i] == 1)
                return i;

        return -1;
    }

    /*
     * ���������������ͼ�ĵݹ�ʵ��
     */
    private void DFS(int i, boolean[] visited) {

        visited[i] = true;
        System.out.printf("%c ", mVexs[i]);
        // �����ö���������ڽӶ��㡣����û�з��ʹ�����ô����������
        for (int w = firstVertex(i); w >= 0; w = nextVertex(i, w)) {
            if (!visited[w])
                DFS(w, visited);
        }
    }

    /*
     * ���������������ͼ
     */
    public void DFS() {
        boolean[] visited = new boolean[mVexs.length];       // ������ʱ��

        // ��ʼ�����ж��㶼û�б�����
        for (int i = 0; i < mVexs.length; i++)
            visited[i] = false;

        System.out.printf("DFS: ");
        for (int i = 0; i < mVexs.length; i++) {
            if (!visited[i])
                DFS(i, visited);
        }
        System.out.printf("\n");
    }

    /*
     * ����������������������Ĳ�α�����
     */
    public void BFS() {
        int head = 0;
        int rear = 0;
        int[] queue = new int[mVexs.length];            // �������
        boolean[] visited = new boolean[mVexs.length];  // ������ʱ��

        for (int i = 0; i < mVexs.length; i++)
            visited[i] = false;

        System.out.printf("BFS: ");
        for (int i = 0; i < mVexs.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                System.out.printf("%c ", mVexs[i]);
                queue[rear++] = i;  // �����
            }

            while (head != rear) {
                int j = queue[head++];  // ������
                for (int k = firstVertex(j); k >= 0; k = nextVertex(j, k)) { //k��Ϊ���ʵ��ڽӶ���
                    if (!visited[k]) {
                        visited[k] = true;
                        System.out.printf("%c ", mVexs[k]);
                        queue[rear++] = k;
                    }
                }
            }
        }
        System.out.printf("\n");
    }

    /*
     * ��ӡ�������ͼ
     */
    public void print() {
        System.out.printf("Martix Graph:\n");
        for (int i = 0; i < mVexs.length; i++) {
            for (int j = 0; j < mVexs.length; j++)
                System.out.printf("%d ", mMatrix[i][j]);
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[][] edges = new char[][]{
            {'A', 'C'}, 
            {'A', 'D'}, 
            {'A', 'F'}, 
            {'B', 'C'}, 
            {'C', 'D'}, 
            {'E', 'G'}, 
            {'F', 'G'}};
        MatrixUDG pG;

        // �Զ���"ͼ"(����������)
        //pG = new MatrixUDG();
        // �������е�"ͼ"
        pG = new MatrixUDG(vexs, edges);

        pG.print();   // ��ӡͼ
        pG.DFS();     // ������ȱ���
        pG.BFS();     // ������ȱ���
    }
}