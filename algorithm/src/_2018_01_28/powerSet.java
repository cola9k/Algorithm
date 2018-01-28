package _2018_01_28;

public class powerSet {
	private static char data[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
	private static int n = data.length;
	private static boolean[] include = new boolean[n];

	public static void powerSet(int k) { // ���� ���� Ʈ���󿡼� ���� ���� ��ġ�� ǥ��
		if (k == n) { // �� ��ġ�� ��������Ͻ�
			for (int i = 0; i < n; i++)
				if (include[i])
					System.out.println(data[i] + " ");
			System.out.println();
			return;
		}
		include[k] = false;
		powerSet(k + 1); // �������� ������
		include[k] = true;
		powerSet(k + 1); // ���������� ������
	}
}
