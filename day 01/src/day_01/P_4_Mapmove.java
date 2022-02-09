package day_01;

/*
������ ���� ������ ������ �ϳ� ���Ͽ���. �� ������ �Ʒ� �׸��� ���� ���簢�� ����̸� ���� ĭ���� �������� �ִ�. 
�� ĭ�� �� ������ ��Ÿ���µ� �� ĭ���� �� ������ ���̰� ���� ������ 
�� ���� ������ �̵��� �����󿡼� �����¿�� �̿��� �������� �����ϴ�.
���� ���� ���� �� ĭ�� ��Ÿ���� ������ �ִ� ������ ���� ������ �Ʒ� ĭ�� ��Ÿ���� �������� ������ �Ѵ�. �׷��� ������ ���� ���� ���̰� �;� �׻� ���̰� �� ���� �������θ� �̵��Ͽ� ��ǥ �������� ������ �Ѵ�. ���� ���� ���������� ������ ���� �� ���� ��ΰ� �����ϴ�.
������ �־��� �� �̿� ���� ���� ���� �� �������� ���� ������ �������� �׻� ������ ��θ� �̵��ϴ� ����� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

��ó: https://dyndy.tistory.com/51?category=637368 [DY N DY]

*/
import java.util.Scanner;
 
public class P_4_Mapmove {
 
   static int M, N;
   static int[][] map;
   static int[][] Cost;
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       M = sc.nextInt();
       N = sc.nextInt();
       map = new int[M][N];
       Cost = new int[M][N];
 
       for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               map[i][j] = sc.nextInt(); // map hill index
               Cost[i][j] = -1;
           }
       }
 
       // Danamic Programing
       //Print();
       System.out.println(findWayUsingDP(M - 1, N - 1));
 
   }
   public static void Print(){
       for (int i = 0; i < M; i++) {
           for (int j = 0; j < N; j++) {
               System.out.print(findWayUsingDP(i, j) + "\t");
           }
           System.out.println();
       }
   }
 
   public static int findWayUsingDP(int x, int y) {
 
       if (x == 0 && y == 0)
           return 1;
 
       // ���������� �� ����Ʈ���� ���� ���. - �װ����� �������� �ٿ���� üũ �ؾ���. ū�������� üũ �ؾ���.
       int fromEst = 0;
       int fromWest = 0;
       int fromSouth = 0;
       int fromNorth = 0;
 
       if (y + 1 < N) {// boundary check
           if (map[x][y] < map[x][y + 1]) { // point for est
               if (Cost[x][y + 1] == -1) {
                   fromEst = findWayUsingDP(x, y + 1);
                   Cost[x][y + 1] = fromEst;
               } else {
                   fromEst = Cost[x][y + 1];
               }
           }
       }
       if (y - 1 >= 0) {// boundary check
           if (map[x][y] < map[x][y - 1]) { // point for west
               if (Cost[x][y - 1] == -1) {
                   fromWest = findWayUsingDP(x, y - 1);
                   Cost[x][y - 1] = fromWest;
               } else {
                   fromWest = Cost[x][y - 1];
               }
           }
       }
       if (x + 1 < M) {// boundary check
           if (map[x][y] < map[x + 1][y]) { // point for south
               if (Cost[x + 1][y] == -1) {
                   fromSouth = findWayUsingDP(x + 1, y);
                   Cost[x + 1][y] = fromSouth;
               } else {
                   fromSouth = Cost[x + 1][y];
               }
           }
       }
       if (x - 1 >= 0) {// boundary check
           if (map[x][y] < map[x - 1][y]) { // point for north
               if (Cost[x - 1][y] == -1) {
                   fromNorth = findWayUsingDP(x - 1, y);
                   Cost[x - 1][y] = fromNorth;
               } else {
                   fromNorth = Cost[x - 1][y];
               }
           }
       }
       return fromEst + fromWest + fromSouth + fromNorth;
   }
}

/*
4 5 
50 45 37 32 30 
35 50 40 20 25 
30 30 25 17 28 
27 24 22 15 10
*/