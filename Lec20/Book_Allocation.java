package Lec20;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] page = { 10, 20, 30, 40 };
		int nos = 2;
		System.out.println(minpage(page, nos));

	}

	public static int minpage(int[] page, int nos) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi = hi + page[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, nos, mid) == true) {

				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] page, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		int i = 0;
		while (i < page.length) {

			if (readpage + page[i] <= mid) {
				readpage += page[i];
				i++;
			} else {
				student++;
				readpage = 0;
			}
			if (student > nos) {
				return false;
			}

		}

		return true;

	}

}
