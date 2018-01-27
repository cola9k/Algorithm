package _2018_01_28;

// Decicsion Problem(미로찾기1)

public class Maze {
	private static int N=8;
	private static int [][] maze = {
			{0,0,0,0,0,0,0,1}, // 미로 라고 봄
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	
	private static final int PATHWAY_COLOUR = 0; // white
	private static final int WALL_COLOUR = 1; // blue
	private static final int BLOCKED_COLOUR = 2; // red
	private static final int PATH_COLOUR = 3; // green
	
	public static boolean findMazePath(int x, int y){
		if (x<0 || y<0 || x>=N) // 유효한 좌표 범위 확인
			return false;
		else if (maze[x][y] != PATHWAY_COLOUR)
			return false;
		else if (x==N-1 && y==N-1){ // 출구
			maze[x][y] = PATH_COLOUR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOUR;
			if (findMazePath(x-1,y) || findMazePath(x,y+1)
					||findMazePath(x+1,y) || findMazePath(x,y-1)){
				return true;
			} // 북 동 남 서 방향 순으로 확인
			maze[x][y] = BLOCKED_COLOUR; // dead end
			return false;
		}
	}
	
	public static void main(String[] args) {
//		printMaze();
		findMazePath(0,0); // 시작
//		printMaze();
	}
}