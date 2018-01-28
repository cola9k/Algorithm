package _2018_01_28;

public class powerSet {
	private static char data[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
	private static int n = data.length;
	private static boolean[] include = new boolean[n];

	public static void powerSet(int k) { // 상태 공간 트리상에서 현재 나의 위치를 표현
		if (k == n) { // 내 위치가 리프노드일시
			for (int i = 0; i < n; i++)
				if (include[i])
					System.out.println(data[i] + " ");
			System.out.println();
			return;
		}
		include[k] = false;
		powerSet(k + 1); // 왼쪽으로 내려감
		include[k] = true;
		powerSet(k + 1); // 오른쪽으로 내려감
	}
}
