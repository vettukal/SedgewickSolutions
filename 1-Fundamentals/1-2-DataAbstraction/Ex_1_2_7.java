public class Ex_1_1_7{
	public static void main(String[] args){
		System.out.println(mystery("abcdef"));
		// Answer: defabc.
	}

	/**
	 * This function reverses the string recursively.
	 */

	public static String mystery(String s)
	{
		int N = s.length();
		if (N <= 1) return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}
}

