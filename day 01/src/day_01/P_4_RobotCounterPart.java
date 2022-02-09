package day_01;

import java.util.Scanner;
 /*��� 1. Go k
- k �� 1 2 �Ǵ� 3�� �� �ִ�. ���� ���ϰ� �ִ� �������� k ĭ��ŭ �����δ�.

*��� 2. Turn dir 
- dir �� left �Ǵ� right �̸� ���� ���� �Ǵ� ���������� 90�� ȸ���Ѵ�. 

���� �� �˵��� ��ġ�Ǿ� �ִ� ���°� �Ʒ��� ���� 0�� 1�� �̷���� ���簢�� ������� �κ����� �Էµȴ�. 
0�� �˵��� ��� �־� �κ��� �� �� �ִ� �����̰� 1�� �˵��� ���� �κ��� �� �� ���� �����̴�. 
�κ��� (4, 2) �������� ������ ���ϰ� ���� �� �� �κ��� (2, 4) �������� �������� ���ϵ��� �̵���Ű�� ���� �Ʒ��� ���� 9���� ������� �����ϴ�.

�κ��� ���� ��ġ�� �ٶ󺸴� ������ �־����� �� �κ��� ���ϴ� ��ġ�� �̵���Ű�� ���ϴ� �������� �ٶ󺸵��� �ϴµ� �ּ� �� ���� ����� �ʿ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

��ó: https://dyndy.tistory.com/102?category=637368 [DY N DY]
*/
 
public class P_4_RobotCounterPart{
	
     
    static boolean[][] S = new boolean[110][110];
    static int[][][] Check = new int[110][110][5];
     
    static positionInfo[] Bfs = new positionInfo[40010];
    static positionInfo St = new positionInfo(), Fi = new positionInfo();
 
    static int Count;
    static int[] Gox = {0,0,0,1,-1};
    static int[] Goy = {0,1,-1,0,0};
     
    static int[][] Turn = {{0,0,0}, 
        {0,3,4}, 
        {0,3,4}, 
        {0,1,2}, 
        {0,1,2}};
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
         
        for(int i = 1 ; i <=M; ++i){
            for(int j = 1; j <= N; ++j){
                for(int k = 1; k <=4; ++k)
                    Check[i][j][k]=Integer.MAX_VALUE;
            }
        }
         
        int a = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                a = sc.nextInt();
                if(a==1) S[i][j] = true;
                else S[i][j] = false;
            }
        }
     
        St.x = sc.nextInt();
        St.y = sc.nextInt();
        St.w = sc.nextInt();
        Fi.x = sc.nextInt();
        Fi.y = sc.nextInt();
        Fi.w = sc.nextInt();
         
        findMinCost(M, N);
         
        System.out.println(Check[Fi.x][Fi.y][Fi.w]);
    }
     
public static void findMinCost(int M, int N){
         
        Bfs[1]=St;//start point setting
        Check[Bfs[1].x][Bfs[1].y][Bfs[1].w]=0; //start point is 0 
        Count=1; // count ++;
         
         
        for(int i=1;;i++){
            if(Count < i ) break;
             
            for (int j = 1; j <=3 ; ++j) {
                if(Bfs[i].x+Gox[Bfs[i].w]*j < 1 || Bfs[i].x + Gox[Bfs[i].w]*j > M) break;
                if(Bfs[i].y+Goy[Bfs[i].w]*j < 1 || Bfs[i].y + Goy[Bfs[i].w]*j > N) break;
                 
                if(S[Bfs[i].x+Gox[Bfs[i].w]*j][Bfs[i].y+Goy[Bfs[i].w]*j] == true) break;
                if(Check[Bfs[i].x+Gox[Bfs[i].w]*j][Bfs[i].y+Goy[Bfs[i].w]*j][Bfs[i].w]!=Integer.MAX_VALUE) continue;
                 
                Check[Bfs[i].x+Gox[Bfs[i].w]*j][Bfs[i].y+Goy[Bfs[i].w]*j][Bfs[i].w] = Check[Bfs[i].x][Bfs[i].y][Bfs[i].w]+1;
                Count++;
                Bfs[Count] = new positionInfo();
                Bfs[Count].x = Bfs[i].x + Gox[Bfs[i].w]*j;
                Bfs[Count].y = Bfs[i].y + Goy[Bfs[i].w]*j;
                Bfs[Count].w = Bfs[i].w;
            }
             
            for(int j = 1; j <=2; ++j){
                if(Check[Bfs[i].x][Bfs[i].y][Turn[Bfs[i].w][j]] != Integer.MAX_VALUE) continue;
             
                Check[Bfs[i].x][Bfs[i].y][Turn[Bfs[i].w][j]] = Check[Bfs[i].x][Bfs[i].y][Bfs[i].w]+1;
                Count++;
                Bfs[Count] = new positionInfo();
                Bfs[Count].x = Bfs[i].x;
                Bfs[Count].y = Bfs[i].y;
                Bfs[Count].w = Turn[Bfs[i].w][j];
            }
        }
         
    }
}
 
//position information
class positionInfo{
    public int x,y,w;
     
    public positionInfo(){x=0;y=0;w=0;}
};





// 5 6 
// 0 0 0 0 0 0 
// 0 1 1 0 1 0
// 0 1 0 0 0 0 
// 0 0 1 1 1 0 
// 1 0 0 0 0 0 
// 4 2 3 
// 2 4 1

