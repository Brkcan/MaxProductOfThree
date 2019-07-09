
public class MaxProductOfThree {
	public int solution() {
		 //int A[] = { -10, -2, -4 };
		 int A[] = { -3, 1, 2, -2, 5, 6 };
		int count = -10000;
		int temp = 0;
	
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				for (int k = j + 1; k < A.length; k++) {

					temp = A[i] * A[j] * A[k];

					if (count < temp) {
						count = temp;
					}
					temp = 0;

				}
			}
		}
	
		return count;
	}

	public static void main(String[] args) {
		MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
		System.out.println(maxProductOfThree.solution());
	}
}
