public class L71 {
	static int N = 5;
	static int[][] A = new int[N][N + 1];
	static int[] B = new int[N];

	public static void main(String[] args) {
		int min = 100;
		int min_i = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N ; j++) {
				A[i][j] = (int) (Math.random() * 30) - 15;
				if (min > A[i][j]) {
					min = A[i][j];
					min_i = j;
				}
			}
			B[i] = (int) (Math.random() * 30) - 15;
		}
		System.out.println(min + " " + min_i);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N ; j++) {
				System.out.format("%5d", A[i][j]);
			}
			System.out.println();

		}
		System.out.println();
		for (int i =0;i<N;i++){
			System.out.format("%5d", B[i]);
		}
		System.out.println();
		System.out.println();
		if (min_i == 0) {
			for (int i = 0; i < N; i++) {
				for (int j = N; j > min_i; j--) {
					A[i][j] = A[i][j - 1];
				}
				A[i][min_i] = B[i];
			}
		} else {
			for (int i = 0; i < N; i++) {
				for (int j = N; j > min_i; j--) {
					A[i][j] = A[i][j - 1];
				}
				A[i][min_i] = B[i];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N + 1; j++) {
				System.out.format("%5d", A[i][j]);
			}
			System.out.println();

		}

	}

}
