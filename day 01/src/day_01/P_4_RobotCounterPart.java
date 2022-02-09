package day_01;

import java.util.Scanner;
 /*명령 1. Go k
- k 는 1 2 또는 3일 수 있다. 현재 향하고 있는 방향으로 k 칸만큼 움직인다.

*명령 2. Turn dir 
- dir 은 left 또는 right 이며 각각 왼쪽 또는 오른쪽으로 90° 회전한다. 

공장 내 궤도가 설치되어 있는 상태가 아래와 같이 0과 1로 이루어진 직사각형 모양으로 로봇에게 입력된다. 
0은 궤도가 깔려 있어 로봇이 갈 수 있는 지점이고 1은 궤도가 없어 로봇이 갈 수 없는 지점이다. 
로봇이 (4, 2) 지점에서 남쪽을 향하고 있을 때 이 로봇을 (2, 4) 지점에서 동쪽으로 향하도록 이동시키는 것은 아래와 같이 9번의 명령으로 가능하다.

로봇의 현재 위치와 바라보는 방향이 주어졌을 때 로봇을 원하는 위치로 이동시키고 원하는 방향으로 바라보도록 하는데 최소 몇 번의 명령이 필요한지 구하는 프로그램을 작성하시오.

출처: https://dyndy.tistory.com/102?category=637368 [DY N DY]
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

