package day_01;

/*
여행을 떠난 영수는 지도를 하나 구하였다. 이 지도는 아래 그림과 같이 직사각형 모양이며 여러 칸으로 나뉘어져 있다. 
한 칸은 한 지점을 나타내는데 각 칸에는 그 지점의 높이가 쓰여 있으며 
각 지점 사이의 이동은 지도상에서 상하좌우로 이웃한 곳끼리만 가능하다.
현재 제일 왼쪽 위 칸이 나타내는 지점에 있는 영수는 제일 오른쪽 아래 칸이 나타내는 지점으로 가려고 한다. 그런데 가능한 힘을 적게 들이고 싶어 항상 높이가 더 낮은 지점으로만 이동하여 목표 지점까지 가고자 한다. 위와 같은 지도에서는 다음과 같은 세 가지 경로가 가능하다.
지도가 주어질 때 이와 같이 제일 왼쪽 위 지점에서 제일 오른쪽 지점까지 항상 내리막 길로만 이동하는 경로의 개수를 구하는 프로그램을 작성하시오.

출처: https://dyndy.tistory.com/51?category=637368 [DY N DY]

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
 
       // 시작점부터 현 포인트까지 오는 방법. - 네가지가 있을거임 바운더리 체크 해야함. 큰지작은지 체크 해야함.
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