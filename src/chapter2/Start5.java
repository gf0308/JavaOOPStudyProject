package chapter2;

public class Start5 {
	static int share;		// int 형 변수 share를 static영역에 배치시켜 놓음 -> 자바에서의 규칙에 따라 static 영역의 int변수는 0이 자동으로 채워짐

	public static void main(String[] args) {
		share = 55;

		int k = fun(5,7);

		System.out.println(share);
	}

	private static int fun(int m, int p) {
		share = m + p;

		return m - p;
	}

}
